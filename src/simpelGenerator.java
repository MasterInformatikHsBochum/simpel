import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class simpelGenerator {
	public simpelGenerator() {}
	
	public String generate(ParseTree tree) {
		StringBuffer code = new StringBuffer();
		
		List<Integer> valueList = new ArrayList<Integer>();
        String operator = "";
        
        for (int i = 0; i < tree.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) tree.getChild(i);
			
			switch (typeNode.getSymbol().getType()) {
			case simpelLexer.NUM:
				valueList.add(Integer.parseInt(tree.getChild(i).getText()));
				break;
			case simpelLexer.OPERATOR:
				switch (tree.getChild(i).getText()) {
				case "+":
					operator = "ADD";
					break;
				case "-":
					operator = "SUB";
					break;
				case "*":
					operator = "MUL";
					break;
				case "/":
					operator = "DIV";
					break;
				}
				break;
			}
		}
        
        for (int value : valueList) {
        	code.append("LOAD " + value + ";");
        }
        
        code.append(operator);
		
		return code.toString();
	}
}
