import java.util.HashMap;
import java.util.Map;

public class Worker extends SExpressionsBaseVisitor<String> {

    @Override
    public String visitProg(SExpressionsParser.ProgContext ctx) {


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.dec().size(); i++) {
            sb.append(visit(ctx.dec().get(i)));
        }
        //Start (main)
        sb.append("main");
        //save the current value of sp
        sb.append("mv \tt2 \tsp\n");
        //? save old return address pointer on stack
        sb.append("sw \t ra \t 0(sp)\n");
        // move stack pointer down one word
        sb.append("addi \tsp	\tsp \t-4");
        //save old stack pointer (stored in t2) on stack
        sb.append("\n sw \t t2 \t 0(sp)\n");
        //move stack pointer down one word
        sb.append("addi sp	sp -4");
        //move stack pointer down one word
        sb.append("sw   fp 0(sp) ");
        //save *current* value of sp to fp
        sb.append("mv   fp  sp  ");
        //move stack pointer down one word
        sb.append("addi sp  sp  -4  ");



        return sb.toString();
    }

    @Override
    public String visitDec(SExpressionsParser.DecContext ctx) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.typed_idfr().size(); i++) {
            sb.append(visit(ctx.typed_idfr().get(i)));
        }
        sb.append(visit(ctx.block()));


        return sb.toString();
    }

    @Override
    public String visitBlock(SExpressionsParser.BlockContext ctx) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.expr().size(); i++) {
            sb.append(visit(ctx.expr().get(i)));
        }

        return sb.toString();
    }

    @Override
    public String visitIfExpr(SExpressionsParser.IfExprContext ctx) {

        StringBuilder sb = new StringBuilder();
        //load value of arg1 into a0
        sb.append("lw \ta0 \t-4(fp)\n");
        //Visting the unkown value, which is stored
        sb.append("li \tt1 \t"+visit(ctx.expr()));
        //if it is less than visit ctx expr  jump to else
        sb.append("\n blt\t t1  a0 \telse_case\n");
        //visiting blocks
        sb.append(visit(ctx.block(0)));
        sb.append(visit(ctx.block(1)));
        return sb.toString();
    }

    @Override
    public String visitBinExpr(SExpressionsParser.BinExprContext ctx) {

        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.expr(0)));
        sb.append(visit(ctx.expr(1)));
        //Returns the first part of the expression
        if (ctx.binop().getText().equals("Eq")) {

            sb.append("beq\n");

        }
        else if (ctx.binop().getText().equals("Gtr")) {

            sb.append("bgt\n");
        }
        else if (ctx.binop().getText().equals("GtrEq")) {

            sb.append("bge\n");

        }
        else if (ctx.binop().getText().equals("Less")) {

            sb.append("blt\n");
        }
        else if (ctx.binop().getText().equals("LessEq")) {

            sb.append("ble\n");

        }
        if (ctx.binop().getText().equals("Plus")) {

            sb.append("add\n");

        }
        else if (ctx.binop().getText().equals("Minus")) {

            sb.append("sub\n");

        }
        else if (ctx.binop().getText().equals("Times")) {

            sb.append("mul\n");

        }
        else if (ctx.binop().getText().equals("Div")) {

            sb.append("div\n");

        }

        if (ctx.binop().getText().equals("And")) {
            sb.append("and\n");

        }
        else if (ctx.binop().getText().equals("Or")) {
            sb.append("or\n");

        }
        else if (ctx.binop().getText().equals("Xor")) {
            sb.append("xor\n");
        }

        return sb.toString();

    }


    @Override
    public String visitWhileExpr(SExpressionsParser.WhileExprContext ctx) {
        //After looping returns the first value which has registers
        StringBuilder sb = new StringBuilder();
        sb.append("\nlw \tt0 \t-4(fp)\n");
        sb.append("lw \tt1 \t-8(fp)\n");
        sb.append("loop\n");
        sb.append(visit(ctx.expr()) + "\nt0 \tt1 \tend_loop\n");
        sb.append(visit(ctx.block()));
        sb.append("\nloop\n");
        sb.append("end_loop\n");
        sb.append("lw a0 t2\n");
        sb.append("ret");
        return sb.toString();
    }


    @Override
    public String visitRepeatExpr(SExpressionsParser.RepeatExprContext ctx) {
        //same as while loop
        StringBuilder sb = new StringBuilder();
        sb.append("\nlw \tt0 \t-4(fp)\n");
        sb.append("lw \tt1 \t-8(fp)\n");
        sb.append("loop\n");
        sb.append(visit(ctx.expr()) + "\nt0 \tt1 \tend_loop\n");
        sb.append(visit(ctx.block()));
        sb.append("\nloop\n");
        sb.append("end_loop\n");
        sb.append("lw a0 t2\n");
        sb.append("ret");
        return sb.toString();
    }
    //Used yto save the idfr values into a reg
    @Override
    public String visitAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx) {
        return visitChildren(ctx);
    }
    //Push funInvo in stack
    @Override
    public String visitFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx) {
        return visitChildren(ctx);
    }
    //Used to store block items
    @Override
    public String visitBlockExpr(SExpressionsParser.BlockExprContext ctx) {
        return visitChildren(ctx);
    }
    // ID
    @Override
    public String visitIdExpr(SExpressionsParser.IdExprContext ctx) {
        return visitChildren(ctx);
    }
    //CHECK int values
    @Override
    public String visitIntExpr(SExpressionsParser.IntExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSkipExpr(SExpressionsParser.SkipExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitIdentifier(SExpressionsParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitInteger(SExpressionsParser.IntegerContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitBinop(SExpressionsParser.BinopContext ctx) {
        return visitChildren(ctx);
    }
}




