package main.java;
import org.antlr.v4.runtime.tree.ParseTree;

public class SExpressionsToString extends SExpressionsBaseVisitor<String> {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    private ParseTree nodeToHighlight = null;
    private Boolean inScope = false;
    private final SExpressionsFindChild findChild = new SExpressionsFindChild();

    public String visitHighlight(ParseTree tree, ParseTree n)
    {
       nodeToHighlight = n;
       return G5035_S_Expression_PrettyPrinter.prettyPrint(visit(tree));
    }

    @Override public String visitProg(SExpressionsParser.ProgContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        for (int i = 0; i < ctx.decs.size(); ++i) {
            if (inScope || findChild.find(ctx.decs.get(i), nodeToHighlight)) {
                sb.append(visit(ctx.decs.get(i)));
            } else {
                sb.append("...");
            }
            if (i != ctx.decs.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitDec(SExpressionsParser.DecContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append("FunDecl");
        sb.append(",");
        sb.append(visit(ctx.identifier()));
        sb.append(",");
        sb.append(visit(ctx.type()));
        sb.append(",");
        sb.append("[");
        for (int i = 0; i < ctx.params.size(); ++i) {
            if (inScope || findChild.find(ctx.params.get(i), nodeToHighlight)) {
                sb.append(visit(ctx.params.get(i)));
            } else {
                sb.append("...");
            }
            if (i != ctx.params.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        sb.append(",");
        if (inScope || findChild.find(ctx.block(), nodeToHighlight)) {
            sb.append(visit(ctx.block()));
        } else {
            sb.append("...");
        }
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitTyped_idfr(SExpressionsParser.Typed_idfrContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append(visit(ctx.identifier()));
        sb.append(",");
        sb.append(visit(ctx.type()));
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitType(SExpressionsParser.TypeContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(ctx.getText());

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitBlock(SExpressionsParser.BlockContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        for (int i = 0; i < ctx.exprs.size(); ++i) {

            if (inScope || findChild.find(ctx.exprs.get(i), nodeToHighlight)) {
                sb.append(visit(ctx.exprs.get(i)));
            } else {
                sb.append("...");
            }
            if (i != ctx.exprs.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }


    @Override public String visitIfExpr(SExpressionsParser.IfExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append("IfStmt");
        sb.append(",");
        sb.append(visit(ctx.expr()));
        sb.append(",");
        if (inScope || findChild.find(ctx.block(0), nodeToHighlight)) {
            sb.append(visit(ctx.block(0)));
        } else {
            sb.append("...");
        }
        sb.append(",");
        if (inScope || findChild.find(ctx.block(1), nodeToHighlight)) {
            sb.append(visit(ctx.block(1)));
        } else {
            sb.append("...");
        }
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }


    @Override public String visitBinExpr(SExpressionsParser.BinExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append("BinOpExpr");
        sb.append(",");
        sb.append(visit(ctx.binop()));
        sb.append(",");
        sb.append(visit(ctx.expr(0)));
        sb.append(",");
        sb.append(visit(ctx.expr(1)));
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitWhileExpr(SExpressionsParser.WhileExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append("WhileLoop");
        sb.append(",");
        sb.append(visit(ctx.expr()));
        sb.append(",");
        if (inScope || findChild.find(ctx.block(), nodeToHighlight)) {
            sb.append(visit(ctx.block()));
        } else {
            sb.append("...");
        }
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitRepeatExpr(SExpressionsParser.RepeatExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append("RepeatLoop");
        sb.append(",");
        sb.append(visit(ctx.expr()));
        sb.append(",");
        if (inScope || findChild.find(ctx.block(), nodeToHighlight)) {
            sb.append(visit(ctx.block()));
        } else {
            sb.append("...");
        }
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append("Asgmt");
        sb.append(",");
        sb.append(visit(ctx.identifier()));
        sb.append(",");
        sb.append(visit(ctx.expr()));
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append("[");
        sb.append("FunInvoc");
        sb.append(",");
        sb.append(visit(ctx.identifier()));
        sb.append(",");
        if (inScope || findChild.find(ctx.block(), nodeToHighlight)) {
            sb.append(visit(ctx.block()));
        } else {
            sb.append("...");
        }
        sb.append("]");

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitBlockExpr(SExpressionsParser.BlockExprContext ctx)
    {

        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(visit(ctx.block()));

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitIdExpr(SExpressionsParser.IdExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(visit(ctx.identifier()));

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitIntExpr(SExpressionsParser.IntExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(visit(ctx.integer()));

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitSkipExpr(SExpressionsParser.SkipExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(ctx.getText());

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitIdentifier(SExpressionsParser.IdentifierContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(ctx.getText());

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitInteger(SExpressionsParser.IntegerContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(ctx.getText());

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }

    @Override public String visitBinop(SExpressionsParser.BinopContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RED);
            inScope = true;
        }

        sb.append(ctx.getText());

        if (ctx == nodeToHighlight) {
            sb.append(ANSI_RESET);
            inScope = false;
        }
        return sb.toString();
    }


}
