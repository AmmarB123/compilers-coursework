// Generated from C:/Users/Asus/Desktop/123456/task1/src\Task1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task1Parser}.
 */
public interface Task1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task1Parser#wholeexpr}.
	 * @param ctx the parse tree
	 */
	void enterWholeexpr(Task1Parser.WholeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#wholeexpr}.
	 * @param ctx the parse tree
	 */
	void exitWholeexpr(Task1Parser.WholeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Task1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Task1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(Task1Parser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(Task1Parser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(Task1Parser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(Task1Parser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#vardecne}.
	 * @param ctx the parse tree
	 */
	void enterVardecne(Task1Parser.VardecneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#vardecne}.
	 * @param ctx the parse tree
	 */
	void exitVardecne(Task1Parser.VardecneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Task1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Task1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdfrExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdfrExp(Task1Parser.IdfrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdfrExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdfrExp(Task1Parser.IdfrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntExp(Task1Parser.IntExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntExp(Task1Parser.IntExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExp(Task1Parser.AssignmentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExp(Task1Parser.AssignmentExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOpExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOpExp(Task1Parser.BinaryOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOpExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOpExp(Task1Parser.BinaryOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgsExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArgsExp(Task1Parser.ArgsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgsExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArgsExp(Task1Parser.ArgsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBlockExp(Task1Parser.BlockExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBlockExp(Task1Parser.BlockExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(Task1Parser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(Task1Parser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterWhileExp(Task1Parser.WhileExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitWhileExp(Task1Parser.WhileExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRepeatExp(Task1Parser.RepeatExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRepeatExp(Task1Parser.RepeatExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSkipExp(Task1Parser.SkipExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSkipExp(Task1Parser.SkipExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Task1Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Task1Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#argsne}.
	 * @param ctx the parse tree
	 */
	void enterArgsne(Task1Parser.ArgsneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#argsne}.
	 * @param ctx the parse tree
	 */
	void exitArgsne(Task1Parser.ArgsneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterLessOP(Task1Parser.LessOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitLessOP(Task1Parser.LessOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterLessEqOP(Task1Parser.LessEqOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitLessEqOP(Task1Parser.LessEqOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterAndOP(Task1Parser.AndOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitAndOP(Task1Parser.AndOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XorOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterXorOP(Task1Parser.XorOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XorOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitXorOP(Task1Parser.XorOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterEqOP(Task1Parser.EqOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitEqOP(Task1Parser.EqOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtrOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterGtrOP(Task1Parser.GtrOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtrOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitGtrOP(Task1Parser.GtrOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtrEqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterGtrEqOP(Task1Parser.GtrEqOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtrEqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitGtrEqOP(Task1Parser.GtrEqOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterOrOP(Task1Parser.OrOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitOrOP(Task1Parser.OrOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterTimesOP(Task1Parser.TimesOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitTimesOP(Task1Parser.TimesOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterDivOP(Task1Parser.DivOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitDivOP(Task1Parser.DivOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterMinusOP(Task1Parser.MinusOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitMinusOP(Task1Parser.MinusOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterPlusOP(Task1Parser.PlusOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitPlusOP(Task1Parser.PlusOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntergerType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 */
	void enterIntergerType(Task1Parser.IntergerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntergerType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 */
	void exitIntergerType(Task1Parser.IntergerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(Task1Parser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(Task1Parser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitsType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 */
	void enterUnitsType(Task1Parser.UnitsTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitsType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 */
	void exitUnitsType(Task1Parser.UnitsTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDTFR}
	 * labeled alternative in {@link Task1Parser#idfr}.
	 * @param ctx the parse tree
	 */
	void enterIDTFR(Task1Parser.IDTFRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDTFR}
	 * labeled alternative in {@link Task1Parser#idfr}.
	 * @param ctx the parse tree
	 */
	void exitIDTFR(Task1Parser.IDTFRContext ctx);
}