// Generated from simpel.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpelParser}.
 */
public interface simpelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simpelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simpelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(simpelParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(simpelParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(simpelParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(simpelParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(simpelParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(simpelParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(simpelParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(simpelParser.DecisionContext ctx);
}