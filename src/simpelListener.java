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
	/**
	 * Enter a parse tree produced by {@link simpelParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(simpelParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(simpelParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(simpelParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(simpelParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(simpelParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(simpelParser.CalculationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(simpelParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(simpelParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(simpelParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(simpelParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(simpelParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(simpelParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#inputsimpel}.
	 * @param ctx the parse tree
	 */
	void enterInputsimpel(simpelParser.InputsimpelContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#inputsimpel}.
	 * @param ctx the parse tree
	 */
	void exitInputsimpel(simpelParser.InputsimpelContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#outputsimpel}.
	 * @param ctx the parse tree
	 */
	void enterOutputsimpel(simpelParser.OutputsimpelContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#outputsimpel}.
	 * @param ctx the parse tree
	 */
	void exitOutputsimpel(simpelParser.OutputsimpelContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpelParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(simpelParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpelParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(simpelParser.LoopContext ctx);
}