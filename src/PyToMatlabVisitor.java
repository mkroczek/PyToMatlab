import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.function.ToDoubleBiFunction;

public class PyToMatlabVisitor extends PyGrammarParserBaseVisitor<Object>{
    private StringBuilder codeBlock = new StringBuilder();
    private StringBuilder functionsBlock = new StringBuilder(); //has to be on the end of script
    private CompileContext compileContext;
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
        append(ctx.IDENTIFIER().getText());
        append("=");
        if (ctx.assignment_op() != null){
            switch(ctx.assignment_op().start.getType()){
                case PyGrammarLexer.ADD_ASSIGN -> append(ctx.IDENTIFIER().getText()+"+");
                case PyGrammarLexer.SUB_ASSIGN -> append(ctx.IDENTIFIER().getText()+"-");
                case PyGrammarLexer.MULT_ASSIGN -> append(ctx.IDENTIFIER().getText()+"*");
                case PyGrammarLexer.DIV_ASSIGN -> append(ctx.IDENTIFIER().getText()+"/");
            }
        }
        visitTest(ctx.test());
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
        append("res"+"=");
        if (ctx.test() != null){
            visitTest(ctx.test());
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
        appendTabs();
        visitChildren(ctx);
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
            append("elseif ");
            visitTest(ctx.test(i+1));
            newline(currentBuilder());
            visitBlock(ctx.block(0));
        }
        if (ctx.ELSE() != null){
            append("else ");
            newline(currentBuilder());
            visitBlock(ctx.block(elifCount+1));
        }
        append("end");
        newline(currentBuilder());
        return null;
    }

    @Override
    public Object visitWhile_stmt(PyGrammarParser.While_stmtContext ctx) {
        append("while ");
        visitTest(ctx.test());
        newline(currentBuilder());
        visitBlock(ctx.block());
        append("end");
        newline(currentBuilder());
        return null;
    }

    @Override
    public Object visitFor_stmt(PyGrammarParser.For_stmtContext ctx) {
        //TODO: dodac range jako token i zamieniac go na 1:range(x)
        append("for ");
        append(ctx.IDENTIFIER().getText()+" = ");
        visitTest(ctx.test());
        newline(currentBuilder());
        visitBlock(ctx.block());
        append("end");
        newline(currentBuilder());
        return null;
    }

    @Override public Object visitFunc_def(PyGrammarParser.Func_defContext ctx) {
        //TODO: dodac return
        compileContext = CompileContext.FUNCTION;
        append("function res = ");
        append(ctx.IDENTIFIER().getText()+"(");
        if(ctx.arglist() != null){
            visitArglist(ctx.arglist());
        }
        append(")");
        newline(currentBuilder());
        visitBlock(ctx.block());
        append("end");
        compileContext = CompileContext.CODE;
        return null;
    }

    @Override
    public Object visitTest(PyGrammarParser.TestContext ctx) {
        visitChildren(ctx);
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
        visitFactor(ctx.factor(0));
        for (int i = 0; i<ctx.mul_op().size(); i++){
            visitMul_op(ctx.mul_op(0));
            visitFactor(ctx.factor(i+1));
        }
        return null;
    }

    @Override
    public Object visitMul_op(PyGrammarParser.Mul_opContext ctx) {
        //TODO: dodac obsluge modulo i dzielenia calkowitoliczbowego
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
            append("size(");
            visitArgument(ctx.argument());
            append(",1)");
        }
        else if (ctx.PRINT() != null){
            append("disp(");
            visitArgument(ctx.argument());
            append(")");
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
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitSlice(PyGrammarParser.SliceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitArglist(PyGrammarParser.ArglistContext ctx) {
        visitArgument(ctx.argument(0));
        for (int i = 0; i < ctx.COMMA().size(); i++){
            append(",");
            visitArgument(ctx.argument(i+1));
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
        };
    }
}
