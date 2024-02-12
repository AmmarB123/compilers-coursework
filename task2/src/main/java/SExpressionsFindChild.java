package main.java;
import org.antlr.v4.runtime.tree.ParseTree;

public class SExpressionsFindChild extends SExpressionsBaseVisitor<Boolean> {

    private ParseTree nodeToFind = null;

    public Boolean find(ParseTree tree, ParseTree n)
    {
        nodeToFind = n;
        return visit(tree);
    }

    @Override public Boolean visitProg(SExpressionsParser.ProgContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        for (int i = 0; i < ctx.decs.size(); ++i) {
            if (visit(ctx.decs.get(i))) {
                return true;
            }
        }

        return false;
    }

    @Override public Boolean visitDec(SExpressionsParser.DecContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.identifier())) {
            return true;
        }

        if (visit(ctx.type())) {
            return true;
        }

        for (int i = 0; i < ctx.params.size(); ++i) {
            if (visit(ctx.params.get(i))) {
                return true;
            }
        }

        if (visit(ctx.block())) {
            return true;
        };

        return false;
    }

    @Override public Boolean visitTyped_idfr(SExpressionsParser.Typed_idfrContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.identifier())) {
            return true;
        }

        if (visit(ctx.type())) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitType(SExpressionsParser.TypeContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitBlock(SExpressionsParser.BlockContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        for (int i = 0; i < ctx.exprs.size(); ++i) {
            if (visit(ctx.exprs.get(i))) {
                return true;
            }
        }

        return false;
    }


    @Override public Boolean visitIfExpr(SExpressionsParser.IfExprContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.expr())) {
            return true;
        }

        if (visit(ctx.block(0))) {
            return true;
        }

        if (visit(ctx.block(1))) {
            return true;
        }

        return false;
    }


    @Override public Boolean visitBinExpr(SExpressionsParser.BinExprContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.binop())) {
            return true;
        }

        if (visit(ctx.expr(0))) {
            return true;
        }

        if (visit(ctx.expr(1))) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitWhileExpr(SExpressionsParser.WhileExprContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.expr())) {
            return true;
        }

        if (visit(ctx.block())) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitRepeatExpr(SExpressionsParser.RepeatExprContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.expr())) {
            return true;
        }

        if (visit(ctx.block())) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.identifier())) {
            return true;
        }

        if (visit(ctx.expr())) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.identifier())) {
            return true;
        }

        if (visit(ctx.block())) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitBlockExpr(SExpressionsParser.BlockExprContext ctx)
    {
        return visit(ctx.block());
    }

    @Override public Boolean visitIdExpr(SExpressionsParser.IdExprContext ctx)
    {

        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.identifier())) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitIntExpr(SExpressionsParser.IntExprContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (visit(ctx.integer())) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitSkipExpr(SExpressionsParser.SkipExprContext ctx)
    {
        return (ctx == nodeToFind);
    }

    @Override public Boolean visitIdentifier(SExpressionsParser.IdentifierContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (ctx.Idfr() == nodeToFind) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitInteger(SExpressionsParser.IntegerContext ctx)
    {
        if (ctx == nodeToFind) {
            return true;
        }

        if (ctx.IntLit() == nodeToFind) {
            return true;
        }

        return false;
    }

    @Override public Boolean visitBinop(SExpressionsParser.BinopContext ctx)
    {
        return (ctx == nodeToFind);
    }


}

