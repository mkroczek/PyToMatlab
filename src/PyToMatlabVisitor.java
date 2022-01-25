import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PyToMatlabVisitor extends PyGrammarParserBaseVisitor<Object>{
    private StringBuilder codeBlock = new StringBuilder();
    private StringBuilder functionsBlock = new StringBuilder(); //has to be on the end of script
    private CompileContext compileContext;
    private boolean inSubscript = false;
    private boolean wasReturnValue = false;
    private int nReturnValues = 0;
    private int indents = 0;

    public String getCompiled(){
        return codeBlock.toString()+"\n"+functionsBlock.toString();
    }

    @Override
    public Object visitFile_input(PyGrammarParser.File_inputContext ctx) {
        compileContext = CompileContext.CODE;
        for (int i =0; i<ctx.stmt().size(); i++){
            visitStmt(ctx.stmt(i));
        }
        return null;
    }

    @Override
    public Object visitStmt(PyGrammarParser.StmtContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitSimple_stmts(PyGrammarParser.Simple_stmtsContext ctx) {
        appendTabs();
        visitSimple_stmt(ctx.simple_stmt());
        newline(currentBuilder());
        return null;
    }

    @Override
    public Object visitSimple_stmt(PyGrammarParser.Simple_stmtContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitAssignment_stmt(PyGrammarParser.Assignment_stmtContext ctx) {
        visitTest(ctx.test(0));
        append("=");
        if (ctx.assignment_op() != null){
            switch(ctx.assignment_op().start.getType()){
                case PyGrammarLexer.ADD_ASSIGN -> append(ctx.test(0).getText()+"+");
                case PyGrammarLexer.SUB_ASSIGN -> append(ctx.test(0).getText()+"-");
                case PyGrammarLexer.MULT_ASSIGN -> append(ctx.test(0).getText()+"*");
                case PyGrammarLexer.DIV_ASSIGN -> append(ctx.test(0).getText()+"/");
            }
        }
        visitTest(ctx.test(1));
        return null;
    }

    @Override
    public Object visitFlow_stmt(PyGrammarParser.Flow_stmtContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitBreak_stmt(PyGrammarParser.Break_stmtContext ctx) {
        append(ctx.getText());
        return null;
    }

    @Override public Object visitContinue_stmt(PyGrammarParser.Continue_stmtContext ctx) {
        append(ctx.getText());
        return null;
    }

    @Override
    public Object visitReturn_stmt(PyGrammarParser.Return_stmtContext ctx) {
        if (ctx.test() != null){
            //single return value
            append("res=");
            visitTest(ctx.test());
            wasReturnValue = true;
            nReturnValues = 1;
        }
        else if (ctx.arglist() != null){
            //multiple return values
            CompileContext previous = compileContext;
            compileContext = CompileContext.RETURN;
            visitArglist(ctx.arglist());
            compileContext = previous;
            wasReturnValue = true;
        }
        else {
            append("return");
        }
        return null;
    }

    @Override
    public Object visitExpr_stmt(PyGrammarParser.Expr_stmtContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitCompound_stmt(PyGrammarParser.Compound_stmtContext ctx) {
        if (ctx.func_def() != null){
            CompileContext previous = compileContext;
            compileContext = CompileContext.FUNCTION;
            appendTabs();
            visitChildren(ctx);
            if (compileContext == CompileContext.FUNCTION)
                System.out.println("I create newline in function context");
            newline(currentBuilder());
            compileContext = previous;
        }
        else{
            appendTabs();
            visitChildren(ctx);
            newline(currentBuilder());
        }
        return null;
    }

    @Override
    public Object visitIf_stmt(PyGrammarParser.If_stmtContext ctx) {
        append("if ");
        visitTest(ctx.test(0));
        newline(currentBuilder());
        visitBlock(ctx.block(0));
        int elifCount = ctx.ELIF().size();
        for (int i=0; i < elifCount; i++){
            appendTabs();
            append("elseif ");
            visitTest(ctx.test(i+1));
            newline(currentBuilder());
            visitBlock(ctx.block(i+1));
        }
        if (ctx.ELSE() != null){
            appendTabs();
            append("else ");
            newline(currentBuilder());
            visitBlock(ctx.block(elifCount+1));
        }
        appendTabs();
        append("end");
        return null;
    }

    @Override
    public Object visitWhile_stmt(PyGrammarParser.While_stmtContext ctx) {
        append("while ");
        visitTest(ctx.test());
        newline(currentBuilder());
        visitBlock(ctx.block());
        appendTabs();
        append("end");
        return null;
    }

    @Override
    public Object visitFor_stmt(PyGrammarParser.For_stmtContext ctx) {
        append("for ");
        append(ctx.IDENTIFIER().getText()+" = ");
        if (ctx.test() != null)
            visitTest(ctx.test());
        else if (ctx.range_fun_call() != null)
            visitRange_fun_call(ctx.range_fun_call());
        newline(currentBuilder());
        visitBlock(ctx.block());
        append("end");
        return null;
    }

    @Override public Object visitFunc_def(PyGrammarParser.Func_defContext ctx) {
        append("function ");
        PositionPointer returnValuePointer = new PositionPointer(currentBuilder(), currentBuilder().length());
        append(ctx.IDENTIFIER().getText()+"(");
        if(ctx.arglist() != null){
            visitArglist(ctx.arglist());
        }
        append(")");
        newline(currentBuilder());
        visitBlock(ctx.block());
        append("end");
        if (wasReturnValue){
            wasReturnValue = false;
            if (nReturnValues == 1)
                returnValuePointer.insert("res=");
            else if (nReturnValues > 1)
                returnValuePointer.insert("["+IntStream.range(0,nReturnValues)
                        .mapToObj(i->"res"+((Integer) i).toString())
                        .collect(Collectors.joining(","))+"]=");
            nReturnValues = 0;
            }
        return null;
    }

    @Override
    public Object visitTest(PyGrammarParser.TestContext ctx) {
        visitChildren(ctx);
        if (inSubscript)
            append("+1");
        return null;
    }

    @Override
    public Object visitOr_test(PyGrammarParser.Or_testContext ctx) {
        visitAnd_test(ctx.and_test(0));
        for(int i = 1; i < ctx.and_test().size(); i++){
            append("||");
            visitAnd_test(ctx.and_test(i));
        }
        return null;
    }

    @Override
    public Object visitAnd_test(PyGrammarParser.And_testContext ctx) {
        visitNot_test(ctx.not_test(0));
        for(int i = 1; i < ctx.not_test().size(); i++){
            append("&&");
            visitNot_test(ctx.not_test(i));
        }
        return null;
    }

    @Override
    public Object visitNot_test(PyGrammarParser.Not_testContext ctx) {
        if (ctx.not_test() != null){
            append("~");
            visitNot_test(ctx.not_test());
        }
        else if (ctx.comparison() != null){
            visitComparison(ctx.comparison());
        }
        return null;
    }

    @Override
    public Object visitComparison(PyGrammarParser.ComparisonContext ctx) {
        visitExpr(ctx.expr(0));
        for (int i = 0; i<ctx.comp_op().size(); i++){
            visitComp_op(ctx.comp_op(i));
            visitExpr(ctx.expr(i+1));
        }
        return null;
    }

    @Override
    public Object visitComp_op(PyGrammarParser.Comp_opContext ctx) {
        if(ctx.NOT_EQ_2() != null){
            append("~=");
        }
        else {
            append(ctx.getText());
        }
        return null;
    }

    @Override
    public Object visitExpr(PyGrammarParser.ExprContext ctx) {
        visitArithm_expr(ctx.arithm_expr());
        return null;
    }

    @Override
    public Object visitArithm_expr(PyGrammarParser.Arithm_exprContext ctx) {
        visitTerm(ctx.term(0));
        for (int i = 0; i<ctx.add_op().size(); i++){
            visitAdd_op(ctx.add_op(0));
            visitTerm(ctx.term(i+1));
        }
        return null;
    }

    @Override public Object visitAdd_op(PyGrammarParser.Add_opContext ctx) {
        append(ctx.getText());
        return null;
    }

    @Override
    public Object visitTerm(PyGrammarParser.TermContext ctx) {
        PositionPointer beforeModPointer = new PositionPointer(currentBuilder(), currentBuilder().length());
        visitFactor(ctx.factor(0));
        for (int i = 0; i<ctx.mul_op().size(); i++){
            if (ctx.mul_op(i).start.getType() == PyGrammarLexer.MOD){
                beforeModPointer.insert("mod(");
                append(",");
                visitFactor(ctx.factor(i+1));
                append(")");
            }
            else{
                visitMul_op(ctx.mul_op(i));
                beforeModPointer = new PositionPointer(currentBuilder(), currentBuilder().length());
                visitFactor(ctx.factor(i+1));
            }
        }
        return null;
    }

    @Override
    public Object visitMul_op(PyGrammarParser.Mul_opContext ctx) {
        if (ctx.IDIV() != null){
            append("/");
        }
        else
            append(ctx.getText());
        return null;
    }

    @Override
    public Object visitFactor(PyGrammarParser.FactorContext ctx) {
        if (ctx.factor() != null){
            if (ctx.ADD() != null)
                append("+");
            if (ctx.MINUS() != null)
                append("-");
            visitFactor(ctx.factor());
        }
        else if (ctx.power() != null){
            visitPower(ctx.power());
        }
        return null;
    }

    @Override
    public Object visitPower(PyGrammarParser.PowerContext ctx) {
        visitAtom_expr(ctx.atom_expr());
        if (ctx.factor() != null){
            append(".^");
            visitFactor(ctx.factor());
        }
        return null;
    }

    @Override
    public Object visitAtom_expr(PyGrammarParser.Atom_exprContext ctx) {
        visitAtom(ctx.atom());
        if(ctx.trailer() != null)
            visitTrailer(ctx.trailer());
        return null;
    }

    @Override
    public Object visitAtom(PyGrammarParser.AtomContext ctx) {
        if (ctx.children.get(0) instanceof TerminalNode){
            switch (((TerminalNode) ctx.children.get(0)).getSymbol().getType()){
                case PyGrammarParser.STRING -> append(parseString(ctx.children.get(0).getText()));
                case PyGrammarParser.TRUE -> append("true");
                case PyGrammarParser.FALSE -> append("false");
                case PyGrammarParser.NONE -> append("NaN");
//                case PyGrammarParser.IDENTIFIER -> {
//                    if (inSubscript){
//                        append(ctx.IDENTIFIER().getText()+"+1");
//                    }
//                    else {
//                        append(ctx.IDENTIFIER().getText());
//                    }
//                }
//                case PyGrammarParser.NUMBER -> {
//                    if (inSubscript){
//                        append(String.valueOf(Integer.parseInt(ctx.NUMBER().getText())+1));
//                    }
//                    else {
//                        append(ctx.NUMBER().getText());
//                    }
//                }
                default -> append(ctx.children.get(0).getText());
            }
        }
        else
            visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitFun_call(PyGrammarParser.Fun_callContext ctx) {
        append(ctx.IDENTIFIER().getText());
        visitPar_arguments(ctx.par_arguments());
        return null;
    }

    @Override
    public Object visitPar_arguments(PyGrammarParser.Par_argumentsContext ctx) {
        append("(");
        if (ctx.arglist() != null)
            visitArglist(ctx.arglist());
        append(")");
        return null;
    }

    @Override
    public Object visitBuilt_fun_call(PyGrammarParser.Built_fun_callContext ctx) {
        if (ctx.LEN() != null){
            append("length(");
            visitArgument(ctx.argument());
            append(")");
        }
        else if (ctx.PRINT() != null){
            append("disp(");
            visitArgument(ctx.argument());
            append(")");
        }
        return null;
    }

    @Override
    public Object visitRange_fun_call(PyGrammarParser.Range_fun_callContext ctx) {
        if (ctx.argument().size() == 1){
            append("0:");
            visitArgument(ctx.argument(0));
            append("-1");
        }
        else if (ctx.argument().size() == 2){
            visitArgument(ctx.argument(0));
            append(":");
            visitArgument(ctx.argument(1));
            append("-1");
        }
        else if (ctx.argument().size() == 3){
            visitArgument(ctx.argument(0));
            append(":");
            visitArgument(ctx.argument(2));
            append(":");
            visitArgument(ctx.argument(1));
            append("-1");
        }
        return null;
    }

    @Override
    public Object visitArgument(PyGrammarParser.ArgumentContext ctx) {
        if (ctx.IDENTIFIER() != null)
            append(ctx.getText());
        else
            visitTest(ctx.test());
        return null;
    }

    @Override
    public Object visitList2d(PyGrammarParser.List2dContext ctx) {
        append("[");
        visitList(ctx.list(0));
        for (int i = 0; i < ctx.COMMA().size(); i++){
            append(";");
            visitList(ctx.list(i+1));
        }
        append("]");
        return null;
    }

    @Override
    public Object visitList(PyGrammarParser.ListContext ctx) {
        append("[");
        if (ctx.arglist() != null)
            visitArglist(ctx.arglist());
        append("]");
        return null;
    }

    @Override
    public Object visitTrailer(PyGrammarParser.TrailerContext ctx) {
        if (ctx.par_arguments() != null)
            visitPar_arguments(ctx.par_arguments());
        append("(");
        for (int i = 0; i < ctx.subscriptlist().size(); i++){
            visitSubscriptlist(ctx.subscriptlist(i));
            if (i != ctx.subscriptlist().size()-1)
                append(",");
        }
        append(")");
        return null;
    }

    @Override public Object visitSubscriptlist(PyGrammarParser.SubscriptlistContext ctx) {
        visitSubscript_(ctx.subscript_(0));
        for (int i = 0; i < ctx.COMMA().size(); i++){
            append(",");
            visitSubscript_(ctx.subscript_(i+1));
        }
        return null;
    }

    @Override
    public Object visitSubscript_(PyGrammarParser.Subscript_Context ctx) {
        inSubscript = true;
        visitChildren(ctx);
        inSubscript = false;
        return null;
    }

    @Override
    public Object visitSlice(PyGrammarParser.SliceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitArglist(PyGrammarParser.ArglistContext ctx) {
        if (compileContext == CompileContext.RETURN){
            for (int i = 0; i < ctx.argument().size(); i++){
                if (i != 0)
                    appendTabs();
                append("res"+i+"=");
                visitArgument(ctx.argument(i));
                if (i != ctx.argument().size()-1)
                    newline(currentBuilder());
            }
            nReturnValues = ctx.argument().size();
        }
        else{
            visitArgument(ctx.argument(0));
            for (int i = 0; i < ctx.COMMA().size(); i++){
                append(",");
                visitArgument(ctx.argument(i+1));
            }
        }
        return null;
    }

    @Override
    public Object visitBlock(PyGrammarParser.BlockContext ctx) {
        if (ctx.simple_stmt() != null)
            visitSimple_stmt(ctx.simple_stmt());
        else{
            addIndent();
            for (int i = 0; i < ctx.stmt().size(); i++){
                visitStmt(ctx.stmt(i));
            }
            addDedent();
        }
        return null;
    }

    private String parseString(String string){
        return string.replace('"', '\'');
    }

    private void addIndent(){
        indents+=1;
    }

    private void addDedent(){
        indents-=1;
    }

    private void appendTabs(){
        currentBuilder().append("\t".repeat(indents));
    }

    private void append(String text){
//        currentBuilder().append("\t".repeat(indents));
        currentBuilder().append(text);
    }

    private void newline(StringBuilder builder){
        builder.append("\n");
    }

    private StringBuilder currentBuilder(){
        return switch (compileContext) {
            case CODE -> codeBlock;
            case FUNCTION -> functionsBlock;
            case RETURN -> functionsBlock;
        };
    }
}
