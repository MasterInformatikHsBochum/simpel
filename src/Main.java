import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws IOException {
    	ANTLRFileStream inputFileStream = new ANTLRFileStream(args[0]);
    	System.out.println("input: " + inputFileStream.toString());
    	
    	simpelLexer lexer = new simpelLexer(inputFileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        simpelParser parser = new simpelParser(tokens);
        ParseTree tree = parser.expression();

        simpelGenerator generator = new simpelGenerator();
        String code = generator.generate(tree);
        
        System.out.println("generated code: " + code);
        
        AbstractStackMachine abstractStackMachine = new AbstractStackMachine();
        abstractStackMachine.execute(code);
    }
}
