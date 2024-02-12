// Generated from C:/Users/user/IdeaProjects/Task2/src\SExpressions.g4 by ANTLR 4.9.1
package main.java;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SExpressionsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(SExpressionsParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#typed_idfr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_idfr(SExpressionsParser.Typed_idfrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SExpressionsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SExpressionsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(SExpressionsParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExpr(SExpressionsParser.BinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(SExpressionsParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatExpr(SExpressionsParser.RepeatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsgmtExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunInvocExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(SExpressionsParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SExpressionsParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(SExpressionsParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipExpr}
	 * labeled alternative in {@link SExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipExpr(SExpressionsParser.SkipExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SExpressionsParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SExpressionsParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SExpressionsParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(SExpressionsParser.BinopContext ctx);
}