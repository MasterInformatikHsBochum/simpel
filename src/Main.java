import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws IOException {
    	simpelLexer lexer = new simpelLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simpelParser parser = new simpelParser(tokens);
        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new simpelWalker(), tree);
    }
}
