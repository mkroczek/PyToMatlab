import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("test/simple_test.py");
        PyGrammarLexer lexer = new PyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyGrammarParser parser = new PyGrammarParser(tokens);
        ParseTree parseTree = parser.file_input();

        System.out.println(parseTree.getText());
    }
}
