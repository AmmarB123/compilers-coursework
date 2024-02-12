// Generated from C:/Users/Asus/Desktop/TASK 3/src\SExpressions.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SExpressionsParser}.
 */
public interface SExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SExpressionsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SExpressionsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(SExpressionsParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(SExpressionsParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#typed_idfr}.
	 * @param ctx the parse tree
	 */
	void enterTyped_idfr(SExpressionsParser.Typed_idfrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#typed_idfr}.
	 * @param ctx the parse tree
	 */
	void exitTyped_idfr(SExpressionsParser.Typed_idfrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SExpressionsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SExpressionsParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SExpressionsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SExpressionsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(SExpressionsParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(SExpressionsParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinExpr(SExpressionsParser.BinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinExpr(SExpressionsParser.BinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(SExpressionsParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(SExpressionsParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepeatExpr(SExpressionsParser.RepeatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepeatExpr(SExpressionsParser.RepeatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsgmtExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsgmtExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunInvocExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunInvocExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(SExpressionsParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(SExpressionsParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SExpressionsParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SExpressionsParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(SExpressionsParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(SExpressionsParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSkipExpr(SExpressionsParser.SkipExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSkipExpr(SExpressionsParser.SkipExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SExpressionsParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SExpressionsParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SExpressionsParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SExpressionsParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SExpressionsParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(SExpressionsParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SExpressionsParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(SExpressionsParser.BinopContext ctx);
}