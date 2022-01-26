import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = args[0];

        CharStream input = CharStreams.fromFileName(filename);
        PyGrammarLexer lexer = new PyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyGrammarParser parser = new PyGrammarParser(tokens);
        parser.addErrorListener(new ParsingErrorListener());
        ParseTree parseTree = parser.file_input();

        //compile code to matlab script
        PyToMatlabVisitor compiler = new PyToMatlabVisitor();
        parseTree.accept(compiler);

//        System.out.println("\nTranslation part");
//        System.out.println(compiler.getCompiled());
        String matlabFilename = filename.substring(0,filename.indexOf("."))+".m";
        try {
            FileWriter writer = new FileWriter(matlabFilename, false);
            writer.write(compiler.getCompiled());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
