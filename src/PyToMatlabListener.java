import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class PyToMatlabListener extends PyGrammarParserBaseListener{
    StringBuilder matlabCode = new StringBuilder();
    private ParseTreeProperty<String> matlab = new ParseTreeProperty<>();
    public void setMatlab(ParseTree node, String value){matlab.put(node,value);}
    public String getMatlab(ParseTree node){return matlab.get(node);}
    public String getResult(){
        return matlabCode.toString();
    }

    @Override
    public void exitAssignment_stmt(PyGrammarParser.Assignment_stmtContext ctx) {
        System.out.println("Enter the exit assignment statement, ctx="+ctx.getText());
        setMatlab(ctx,ctx.getText());
        matlabCode.append(ctx.getText());
    }

    @Override
    public void exitFile_input(PyGrammarParser.File_inputContext ctx) {
        setMatlab(ctx,getMatlab(ctx.getChild(0)));
        matlabCode.append(ctx.getChild(0));
    }
}
