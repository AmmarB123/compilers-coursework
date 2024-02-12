package main.java;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class SExpressionsAnalyser extends SExpressionsBaseVisitor<Types>
{

    private Map<String, SExpressionsParser.DecContext> global_funcs = new HashMap<>();
    private Map<String, Types> local_vars = new HashMap<>();

    private SExpressionsParser.DecContext current_dec = null;
    private final SExpressionsToString toStrConverter = new SExpressionsToString();

    public String visitAndPrint(SExpressionsParser.ProgContext prog)
    {

        visit(prog);    // Discards the dummy return value.

        // At this point, we know for sure that there is at least a 'main' function.

        int index_main = 0;
        for (int i = 0; i < prog.decs.size(); ++i) {
            SExpressionsParser.DecContext dec = prog.decs.get(i);
            if (dec.identifier().Idfr().getText().equals("main")) {
                index_main = i;
            }
        }

        SExpressionsParser.DecContext main = prog.decs.get(index_main);
        prog.decs.set(index_main, prog.decs.get(0));
        prog.decs.set(0, main);

        return toStrConverter.visitHighlight(prog, prog).replaceAll("\u001B\\[[;\\d]*m", "");   // Removes ANSI colours.

    }

    @Override public Types visitProg(SExpressionsParser.ProgContext ctx)
    {
        // TODO: modify and complete this method.


        Boolean found_main = false;
        Boolean found_int = false;
        Boolean found_arg = false;
        int found_index = 0;

        for (int i = 0; i < ctx.decs.size(); ++i) {

            SExpressionsParser.DecContext dec = ctx.decs.get(i);
            //Using the given dec to make a IdentifierContext variable
            SExpressionsParser.IdentifierContext id = dec.identifier();
            //Using the given dec to make a TypeContext variable
            SExpressionsParser.TypeContext type = dec.type();

            if (id.Idfr().getText().equals("main")) {
                found_main = true;
                found_index = i;
                //Boolean check
                if (dec.params.size() == 0) {
                    found_arg = true;
                }
                //Boolean check
                if (type.getText().equals("IntType")) {
                    found_int = true;
                }
            }
        }

        //ArrayList of string created with the size of dec
        ArrayList<String> list = new ArrayList<>(ctx.decs.size());
        //Used to go through each item in decs
        for (int i = 0; i < ctx.decs.size(); ++i) {
            //If the list has the same item as decs identifier i, it will throw an expection
            if (list.contains(ctx.decs.get(i).identifier().Idfr().getText())){
                throw new TypeException().duplicatedFuncError(ctx, ctx.decs.get(i).identifier(), Types.toType(ctx.decs.get(i).type()));
            } else {
                //If i is not in the list add i into it
                list.add(ctx.decs.get(i).identifier().Idfr().getText());
            }
            //Put String i into the hashmap
            global_funcs.put(ctx.decs.get(i).identifier().Idfr().getText(), ctx.decs.get(i));
        }

        //Used to check for main exception
        if (!found_main) {
            throw new TypeException().noMainFuncError();
        }

        //Used to find size exception
        if (!found_arg) {
            throw new TypeException().mainFuncError(ctx.decs.get(found_index),
                    ctx.decs.get(found_index).params.get(0),
                    Types.toType(ctx.decs.get(found_index).params.get(0).type()));
        }

        //Used to find Inttype exception
        if (!found_int) {
            throw new TypeException().mainFuncError(ctx, ctx.decs.get(found_index),
                    Types.toType(ctx.decs.get(found_index).type()));
        }


        //Loops through decs and visits through all he decs
        for (int i = 0; i < ctx.decs.size(); ++i) {
            visit(ctx.decs.get(i));
        }

        return Types.UNKNOWN;
    }

    @Override public Types visitDec(SExpressionsParser.DecContext ctx)
    {
        // TODO: modify and complete this method.

        current_dec = ctx;

        for (int i = 0; i < ctx.params.size(); ++i) {

            //Checks for UnitType exceptions
            if (ctx.params.get(i).type().getText().equals("UnitType")) {
                throw new TypeException().unitVarError(ctx, ctx.params.get(i).identifier(), Types.toType(ctx.params.get(i).type()));
            }

            //Checks for parameters, if duplicated throws exception
            for (int j = i+1; j < ctx.params.size(); ++j) {
                if (ctx.params.get(i).identifier().Idfr().getText().equals(ctx.params.get(j).identifier().Idfr().getText())) {
                    throw new TypeException().duplicatedVarError(ctx, ctx.params.get(j).identifier(),
                            Types.toType(ctx.params.get(j).type()));
                }
            }
            //Puts String, Type into the hashmap
            local_vars.put(ctx.params.get(i).identifier().Idfr().getText(), Types.toType(ctx.params.get(i).type()));
        }

        int lastIndexBlockExpres = ctx.block().exprs.size()-1;
        //Used to check if the type is equal to the actual type, if it isnt it will throw an exception
        if (!visit(ctx.block().exprs.get(lastIndexBlockExpres)).equals(Types.toType(current_dec.type()))) {
            throw new TypeException().functionBodyError(current_dec, ctx.block().exprs.get(lastIndexBlockExpres), visit(ctx.block().exprs.get(lastIndexBlockExpres)));
        }
        //
        if (Types.toType(ctx.type()) != visit(ctx.block())){
            throw new TypeException().functionBodyError(current_dec, ctx.block(), visit(ctx.block()));
        }
        return visit(ctx.block());
    }

    @Override public Types visitTyped_idfr(SExpressionsParser.Typed_idfrContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitType(SExpressionsParser.TypeContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitBlock(SExpressionsParser.BlockContext ctx)
    {

        // Used to visit the exprs
        for (int i = 0; i < ctx.exprs.size(); ++i) {
            visit(ctx.exprs.get(i));
        }

        return visit(ctx.exprs.get(ctx.exprs.size()-1));
    }

    @Override public Types visitIfExpr(SExpressionsParser.IfExprContext ctx)
    {

        // TODO: modify and complete this method.

        SExpressionsParser.ExprContext expr_context = ctx.expr();
        SExpressionsParser.BlockContext blockC1 = ctx.block(0);
        SExpressionsParser.BlockContext blockC2 = ctx.block(1);
        expr_context.t = visit(expr_context);
        int firstBlockExprIndex = blockC1.exprs.size()-1;
        int secondBlockExprIndex = blockC2.exprs.size()-1;

        // If not visited is equal to a boolean, it throws the exception
        if (!visit(ctx.expr()).equals(Types.BOOL)) {
            throw new TypeException().conditionError(ctx, expr_context, expr_context.t);
        }

        //Inverse equality exception
        if (!visit(blockC1.exprs.get(firstBlockExprIndex)).equals(visit(blockC2.exprs.get(secondBlockExprIndex)))) {
            throw new TypeException().branchMismatchError(ctx,
                    blockC1.exprs.get(firstBlockExprIndex), visit(blockC1.exprs.get(firstBlockExprIndex)),
                    blockC2.exprs.get(secondBlockExprIndex), visit(blockC2.exprs.get(secondBlockExprIndex)));
        }

        //check firstblock
        for (int i = 0; i < firstBlockExprIndex; ++i) {
            visit(blockC1.exprs.get(i));
        }

        // check secondblock
        for (int i = 0; i < secondBlockExprIndex; ++i) {
            visit(blockC2.exprs.get(i));
        }

        return visit(blockC2.exprs.get(secondBlockExprIndex));
    }

    @Override public Types visitBinExpr(SExpressionsParser.BinExprContext ctx)
    {
        // TODO: modify and complete this method.

        SExpressionsParser.ExprContext operand1 = ctx.expr(0);
        SExpressionsParser.ExprContext operand2 = ctx.expr(1);
        operand1.t = visit(operand1);
        operand2.t = visit(operand2);

        Types t = switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {
            //comparisonError for eq, less, lesseq, gtr, gtreq
            case SExpressionsParser.Eq, SExpressionsParser.Less, SExpressionsParser.LessEq, SExpressionsParser.Gtr,  SExpressionsParser.GtrEq -> {
                if (operand1.t != Types.INT || operand2.t != Types.INT) {
                    throw new TypeException().comparisonError(ctx, operand1, operand1.t, operand2, operand2.t);
                }
                yield Types.BOOL;
            }
            //
            case SExpressionsParser.Div,SExpressionsParser.Plus, SExpressionsParser.Minus, SExpressionsParser.Times-> {
                if (operand1.t != Types.INT || operand2.t != Types.INT) {
                    throw new TypeException().arithmeticError(ctx, operand1, operand1.t, operand2, operand2.t);
                }
                yield Types.INT;
            }
            //
            case SExpressionsParser.And, SExpressionsParser.Or, SExpressionsParser.Xor -> {
                if (operand1.t != Types.BOOL || operand2.t != Types.BOOL) {
                    throw new TypeException().logicalError(ctx, operand1, operand1.t, operand2, operand2.t);
                }
                yield Types.BOOL;
            }

            default -> throw new RuntimeException("Shouldn't be here - wrong binary operator.");
        };

        return t;
    }

    @Override public Types visitWhileExpr(SExpressionsParser.WhileExprContext ctx)
    {
        // TODO: modify and complete this method.

        SExpressionsParser.ExprContext op = ctx.expr();
        op.t = visit(op);
        SExpressionsParser.BlockContext block = ctx.block();
        int lastIndex = block.exprs.size()-1;

        //not visited = bool throw exception
        if (!visit(op).equals(Types.BOOL)) {
            throw new TypeException().conditionError(ctx, op, op.t);
        }

        //not visited = unit throw exception
        if (!visit(block).equals(Types.UNIT)) {
            throw new TypeException().loopBodyError(ctx, block.exprs.get(lastIndex), visit(block.exprs.get(lastIndex)));
        }
        return Types.UNIT;

    }

    @Override public Types visitRepeatExpr(SExpressionsParser.RepeatExprContext ctx)
    {
        SExpressionsParser.ExprContext op = ctx.expr();
        op.t = visit(op);
        SExpressionsParser.BlockContext block = ctx.block();
        int lastIndex = block.exprs.size()-1;

        //not visited = bool throw exception
        if (!visit(op).equals(Types.BOOL)) {
            throw new TypeException().conditionError(ctx, op, op.t);
        }

        //not visited = unit throw exception
        if (!visit(block).equals(Types.UNIT)) {
            throw new TypeException().loopBodyError(ctx, block.exprs.get(lastIndex), visit(block.exprs.get(lastIndex)));
        }
        return Types.UNIT;
    }

    @Override public Types visitAsgmtExpr(SExpressionsParser.AsgmtExprContext ctx)
    {
        // TODO: modify and complete this method.

        Boolean declared = false;
        SExpressionsParser.IdentifierContext idfrContext = ctx.identifier();
        SExpressionsParser.ExprContext exprContext = ctx.expr();
        Types typeIdfr = Types.UNKNOWN;
        Types typeExpr = visit(exprContext);
        //Loops through a hashmap
        for (String i: local_vars.keySet()) {
            //Checks if the idfr is equal to the hashmap
            if (ctx.identifier().Idfr().getText().equals(i)) {
                declared = true;
                typeIdfr = local_vars.get(i);
                break;
            }
        }

        //Exception when the local variable is not declared
        if (!declared) {
            throw new TypeException().undeclaredVarError(current_dec, ctx.identifier(), Types.UNKNOWN);
        }

        //Exception when assignment and typeExpr not same type
        if (!typeIdfr.equals(typeExpr)) {
            throw new TypeException().assignmentError(ctx, idfrContext, typeIdfr, exprContext, typeExpr);
        }

        return Types.UNIT;
    }

    @Override public Types visitFunInvocExpr(SExpressionsParser.FunInvocExprContext ctx)
    {
        // TODO: modify and complete this method.
        boolean implicit = true;
        //Checks the hashmap, checks if it contains the key idfr text
        if (global_funcs.containsKey(ctx.identifier().Idfr().getText())){
            implicit = false;
            //Checks if the block is size is not equal to the hashmap size, throws error
            if(ctx.block().exprs.size() != global_funcs.get(ctx.identifier().Idfr().getText()).params.size()){
                throw new TypeException().argumentNumberError(ctx,ctx.block(),Types.UNKNOWN);
            }
            for (int i = 0; i < ctx.block().exprs.size(); i++) {
                //Check if the visited block is not equal to the hashmap idfr type, throws argumentError
                if(!visit(ctx.block().exprs.get(i)).equals(Types.toType(global_funcs.get(ctx.identifier().Idfr().getText()).params.get(i).type()))){
                    throw new TypeException().argumentError(ctx,ctx.block().exprs.get(i),visit(ctx.block().exprs.get(i)));
                }
            }
        }
        if(implicit){
            throw new TypeException().undeclaredFuncError(current_dec,ctx.identifier(),Types.UNKNOWN);
        }
        return Types.toType(global_funcs.get(ctx.identifier().Idfr().getText()).type());
    }
    //Used to return the block exprs
    @Override public Types visitBlockExpr(SExpressionsParser.BlockExprContext ctx)
    {
        // TODO: modify and complete this method.
        visit(ctx.block());
        return visit(ctx.block().exprs.get(ctx.block().exprs.size()-1));
    }

    @Override public Types visitIdExpr(SExpressionsParser.IdExprContext ctx)
    {
        // TODO: modify and complete this method.

        Boolean declared = false;
        String str = "";
        //Loops through the keys
        for (String i: local_vars.keySet()) {
            //if idfr equals to the key declared will be true
            if (ctx.identifier().Idfr().getText().equals(i)) {
                declared = true;
                str = i;
                break;
            }
        }
        //if declared is false, throws undeclaredVarError
        if (!declared) {
            throw new TypeException().undeclaredVarError(current_dec, ctx.identifier(), Types.UNKNOWN);
        }

        return local_vars.get(str);
    }

    @Override public Types visitIntExpr(SExpressionsParser.IntExprContext ctx)
    {
        return Types.INT;
    }

    @Override public Types visitSkipExpr(SExpressionsParser.SkipExprContext ctx)
    {
        return Types.UNIT;
    }

    @Override public Types visitIdentifier(SExpressionsParser.IdentifierContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitInteger(SExpressionsParser.IntegerContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

    @Override public Types visitBinop(SExpressionsParser.BinopContext ctx)
    {
        throw new RuntimeException("Should not be here!");
    }

}