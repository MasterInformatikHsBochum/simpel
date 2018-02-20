import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
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
        ParseTree tree = parser.decision();
        
        
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);        
        
        
        simpelGenerator generator = new simpelGenerator();
        String code = generator.generate(tree);
        
        System.out.println("generated code: " + code);
        
        AbstractStackMachine abstractStackMachine = new AbstractStackMachine();
        abstractStackMachine.execute(code);
    }
}
