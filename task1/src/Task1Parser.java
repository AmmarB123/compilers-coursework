// Generated from C:/Users/Asus/Desktop/123456/task1/src\Task1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntLit=1, IntType=2, BoolType=3, UnitType=4, Assign=5, Less=6, LessEq=7, 
		And=8, Xor=9, Eq=10, Gtr=11, GtrEq=12, Or=13, Times=14, Div=15, Plus=16, 
		Minus=17, While=18, Do=19, Repeat=20, Until=21, If=22, Then=23, Else=24, 
		Comma=25, RParen=26, LBrace=27, Semicolon=28, RBrace=29, LParen=30, Return=31, 
		Skip=32, IDENTIFIER=33, WS=34;
	public static final int
		RULE_wholeexpr = 0, RULE_prog = 1, RULE_dec = 2, RULE_vardec = 3, RULE_vardecne = 4, 
		RULE_block = 5, RULE_exp = 6, RULE_args = 7, RULE_argsne = 8, RULE_binop = 9, 
		RULE_types = 10, RULE_idfr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"wholeexpr", "prog", "dec", "vardec", "vardecne", "block", "exp", "args", 
			"argsne", "binop", "types", "idfr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'bool'", "'unit'", "':='", "'<'", "'<='", "'&&'", 
			"'^^'", "'=='", "'>'", "'>='", "'||'", "'*'", "'/'", "'+'", "'-'", "'while'", 
			"'do'", "'repeat'", "'until'", "'if'", "'then'", "'else'", "','", "')'", 
			"'{'", "';'", "'}'", "'('", "'return'", "'skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntLit", "IntType", "BoolType", "UnitType", "Assign", "Less", 
			"LessEq", "And", "Xor", "Eq", "Gtr", "GtrEq", "Or", "Times", "Div", "Plus", 
			"Minus", "While", "Do", "Repeat", "Until", "If", "Then", "Else", "Comma", 
			"RParen", "LBrace", "Semicolon", "RBrace", "LParen", "Return", "Skip", 
			"IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "Task1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class WholeexprContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Task1Parser.EOF, 0); }
		public WholeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wholeexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterWholeexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitWholeexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitWholeexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WholeexprContext wholeexpr() throws RecognitionException {
		WholeexprContext _localctx = new WholeexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wholeexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			prog();
			setState(25);
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

	public static class ProgContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				dec();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << UnitType))) != 0) );
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
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public IdfrContext idfr() {
			return getRuleContext(IdfrContext.class,0);
		}
		public TerminalNode LParen() { return getToken(Task1Parser.LParen, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode RParen() { return getToken(Task1Parser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			types();
			setState(33);
			idfr();
			setState(34);
			match(LParen);
			setState(35);
			vardec();
			setState(36);
			match(RParen);
			setState(37);
			block();
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

	public static class VardecContext extends ParserRuleContext {
		public List<VardecneContext> vardecne() {
			return getRuleContexts(VardecneContext.class);
		}
		public VardecneContext vardecne(int i) {
			return getRuleContext(VardecneContext.class,i);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << UnitType) | (1L << Comma))) != 0)) {
				{
				{
				setState(39);
				vardecne();
				}
				}
				setState(44);
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

	public static class VardecneContext extends ParserRuleContext {
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public List<IdfrContext> idfr() {
			return getRuleContexts(IdfrContext.class);
		}
		public IdfrContext idfr(int i) {
			return getRuleContext(IdfrContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Task1Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Task1Parser.Comma, i);
		}
		public VardecneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterVardecne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitVardecne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitVardecne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecneContext vardecne() throws RecognitionException {
		VardecneContext _localctx = new VardecneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecne);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					types();
					setState(46);
					idfr();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(53);
				match(Comma);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			types();
			setState(60);
			idfr();
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
		public ExpContext exp;
		public List<ExpContext> ene = new ArrayList<ExpContext>();
		public TerminalNode LBrace() { return getToken(Task1Parser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(Task1Parser.RBrace, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(Task1Parser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(Task1Parser.Semicolon, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LBrace);
			setState(63);
			((BlockContext)_localctx).exp = exp();
			((BlockContext)_localctx).ene.add(((BlockContext)_localctx).exp);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(64);
				match(Semicolon);
				setState(65);
				((BlockContext)_localctx).exp = exp();
				((BlockContext)_localctx).ene.add(((BlockContext)_localctx).exp);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(RBrace);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileExpContext extends ExpContext {
		public TerminalNode While() { return getToken(Task1Parser.While, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Do() { return getToken(Task1Parser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterWhileExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitWhileExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitWhileExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatExpContext extends ExpContext {
		public TerminalNode Repeat() { return getToken(Task1Parser.Repeat, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Until() { return getToken(Task1Parser.Until, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterRepeatExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitRepeatExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitRepeatExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ExpContext {
		public TerminalNode If() { return getToken(Task1Parser.If, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Then() { return getToken(Task1Parser.Then, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(Task1Parser.Else, 0); }
		public IfExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitIfExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOpExpContext extends ExpContext {
		public TerminalNode LParen() { return getToken(Task1Parser.LParen, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RParen() { return getToken(Task1Parser.RParen, 0); }
		public BinaryOpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBinaryOpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBinaryOpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitBinaryOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipExpContext extends ExpContext {
		public TerminalNode Skip() { return getToken(Task1Parser.Skip, 0); }
		public SkipExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterSkipExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitSkipExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitSkipExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdfrExpContext extends ExpContext {
		public IdfrContext idfr() {
			return getRuleContext(IdfrContext.class,0);
		}
		public IdfrExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterIdfrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitIdfrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitIdfrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExpContext extends ExpContext {
		public TerminalNode IntLit() { return getToken(Task1Parser.IntLit, 0); }
		public IntExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterIntExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitIntExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitIntExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpContext extends ExpContext {
		public IdfrContext idfr() {
			return getRuleContext(IdfrContext.class,0);
		}
		public TerminalNode Assign() { return getToken(Task1Parser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterAssignmentExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitAssignmentExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitAssignmentExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockExpContext extends ExpContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBlockExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBlockExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitBlockExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsExpContext extends ExpContext {
		public IdfrContext idfr() {
			return getRuleContext(IdfrContext.class,0);
		}
		public TerminalNode LParen() { return getToken(Task1Parser.LParen, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RParen() { return getToken(Task1Parser.RParen, 0); }
		public ArgsExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterArgsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitArgsExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitArgsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IdfrExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				idfr();
				}
				break;
			case 2:
				_localctx = new IntExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(IntLit);
				}
				break;
			case 3:
				_localctx = new AssignmentExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				idfr();
				setState(76);
				match(Assign);
				setState(77);
				exp();
				}
				break;
			case 4:
				_localctx = new BinaryOpExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(LParen);
				setState(80);
				exp();
				setState(81);
				binop();
				setState(82);
				exp();
				setState(83);
				match(RParen);
				}
				break;
			case 5:
				_localctx = new ArgsExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				idfr();
				setState(86);
				match(LParen);
				setState(87);
				args();
				setState(88);
				match(RParen);
				}
				break;
			case 6:
				_localctx = new BlockExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				block();
				}
				break;
			case 7:
				_localctx = new IfExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(If);
				setState(92);
				exp();
				setState(93);
				match(Then);
				setState(94);
				block();
				setState(95);
				match(Else);
				setState(96);
				block();
				}
				break;
			case 8:
				_localctx = new WhileExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(While);
				setState(99);
				exp();
				setState(100);
				match(Do);
				setState(101);
				block();
				}
				break;
			case 9:
				_localctx = new RepeatExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(Repeat);
				setState(104);
				block();
				setState(105);
				match(Until);
				setState(106);
				exp();
				}
				break;
			case 10:
				_localctx = new SkipExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgsneContext> argsne() {
			return getRuleContexts(ArgsneContext.class);
		}
		public ArgsneContext argsne(int i) {
			return getRuleContext(ArgsneContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntLit) | (1L << While) | (1L << Repeat) | (1L << If) | (1L << LBrace) | (1L << LParen) | (1L << Skip) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(111);
				argsne();
				}
				}
				setState(116);
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

	public static class ArgsneContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(Task1Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Task1Parser.Comma, i);
		}
		public ArgsneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterArgsne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitArgsne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitArgsne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsneContext argsne() throws RecognitionException {
		ArgsneContext _localctx = new ArgsneContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argsne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			exp();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(118);
				match(Comma);
				setState(119);
				exp();
				}
				}
				setState(124);
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

	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
	 
		public BinopContext() { }
		public void copyFrom(BinopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XorOPContext extends BinopContext {
		public TerminalNode Xor() { return getToken(Task1Parser.Xor, 0); }
		public XorOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterXorOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitXorOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitXorOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesOPContext extends BinopContext {
		public TerminalNode Times() { return getToken(Task1Parser.Times, 0); }
		public TimesOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterTimesOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitTimesOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitTimesOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusOPContext extends BinopContext {
		public TerminalNode Minus() { return getToken(Task1Parser.Minus, 0); }
		public MinusOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterMinusOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitMinusOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitMinusOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrOPContext extends BinopContext {
		public TerminalNode Or() { return getToken(Task1Parser.Or, 0); }
		public OrOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterOrOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitOrOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitOrOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtrEqOPContext extends BinopContext {
		public TerminalNode GtrEq() { return getToken(Task1Parser.GtrEq, 0); }
		public GtrEqOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterGtrEqOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitGtrEqOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitGtrEqOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqOPContext extends BinopContext {
		public TerminalNode LessEq() { return getToken(Task1Parser.LessEq, 0); }
		public LessEqOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterLessEqOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitLessEqOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitLessEqOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusOPContext extends BinopContext {
		public TerminalNode Plus() { return getToken(Task1Parser.Plus, 0); }
		public PlusOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterPlusOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitPlusOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitPlusOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtrOPContext extends BinopContext {
		public TerminalNode Gtr() { return getToken(Task1Parser.Gtr, 0); }
		public GtrOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterGtrOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitGtrOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitGtrOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqOPContext extends BinopContext {
		public TerminalNode Eq() { return getToken(Task1Parser.Eq, 0); }
		public EqOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterEqOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitEqOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitEqOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivOPContext extends BinopContext {
		public TerminalNode Div() { return getToken(Task1Parser.Div, 0); }
		public DivOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterDivOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitDivOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitDivOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessOPContext extends BinopContext {
		public TerminalNode Less() { return getToken(Task1Parser.Less, 0); }
		public LessOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterLessOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitLessOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitLessOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOPContext extends BinopContext {
		public TerminalNode And() { return getToken(Task1Parser.And, 0); }
		public AndOPContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterAndOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitAndOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitAndOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binop);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Less:
				_localctx = new LessOPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(Less);
				}
				break;
			case LessEq:
				_localctx = new LessEqOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(LessEq);
				}
				break;
			case And:
				_localctx = new AndOPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(And);
				}
				break;
			case Xor:
				_localctx = new XorOPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(Xor);
				}
				break;
			case Eq:
				_localctx = new EqOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(Eq);
				}
				break;
			case Gtr:
				_localctx = new GtrOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(Gtr);
				}
				break;
			case GtrEq:
				_localctx = new GtrEqOPContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				match(GtrEq);
				}
				break;
			case Or:
				_localctx = new OrOPContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				match(Or);
				}
				break;
			case Times:
				_localctx = new TimesOPContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(133);
				match(Times);
				}
				break;
			case Div:
				_localctx = new DivOPContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(Div);
				}
				break;
			case Minus:
				_localctx = new MinusOPContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(135);
				match(Minus);
				}
				break;
			case Plus:
				_localctx = new PlusOPContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(136);
				match(Plus);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypesContext extends ParserRuleContext {
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	 
		public TypesContext() { }
		public void copyFrom(TypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntergerTypeContext extends TypesContext {
		public TerminalNode IntType() { return getToken(Task1Parser.IntType, 0); }
		public IntergerTypeContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterIntergerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitIntergerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitIntergerType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTypeContext extends TypesContext {
		public TerminalNode BoolType() { return getToken(Task1Parser.BoolType, 0); }
		public BooleanTypeContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitsTypeContext extends TypesContext {
		public TerminalNode UnitType() { return getToken(Task1Parser.UnitType, 0); }
		public UnitsTypeContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterUnitsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitUnitsType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitUnitsType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_types);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
				_localctx = new IntergerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(IntType);
				}
				break;
			case BoolType:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(BoolType);
				}
				break;
			case UnitType:
				_localctx = new UnitsTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(UnitType);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdfrContext extends ParserRuleContext {
		public IdfrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idfr; }
	 
		public IdfrContext() { }
		public void copyFrom(IdfrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IDTFRContext extends IdfrContext {
		public TerminalNode IDENTIFIER() { return getToken(Task1Parser.IDENTIFIER, 0); }
		public IDTFRContext(IdfrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterIDTFR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitIDTFR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task1Visitor ) return ((Task1Visitor<? extends T>)visitor).visitIDTFR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdfrContext idfr() throws RecognitionException {
		IdfrContext _localctx = new IdfrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idfr);
		try {
			_localctx = new IDTFRContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\7\5+\n\5\f\5\16\5.\13\5\3\6\3\6\3\6\7\6\63\n\6\f\6"+
		"\16\6\66\13\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\7\7E\n\7\f\7\16\7H\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\7\ts\n\t\f\t\16\tv\13"+
		"\t\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\5\f\u0091\n\f"+
		"\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00a5\2\32\3\2"+
		"\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b,\3\2\2\2\n\64\3\2\2\2\f@\3\2\2\2\16o\3"+
		"\2\2\2\20t\3\2\2\2\22w\3\2\2\2\24\u008b\3\2\2\2\26\u0090\3\2\2\2\30\u0092"+
		"\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\37\5\6\4\2\36\35"+
		"\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"#\5\26\f\2#$\5"+
		"\30\r\2$%\7 \2\2%&\5\b\5\2&\'\7\34\2\2\'(\5\f\7\2(\7\3\2\2\2)+\5\n\6\2"+
		"*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\t\3\2\2\2.,\3\2\2\2/\60\5\26"+
		"\f\2\60\61\5\30\r\2\61\63\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2"+
		"\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2\679\7\33\2\28\67\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\26\f\2>?\5\30\r"+
		"\2?\13\3\2\2\2@A\7\35\2\2AF\5\16\b\2BC\7\36\2\2CE\5\16\b\2DB\3\2\2\2E"+
		"H\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\37\2\2J\r\3\2\2"+
		"\2Kp\5\30\r\2Lp\7\3\2\2MN\5\30\r\2NO\7\7\2\2OP\5\16\b\2Pp\3\2\2\2QR\7"+
		" \2\2RS\5\16\b\2ST\5\24\13\2TU\5\16\b\2UV\7\34\2\2Vp\3\2\2\2WX\5\30\r"+
		"\2XY\7 \2\2YZ\5\20\t\2Z[\7\34\2\2[p\3\2\2\2\\p\5\f\7\2]^\7\30\2\2^_\5"+
		"\16\b\2_`\7\31\2\2`a\5\f\7\2ab\7\32\2\2bc\5\f\7\2cp\3\2\2\2de\7\24\2\2"+
		"ef\5\16\b\2fg\7\25\2\2gh\5\f\7\2hp\3\2\2\2ij\7\26\2\2jk\5\f\7\2kl\7\27"+
		"\2\2lm\5\16\b\2mp\3\2\2\2np\7\"\2\2oK\3\2\2\2oL\3\2\2\2oM\3\2\2\2oQ\3"+
		"\2\2\2oW\3\2\2\2o\\\3\2\2\2o]\3\2\2\2od\3\2\2\2oi\3\2\2\2on\3\2\2\2p\17"+
		"\3\2\2\2qs\5\22\n\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2"+
		"\2vt\3\2\2\2w|\5\16\b\2xy\7\33\2\2y{\5\16\b\2zx\3\2\2\2{~\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\23\3\2\2\2~|\3\2\2\2\177\u008c\7\b\2\2\u0080\u008c\7"+
		"\t\2\2\u0081\u008c\7\n\2\2\u0082\u008c\7\13\2\2\u0083\u008c\7\f\2\2\u0084"+
		"\u008c\7\r\2\2\u0085\u008c\7\16\2\2\u0086\u008c\7\17\2\2\u0087\u008c\7"+
		"\20\2\2\u0088\u008c\7\21\2\2\u0089\u008c\7\23\2\2\u008a\u008c\7\22\2\2"+
		"\u008b\177\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0082"+
		"\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\25\3\2\2\2\u008d\u0091\7\4\2\2\u008e\u0091"+
		"\7\5\2\2\u008f\u0091\7\6\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\27\3\2\2\2\u0092\u0093\7#\2\2\u0093\31\3\2\2\2\f"+
		" ,\64:Fot|\u008b\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}