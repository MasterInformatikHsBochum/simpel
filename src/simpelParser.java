// Generated from simpel.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		VARIABLE=10, OPTION=11, BREAK=12, COLON=13, IF=14, NUM=15, OPERATOR=16, 
		WS=17, STRING=18, COMMENT=19;
	public static final int
		RULE_expression = 0, RULE_function = 1, RULE_application = 2, RULE_scope = 3, 
		RULE_decision = 4, RULE_condition = 5, RULE_var = 6, RULE_calculation = 7, 
		RULE_num = 8, RULE_op = 9, RULE_string = 10, RULE_inputsimpel = 11, RULE_outputsimpel = 12, 
		RULE_loop = 13;
	public static final String[] ruleNames = {
		"expression", "function", "application", "scope", "decision", "condition", 
		"var", "calculation", "num", "op", "string", "inputsimpel", "outputsimpel", 
		"loop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func '", "'('", "')'", "'$'", "'\"'", "'in->'", "'out<-'", "'while('", 
		"'):'", null, "'|'", "';'", "':'", "'if '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
		"OPTION", "BREAK", "COLON", "IF", "NUM", "OPERATOR", "WS", "STRING", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "simpel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ApplicationContext> application() {
			return getRuleContexts(ApplicationContext.class);
		}
		public ApplicationContext application(int i) {
			return getRuleContext(ApplicationContext.class,i);
		}
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public List<DecisionContext> decision() {
			return getRuleContexts(DecisionContext.class);
		}
		public DecisionContext decision(int i) {
			return getRuleContext(DecisionContext.class,i);
		}
		public List<InputsimpelContext> inputsimpel() {
			return getRuleContexts(InputsimpelContext.class);
		}
		public InputsimpelContext inputsimpel(int i) {
			return getRuleContext(InputsimpelContext.class,i);
		}
		public List<OutputsimpelContext> outputsimpel() {
			return getRuleContexts(OutputsimpelContext.class);
		}
		public OutputsimpelContext outputsimpel(int i) {
			return getRuleContext(OutputsimpelContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(28);
				var();
				}
				break;
			case 2:
				{
				setState(29);
				function();
				}
				break;
			case 3:
				{
				setState(30);
				application();
				}
				break;
			case 4:
				{
				setState(31);
				calculation();
				}
				break;
			case 5:
				{
				setState(32);
				decision();
				}
				break;
			case 6:
				{
				setState(33);
				inputsimpel();
				}
				break;
			case 7:
				{
				setState(34);
				outputsimpel();
				}
				break;
			case 8:
				{
				setState(35);
				loop();
				}
				break;
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << IF) | (1L << NUM))) != 0)) {
				{
				setState(46);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(38);
					var();
					}
					break;
				case 2:
					{
					setState(39);
					function();
					}
					break;
				case 3:
					{
					setState(40);
					application();
					}
					break;
				case 4:
					{
					setState(41);
					calculation();
					}
					break;
				case 5:
					{
					setState(42);
					decision();
					}
					break;
				case 6:
					{
					setState(43);
					inputsimpel();
					}
					break;
				case 7:
					{
					setState(44);
					outputsimpel();
					}
					break;
				case 8:
					{
					setState(45);
					loop();
					}
					break;
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(simpelParser.VARIABLE, 0); }
		public TerminalNode COLON() { return getToken(simpelParser.COLON, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(simpelParser.BREAK, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				match(VARIABLE);
				setState(53);
				match(COLON);
				setState(54);
				scope();
				setState(55);
				match(BREAK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(57);
				match(T__0);
				setState(58);
				match(VARIABLE);
				setState(59);
				match(COLON);
				setState(60);
				string();
				setState(61);
				match(BREAK);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplicationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitApplication(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_application);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(66);
			expression();
			setState(67);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(simpelParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(simpelParser.COLON, 0); }
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public TerminalNode OPTION() { return getToken(simpelParser.OPTION, 0); }
		public TerminalNode BREAK() { return getToken(simpelParser.BREAK, 0); }
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterDecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitDecision(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IF);
			setState(72);
			condition();
			setState(73);
			match(COLON);
			setState(74);
			scope();
			setState(75);
			match(OPTION);
			setState(76);
			scope();
			setState(77);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			calculation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(simpelParser.VARIABLE, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__3);
			setState(82);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculationContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitCalculation(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_calculation);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(86);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(84);
					num();
					}
					break;
				case T__3:
					{
					setState(85);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88);
				op();
				setState(91);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(89);
					num();
					}
					break;
				case T__3:
					{
					setState(90);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(95);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(93);
					var();
					}
					break;
				case NUM:
					{
					setState(94);
					num();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97);
				op();
				setState(98);
				calculation();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				num();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				var();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(simpelParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(simpelParser.OPERATOR, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(simpelParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__4);
			setState(109);
			match(STRING);
			setState(110);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputsimpelContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public InputsimpelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputsimpel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterInputsimpel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitInputsimpel(this);
		}
	}

	public final InputsimpelContext inputsimpel() throws RecognitionException {
		InputsimpelContext _localctx = new InputsimpelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inputsimpel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__5);
			setState(113);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputsimpelContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OutputsimpelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputsimpel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterOutputsimpel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitOutputsimpel(this);
		}
	}

	public final OutputsimpelContext outputsimpel() throws RecognitionException {
		OutputsimpelContext _localctx = new OutputsimpelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_outputsimpel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__6);
			setState(116);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(simpelParser.BREAK, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpelListener ) ((simpelListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__7);
			setState(119);
			condition();
			setState(120);
			match(T__8);
			setState(121);
			scope();
			setState(122);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\'\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\61\n\2\f\2\16\2\64\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\5\tY\n\t\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\5\tb\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\ti\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\2\u0086\2&\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2\nI"+
		"\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26"+
		"n\3\2\2\2\30r\3\2\2\2\32u\3\2\2\2\34x\3\2\2\2\36\'\5\16\b\2\37\'\5\4\3"+
		"\2 \'\5\6\4\2!\'\5\20\t\2\"\'\5\n\6\2#\'\5\30\r\2$\'\5\32\16\2%\'\5\34"+
		"\17\2&\36\3\2\2\2&\37\3\2\2\2& \3\2\2\2&!\3\2\2\2&\"\3\2\2\2&#\3\2\2\2"+
		"&$\3\2\2\2&%\3\2\2\2\'\62\3\2\2\2(\61\5\16\b\2)\61\5\4\3\2*\61\5\6\4\2"+
		"+\61\5\20\t\2,\61\5\n\6\2-\61\5\30\r\2.\61\5\32\16\2/\61\5\34\17\2\60"+
		"(\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2"+
		"\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\3\3\2\2\2\64\62\3\2\2\2\65\66\7\3\2\2\66\67\7\f\2\2\678\7\17\2\289\5"+
		"\b\5\29:\7\16\2\2:B\3\2\2\2;<\7\3\2\2<=\7\f\2\2=>\7\17\2\2>?\5\26\f\2"+
		"?@\7\16\2\2@B\3\2\2\2A\65\3\2\2\2A;\3\2\2\2B\5\3\2\2\2CD\7\4\2\2DE\5\2"+
		"\2\2EF\7\5\2\2F\7\3\2\2\2GH\5\2\2\2H\t\3\2\2\2IJ\7\20\2\2JK\5\f\7\2KL"+
		"\7\17\2\2LM\5\b\5\2MN\7\r\2\2NO\5\b\5\2OP\7\16\2\2P\13\3\2\2\2QR\5\20"+
		"\t\2R\r\3\2\2\2ST\7\6\2\2TU\7\f\2\2U\17\3\2\2\2VY\5\22\n\2WY\5\16\b\2"+
		"XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Z]\5\24\13\2[^\5\22\n\2\\^\5\16\b\2][\3"+
		"\2\2\2]\\\3\2\2\2^i\3\2\2\2_b\5\16\b\2`b\5\22\n\2a_\3\2\2\2a`\3\2\2\2"+
		"bc\3\2\2\2cd\5\24\13\2de\5\20\t\2ei\3\2\2\2fi\5\22\n\2gi\5\16\b\2hX\3"+
		"\2\2\2ha\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\21\3\2\2\2jk\7\21\2\2k\23\3\2\2"+
		"\2lm\7\22\2\2m\25\3\2\2\2no\7\7\2\2op\7\24\2\2pq\7\7\2\2q\27\3\2\2\2r"+
		"s\7\b\2\2st\5\16\b\2t\31\3\2\2\2uv\7\t\2\2vw\5\16\b\2w\33\3\2\2\2xy\7"+
		"\n\2\2yz\5\f\7\2z{\7\13\2\2{|\5\b\5\2|}\7\16\2\2}\35\3\2\2\2\n&\60\62"+
		"AX]ah";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}