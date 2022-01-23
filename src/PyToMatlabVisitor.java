public class PyToMatlabVisitor extends PyGrammarParserBaseVisitor<Object>{
    private StringBuilder codeBlock = new StringBuilder();
    private StringBuilder functionsBlock = new StringBuilder(); //has to be on the end of script
    private CompileContext compileContext;

    public String getCompiled(){
        return codeBlock.toString()+functionsBlock.toString();
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
        currentBuilder().append(ctx.getText());
        return null;
    }

    @Override
    public Object visitCompound_stmt(PyGrammarParser.Compound_stmtContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitIf_stmt(PyGrammarParser.If_stmtContext ctx) {
        currentBuilder().append("if ");
        visitTest(ctx.test(0));
        newline(currentBuilder());
        visitBlock(ctx.block(0));
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
            currentBuilder().append("||");
            visitAnd_test(ctx.and_test(i));
        }
        return null;
    }

    @Override
    public Object visitAnd_test(PyGrammarParser.And_testContext ctx) {
        visitNot_test(ctx.not_test(0));
        for(int i = 1; i < ctx.not_test().size(); i++){
            currentBuilder().append("&&");
            visitNot_test(ctx.not_test(i));
        }
        return null;
    }

    @Override
    public Object visitNot_test(PyGrammarParser.Not_testContext ctx) {
        if (ctx.not_test() != null){
            currentBuilder().append("~");
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
            currentBuilder().append("~=");
        }
        else {
            currentBuilder().append(ctx);
        }
        return null;
    }

    @Override
    public Object visitExpr(PyGrammarParser.ExprContext ctx) {

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
