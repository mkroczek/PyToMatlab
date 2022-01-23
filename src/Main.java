import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("test/matlab_test.py");
        PyGrammarLexer lexer = new PyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyGrammarParser parser = new PyGrammarParser(tokens);
        ParseTree parseTree = parser.file_input();

        //generated tree
        System.out.println(parseTree.getText());

        PyToMatlabVisitor compiler = new PyToMatlabVisitor();
        parseTree.accept(compiler);

        System.out.println("\nTranslation part");
        System.out.println(compiler.getCompiled());
    }
}
