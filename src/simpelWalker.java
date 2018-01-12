public class simpelWalker extends simpelBaseListener {
	public void enterExpression(simpelParser.ExpressionContext ctx) {
		System.out.println("Entering expression: " + ctx.VARIABLE().getText());
	}

	public void exitExpression(simpelParser.ExpressionContext ctx) {
		System.out.println("Exiting expression");
	}
}
