// Generated from C:/Users/user/IdeaProjects/Task2/src\SExpressions.g4 by ANTLR 4.9.1
package main.java;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SExpressionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IntType=7, BoolType=8, 
		UnitType=9, FunDecl=10, IfStmt=11, BinOpExpr=12, WhileLoop=13, RepeatLoop=14, 
		Asgmt=15, FunInvoc=16, Skip=17, Comma=18, Eq=19, Less=20, Gtr=21, LessEq=22, 
		GtrEq=23, Plus=24, Times=25, Minus=26, Div=27, And=28, Or=29, Xor=30, 
		Idfr=31, IntLit=32, WS=33;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_typed_idfr = 2, RULE_type = 3, RULE_block = 4, 
		RULE_expr = 5, RULE_identifier = 6, RULE_integer = 7, RULE_binop = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "typed_idfr", "type", "block", "expr", "identifier", "integer", 
			"binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'Idfr(\"'", "'\")'", "'IntLit('", "')'", "'IntType'", 
			"'BoolType'", "'UnitType'", "'FunDecl'", "'IfStmt'", "'BinOpExpr'", "'WhileLoop'", 
			"'RepeatLoop'", "'Asgmt'", "'FunInvoc'", "'Skip'", "','", "'Eq'", "'Less'", 
			"'Gtr'", "'LessEq'", "'GtrEq'", "'Plus'", "'Times'", "'Minus'", "'Div'", 
			"'And'", "'Or'", "'Xor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IntType", "BoolType", "UnitType", 
			"FunDecl", "IfStmt", "BinOpExpr", "WhileLoop", "RepeatLoop", "Asgmt", 
			"FunInvoc", "Skip", "Comma", "Eq", "Less", "Gtr", "LessEq", "GtrEq", 
			"Plus", "Times", "Minus", "Div", "And", "Or", "Xor", "Idfr", "IntLit", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SExpressions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public DecContext dec;
		public List<DecContext> decs = new ArrayList<DecContext>();
		public TerminalNode EOF() { return getToken(SExpressionsParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			((ProgContext)_localctx).dec = dec();
			((ProgContext)_localctx).decs.add(((ProgContext)_localctx).dec);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(20);
				match(Comma);
				setState(21);
				((ProgContext)_localctx).dec = dec();
				((ProgContext)_localctx).decs.add(((ProgContext)_localctx).dec);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(T__1);
			setState(28);
			match(EOF);
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

	public static class DecContext extends ParserRuleContext {
		public Typed_idfrContext typed_idfr;
		public List<Typed_idfrContext> params = new ArrayList<Typed_idfrContext>();
		public TerminalNode FunDecl() { return getToken(SExpressionsParser.FunDecl, 0); }
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Typed_idfrContext> typed_idfr() {
			return getRuleContexts(Typed_idfrContext.class);
		}
		public Typed_idfrContext typed_idfr(int i) {
			return getRuleContext(Typed_idfrContext.class,i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(FunDecl);
			setState(32);
			match(Comma);
			setState(33);
			identifier();
			setState(34);
			match(Comma);
			setState(35);
			type();
			setState(36);
			match(Comma);
			setState(37);
			match(T__0);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(38);
				((DecContext)_localctx).typed_idfr = typed_idfr();
				((DecContext)_localctx).params.add(((DecContext)_localctx).typed_idfr);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(39);
					match(Comma);
					setState(40);
					((DecContext)_localctx).typed_idfr = typed_idfr();
					((DecContext)_localctx).params.add(((DecContext)_localctx).typed_idfr);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(48);
			match(T__1);
			setState(49);
			match(Comma);
			setState(50);
			block();
			setState(51);
			match(T__1);
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

	public static class Typed_idfrContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SExpressionsParser.Comma, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_idfrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_idfr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterTyped_idfr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitTyped_idfr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitTyped_idfr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_idfrContext typed_idfr() throws RecognitionException {
		Typed_idfrContext _localctx = new Typed_idfrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typed_idfr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			identifier();
			setState(55);
			match(Comma);
			setState(56);
			type();
			setState(57);
			match(T__1);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IntType() { return getToken(SExpressionsParser.IntType, 0); }
		public TerminalNode BoolType() { return getToken(SExpressionsParser.BoolType, 0); }
		public TerminalNode UnitType() { return getToken(SExpressionsParser.UnitType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << UnitType))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlockContext extends ParserRuleContext {
		public Types t = Types.UNKNOWN;
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << Skip))) != 0)) {
				{
				setState(62);
				((BlockContext)_localctx).expr = expr();
				((BlockContext)_localctx).exprs.add(((BlockContext)_localctx).expr);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(63);
					match(Comma);
					setState(64);
					((BlockContext)_localctx).expr = expr();
					((BlockContext)_localctx).exprs.add(((BlockContext)_localctx).expr);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(72);
			match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public Types t = Types.UNKNOWN;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class WhileExprContext extends ExprContext {
		public TerminalNode WhileLoop() { return getToken(SExpressionsParser.WhileLoop, 0); }
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipExprContext extends ExprContext {
		public TerminalNode Skip() { return getToken(SExpressionsParser.Skip, 0); }
		public SkipExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterSkipExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitSkipExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitSkipExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public TerminalNode IfStmt() { return getToken(SExpressionsParser.IfStmt, 0); }
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunInvocExprContext extends ExprContext {
		public TerminalNode FunInvoc() { return getToken(SExpressionsParser.FunInvoc, 0); }
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunInvocExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterFunInvocExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitFunInvocExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitFunInvocExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatExprContext extends ExprContext {
		public TerminalNode RepeatLoop() { return getToken(SExpressionsParser.RepeatLoop, 0); }
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterRepeatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitRepeatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitRepeatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinExprContext extends ExprContext {
		public TerminalNode BinOpExpr() { return getToken(SExpressionsParser.BinOpExpr, 0); }
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterBinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitBinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitBinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExprContext extends ExprContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsgmtExprContext extends ExprContext {
		public TerminalNode Asgmt() { return getToken(SExpressionsParser.Asgmt, 0); }
		public List<TerminalNode> Comma() { return getTokens(SExpressionsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SExpressionsParser.Comma, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsgmtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterAsgmtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitAsgmtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitAsgmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockExprContext extends ExprContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__0);
				setState(75);
				match(IfStmt);
				setState(76);
				match(Comma);
				setState(77);
				expr();
				setState(78);
				match(Comma);
				setState(79);
				block();
				setState(80);
				match(Comma);
				setState(81);
				block();
				setState(82);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new BinExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__0);
				setState(85);
				match(BinOpExpr);
				setState(86);
				match(Comma);
				setState(87);
				binop();
				setState(88);
				match(Comma);
				setState(89);
				expr();
				setState(90);
				match(Comma);
				setState(91);
				expr();
				setState(92);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WhileExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__0);
				setState(95);
				match(WhileLoop);
				setState(96);
				match(Comma);
				setState(97);
				expr();
				setState(98);
				match(Comma);
				setState(99);
				block();
				setState(100);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new RepeatExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(T__0);
				setState(103);
				match(RepeatLoop);
				setState(104);
				match(Comma);
				setState(105);
				expr();
				setState(106);
				match(Comma);
				setState(107);
				block();
				setState(108);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new AsgmtExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(T__0);
				setState(111);
				match(Asgmt);
				setState(112);
				match(Comma);
				setState(113);
				identifier();
				setState(114);
				match(Comma);
				setState(115);
				expr();
				setState(116);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new FunInvocExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				match(T__0);
				setState(119);
				match(FunInvoc);
				setState(120);
				match(Comma);
				setState(121);
				identifier();
				setState(122);
				match(Comma);
				setState(123);
				block();
				setState(124);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new BlockExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				block();
				}
				break;
			case 8:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				identifier();
				}
				break;
			case 9:
				_localctx = new IntExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				integer();
				}
				break;
			case 10:
				_localctx = new SkipExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				match(Skip);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Idfr() { return getToken(SExpressionsParser.Idfr, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__2);
			setState(133);
			match(Idfr);
			setState(134);
			match(T__3);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode IntLit() { return getToken(SExpressionsParser.IntLit, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__4);
			setState(137);
			match(IntLit);
			setState(138);
			match(T__5);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(SExpressionsParser.Eq, 0); }
		public TerminalNode Less() { return getToken(SExpressionsParser.Less, 0); }
		public TerminalNode Gtr() { return getToken(SExpressionsParser.Gtr, 0); }
		public TerminalNode LessEq() { return getToken(SExpressionsParser.LessEq, 0); }
		public TerminalNode GtrEq() { return getToken(SExpressionsParser.GtrEq, 0); }
		public TerminalNode Plus() { return getToken(SExpressionsParser.Plus, 0); }
		public TerminalNode Times() { return getToken(SExpressionsParser.Times, 0); }
		public TerminalNode Minus() { return getToken(SExpressionsParser.Minus, 0); }
		public TerminalNode Div() { return getToken(SExpressionsParser.Div, 0); }
		public TerminalNode And() { return getToken(SExpressionsParser.And, 0); }
		public TerminalNode Or() { return getToken(SExpressionsParser.Or, 0); }
		public TerminalNode Xor() { return getToken(SExpressionsParser.Xor, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SExpressionsListener ) ((SExpressionsListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SExpressionsVisitor ) return ((SExpressionsVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Eq) | (1L << Less) | (1L << Gtr) | (1L << LessEq) | (1L << GtrEq) | (1L << Plus) | (1L << Times) | (1L << Minus) | (1L << Div) | (1L << And) | (1L << Or) | (1L << Xor))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\5\3\61\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6D\n\6\f\6"+
		"\16\6G\13\6\5\6I\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\t\13"+
		"\3\2\25 \2\u0095\2\24\3\2\2\2\4 \3\2\2\2\6\67\3\2\2\2\b=\3\2\2\2\n?\3"+
		"\2\2\2\f\u0084\3\2\2\2\16\u0086\3\2\2\2\20\u008a\3\2\2\2\22\u008e\3\2"+
		"\2\2\24\25\7\3\2\2\25\32\5\4\3\2\26\27\7\24\2\2\27\31\5\4\3\2\30\26\3"+
		"\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3"+
		"\2\2\2\35\36\7\4\2\2\36\37\7\2\2\3\37\3\3\2\2\2 !\7\3\2\2!\"\7\f\2\2\""+
		"#\7\24\2\2#$\5\16\b\2$%\7\24\2\2%&\5\b\5\2&\'\7\24\2\2\'\60\7\3\2\2(-"+
		"\5\6\4\2)*\7\24\2\2*,\5\6\4\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\61\3\2\2\2/-\3\2\2\2\60(\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7"+
		"\4\2\2\63\64\7\24\2\2\64\65\5\n\6\2\65\66\7\4\2\2\66\5\3\2\2\2\678\7\3"+
		"\2\289\5\16\b\29:\7\24\2\2:;\5\b\5\2;<\7\4\2\2<\7\3\2\2\2=>\t\2\2\2>\t"+
		"\3\2\2\2?H\7\3\2\2@E\5\f\7\2AB\7\24\2\2BD\5\f\7\2CA\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H@\3\2\2\2HI\3\2\2\2IJ\3\2\2\2"+
		"JK\7\4\2\2K\13\3\2\2\2LM\7\3\2\2MN\7\r\2\2NO\7\24\2\2OP\5\f\7\2PQ\7\24"+
		"\2\2QR\5\n\6\2RS\7\24\2\2ST\5\n\6\2TU\7\4\2\2U\u0085\3\2\2\2VW\7\3\2\2"+
		"WX\7\16\2\2XY\7\24\2\2YZ\5\22\n\2Z[\7\24\2\2[\\\5\f\7\2\\]\7\24\2\2]^"+
		"\5\f\7\2^_\7\4\2\2_\u0085\3\2\2\2`a\7\3\2\2ab\7\17\2\2bc\7\24\2\2cd\5"+
		"\f\7\2de\7\24\2\2ef\5\n\6\2fg\7\4\2\2g\u0085\3\2\2\2hi\7\3\2\2ij\7\20"+
		"\2\2jk\7\24\2\2kl\5\f\7\2lm\7\24\2\2mn\5\n\6\2no\7\4\2\2o\u0085\3\2\2"+
		"\2pq\7\3\2\2qr\7\21\2\2rs\7\24\2\2st\5\16\b\2tu\7\24\2\2uv\5\f\7\2vw\7"+
		"\4\2\2w\u0085\3\2\2\2xy\7\3\2\2yz\7\22\2\2z{\7\24\2\2{|\5\16\b\2|}\7\24"+
		"\2\2}~\5\n\6\2~\177\7\4\2\2\177\u0085\3\2\2\2\u0080\u0085\5\n\6\2\u0081"+
		"\u0085\5\16\b\2\u0082\u0085\5\20\t\2\u0083\u0085\7\23\2\2\u0084L\3\2\2"+
		"\2\u0084V\3\2\2\2\u0084`\3\2\2\2\u0084h\3\2\2\2\u0084p\3\2\2\2\u0084x"+
		"\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7\5\2\2\u0087\u0088\7!\2\2"+
		"\u0088\u0089\7\6\2\2\u0089\17\3\2\2\2\u008a\u008b\7\7\2\2\u008b\u008c"+
		"\7\"\2\2\u008c\u008d\7\b\2\2\u008d\21\3\2\2\2\u008e\u008f\t\3\2\2\u008f"+
		"\23\3\2\2\2\b\32-\60EH\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}