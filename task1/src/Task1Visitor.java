// Generated from C:/Users/Asus/Desktop/123456/task1/src\Task1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Task1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Task1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Task1Parser#wholeexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWholeexpr(Task1Parser.WholeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Task1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task1Parser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(Task1Parser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task1Parser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(Task1Parser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task1Parser#vardecne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecne(Task1Parser.VardecneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Task1Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdfrExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfrExp(Task1Parser.IdfrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExp(Task1Parser.IntExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExp(Task1Parser.AssignmentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOpExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOpExp(Task1Parser.BinaryOpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgsExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExp(Task1Parser.ArgsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExp(Task1Parser.BlockExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(Task1Parser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExp(Task1Parser.WhileExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatExp(Task1Parser.RepeatExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipExp}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipExp(Task1Parser.SkipExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task1Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Task1Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task1Parser#argsne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsne(Task1Parser.ArgsneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOP(Task1Parser.LessOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqOP(Task1Parser.LessEqOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOP(Task1Parser.AndOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorOP(Task1Parser.XorOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOP(Task1Parser.EqOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtrOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtrOP(Task1Parser.GtrOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtrEqOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtrEqOP(Task1Parser.GtrEqOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOP(Task1Parser.OrOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimesOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOP(Task1Parser.TimesOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOP(Task1Parser.DivOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOP(Task1Parser.MinusOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusOP}
	 * labeled alternative in {@link Task1Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOP(Task1Parser.PlusOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntergerType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntergerType(Task1Parser.IntergerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(Task1Parser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitsType}
	 * labeled alternative in {@link Task1Parser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitsType(Task1Parser.UnitsTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDTFR}
	 * labeled alternative in {@link Task1Parser#idfr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDTFR(Task1Parser.IDTFRContext ctx);
}