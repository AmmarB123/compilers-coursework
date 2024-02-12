public class Task1Worker extends Task1BaseVisitor <String> {

    //Start of the code where we declare the stringbuider and visit prog
    @Override
    public String visitWholeexpr(Task1Parser.WholeexprContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[" );
        sb.append(visit(ctx.prog()));
        sb.append("]");
        return sb.toString();
    }
    //Go through i, append an item each time dec is visited, if dec is the last index add a comma
    @Override
    public String visitProg(Task1Parser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < ctx.dec().size(); ++i) {
            sb.append(visit(ctx.dec().get(i)));
            if (i != ctx.dec().size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //Converting DEC into S-expression with idfr type and vardec
    @Override
    public String visitDec(Task1Parser.DecContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Title
        sb.append("FunDecl");
        sb.append(",");
        sb.append(visit(ctx.idfr()));
        sb.append(",");
        sb.append(visit(ctx.types()));
        sb.append(",");
        sb.append("[");
        sb.append(visit(ctx.vardec()));
        sb.append("]");
        sb.append(",");
        sb.append(visit(ctx.block()));
        sb.append("]");
        return sb.toString();
    }
    //Coverting Vardec into an S expression
    @Override
    public String visitVardec(Task1Parser.VardecContext ctx) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ctx.vardecne().size(); ++i) {
            sb.append(visit(ctx.vardecne().get(i)));
            //Appends a comma to the last index
            if(i < ctx.vardecne().size() - 1){
                sb.append(",");
            }

        }

        return sb.toString();
    }
    //Coverting Vardecne into an S expression
    @Override
    public String visitVardecne(Task1Parser.VardecneContext ctx) {
        StringBuilder sb = new StringBuilder();
            //Changing each child IDFR into a string and adding it to our string
            for (int i = 0; i < ctx.idfr().size() - 1; ++i) {
                sb.append("[");
                sb.append(visit(ctx.idfr().get(i)));
                sb.append(",");
                sb.append(visit(ctx.types().get(i)));
                sb.append("]");
                sb.append(",");
            }
        sb.append("[");
            //Appendingg the last idfr
        sb.append(visit(ctx.idfr().get(ctx.idfr().size() - 1)));
        sb.append(",");
        //Appedning the last type
        sb.append(visit(ctx.types().get(ctx.idfr().size() - 1)));
        sb.append("]");
        return sb.toString();
    }

    //Converting the BLOCK into an S expression
    @Override public String visitBlock(Task1Parser.BlockContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Changing each child ene into a string and adding it to our string
        for(int i = 0; i < ctx.ene.size(); ++i) {
            sb.append(visit(ctx.ene.get(i)));
            if (i != ctx.ene.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }



    //Making the assignment exp into S expression
    @Override
    public String visitAssignmentExp(Task1Parser.AssignmentExpContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Title
        sb.append("Asgmt");
        sb.append(",");
        //Visited idfr gets appended
        sb.append(visit(ctx.idfr()));
        sb.append(",");
        //Visited exp gets appended
        sb.append(visit(ctx.exp()));
        sb.append("]");
        return sb.toString();
    }
    //Making the visitBinaryOpExp into S expression
    @Override
    public String visitBinaryOpExp(Task1Parser.BinaryOpExpContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Title
        sb.append("BinOpExpr");
        sb.append(",");
        //Visited binop gets appended
        sb.append(visit(ctx.binop()));
        sb.append(",");
        //Visited expr index 0 gets appended
        sb.append(visit(ctx.exp(0)));
        sb.append(",");
        //Visited expr index 1 gets appended
        sb.append(visit(ctx.exp(1)));
        sb.append("]");
        return sb.toString();
    }
    //Making the ArgsExp S expression
    @Override
    public String visitArgsExp(Task1Parser.ArgsExpContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Title
        sb.append("FunInvoc");
        sb.append(",");
        sb.append(visit(ctx.idfr()));
        sb.append(",");
        sb.append("[");
        //Visited args gets appended
        sb.append(visit(ctx.args()));
        sb.append("]");
        sb.append("]");
        return sb.toString();
    }
    //Making the IfExp S expression
    @Override
    public String visitIfExp(Task1Parser.IfExpContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Title
        sb.append("IfStmt");
        sb.append(",");
        sb.append(visit(ctx.exp()));
        sb.append(",");
        //Visited block index 0 gets appended
        sb.append(visit(ctx.block(0)));
        sb.append(",");
        //Visited block index 1 gets appended
        sb.append(visit(ctx.block(1)));
        sb.append("]");
        return sb.toString();
    }
    //Making the WhileExp S exp
    @Override
    public String visitWhileExp(Task1Parser.WhileExpContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Title
        sb.append("WhileLoop");
        sb.append(",");
        sb.append(visit(ctx.exp()));
        sb.append(",");
        sb.append(visit(ctx.block()));
        sb.append("]");
        return sb.toString();
    }
    //Making RepeatExp S expression
    @Override
    public String visitRepeatExp(Task1Parser.RepeatExpContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //Title
        sb.append("RepeatLoop");
        sb.append(",");
        sb.append(visit(ctx.exp()));
        sb.append(",");
        sb.append(visit(ctx.block()));
        sb.append("]");
        return sb.toString();
    }
    //Checking adding the args into the string
    @Override
    public String visitArgs(Task1Parser.ArgsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.argsne().size(); ++i) {
            sb.append(visit(ctx.argsne().get(i)));
        }
        return sb.toString();
    }
    //Changing each child EXP into a string and adding it to our string
    @Override
    public String visitArgsne(Task1Parser.ArgsneContext ctx) {
        StringBuilder sb = new StringBuilder();
        //Goes through the exp
        for (int i = 0; i < ctx.exp().size(); ++i) {
            sb.append(visit(ctx.exp().get(i)));
            //If the size is not equal add a comma
            if (i != ctx.exp().size() - 1) {
                sb.append(",");
            }
        }

        return sb.toString();
    }


    @Override
    public String visitIDTFR(Task1Parser.IDTFRContext ctx) {
        return "Idfr(\"" + ctx.IDENTIFIER().getText()  + "\")";
    }

    @Override
    public String visitIntExp(Task1Parser.IntExpContext ctx) {
        return "IntLit(" + ctx.IntLit().getText() + ")";
    }

    @Override
    public String visitSkipExp(Task1Parser.SkipExpContext ctx) {
        return "Skip";
    }

    @Override
    public String visitIntergerType(Task1Parser.IntergerTypeContext ctx) {
        return "IntType";
    }

    @Override
    public String visitBooleanType(Task1Parser.BooleanTypeContext ctx) {
        return "BoolType";
    }

    @Override
    public String visitUnitsType(Task1Parser.UnitsTypeContext ctx) {
        return "UnitType";
    }

    @Override
    public String visitLessOP(Task1Parser.LessOPContext ctx) {
        return "Less";
    }

    @Override
    public String visitLessEqOP(Task1Parser.LessEqOPContext ctx) {
        return "LessEq";
    }

    @Override
    public String visitAndOP(Task1Parser.AndOPContext ctx) {
        return "And";
    }


    @Override
    public String visitXorOP(Task1Parser.XorOPContext ctx) {
        return "Xor";
    }

    @Override
    public String visitEqOP(Task1Parser.EqOPContext ctx) {
        return "Eq";
    }


    @Override
    public String visitGtrOP(Task1Parser.GtrOPContext ctx) {
        return "Gtr";
    }


    @Override
    public String visitGtrEqOP(Task1Parser.GtrEqOPContext ctx) {
        return "GtrEq";
    }


    @Override
    public String visitOrOP(Task1Parser.OrOPContext ctx) {
        return "Or";
    }

    @Override
    public String visitTimesOP(Task1Parser.TimesOPContext ctx) {
        return "Times";
    }

    @Override
    public String visitDivOP(Task1Parser.DivOPContext ctx) {
        return "Div";
    }

    @Override
    public String visitMinusOP(Task1Parser.MinusOPContext ctx) {
        return "Minus";
    }

    @Override
    public String visitPlusOP(Task1Parser.PlusOPContext ctx) {
        return "Plus";
    }




}


