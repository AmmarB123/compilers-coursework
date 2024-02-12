/*
    An implementation of an error reporting class, usable as an exception.
    This depends on the definition of a class 'ParseTree' to represent S-expressions,
    and 'Types' to represent types of S-expressions.

    The intended use is through some methods which produce a new instance of the exception,
    tailored to the particular variety of error. For instance:

    // If there is an binop expression "a + b" where a.t is Types.INT, and b.t is Types.UNIT:
    throw new TypeException().arithmeticError(binop, a, a.t, b, b.t);

    // There is an if statement "if (4<5) then { a } else { b }", where a.t != b.t,
    // but we require 'then' and 'else' branches to have the same type:
    throw new TypeException().branchMismatchError(ifstmt, a, a.t, b, b.t);

    This version is a prototype, and is provided as-is: it should be tailored to better fit the coursework.
    I disclaim any warranty (expressed or implied) that it is fit for purpose, or is in any other way well-written.
    --- JRNB (2021-09-14, ca 17.15 BST)

    Feel free to modify the interfaces, arguments, etc., but please keep the generated output identical.
    --- Hsi-Ming Ho
*/
package main.java;

import org.antlr.v4.runtime.tree.ParseTree;

public class TypeException extends RuntimeException
{

    private SExpressionsToString toStrConverter = new SExpressionsToString();

    // We break down error reporting into three parts: a message, a code snippet, and diagnostic information.
    private String msg;
    private String snippet;
    private String diag;

    public TypeException()
    {
        super();
    }

    // Error information is to be determined separately on a case-by-case basis (see below).
    public TypeException(String errmsg)
    {
        msg = errmsg;
    }

    // A method to generate a report of the error as a string.
    public String report()
    {
        return msg + ":\n\n" + snippet + "\n\n---\n\n" + diag;
    }

    // A helper method for formatting, producing a string with the format: 'someExpr' has type someType
    private String typeQuoteExpr (ParseTree e, Types t)
    {
        return (toStrConverter.visitHighlight(e, e) + "\n\nhas type " + t.toString());
    }

    // A helper method to provide consistent formatting for errors to do with single expressions with context
    private void unaryExpressionContextReport(ParseTree context, ParseTree e, Types t)
    {
        snippet = toStrConverter.visitHighlight(context, e);
        diag = typeQuoteExpr(e, t);
    }

    // A helper method to provide consistent formatting for errors to do with binary expressions with context
    private void binaryExpressionContextReport(ParseTree context, ParseTree e1, Types t1, ParseTree e2, Types t2)
    {
        snippet = toStrConverter.visitHighlight(context, e1) + "\n\nand\n\n" + toStrConverter.visitHighlight(context, e2);
        diag = typeQuoteExpr(e1, t1) + "\n\n,\n\n" + typeQuoteExpr(e2, t2);
    }

    // A method to produce an exception for the 'no main function' error.
    public TypeException noMainFuncError()
    {
        msg = "No main function declared";
        snippet = "";
        diag = "no further diagnostic messages available";
        return this;
    }

    // A method to produce an exception for errors regarding main's signature
    // In this case, either context is 'prog', param is main's 'dec', t is dec.type,
    // or context is main's 'dec', param is the first 'typed_idfr' in its argument list, and t is typed_idfr.type.
    public TypeException mainFuncError(ParseTree tree, ParseTree param, Types t)
    {
        msg = "Error in the signature of the main function";
        unaryExpressionContextReport(tree, param, t);
        return this;
    }

    // A method to produce an exception for duplicated function names
    // In this case, context is 'prog' and f is the first instance of such 'identifier'.
    public TypeException duplicatedFuncError(ParseTree prog, ParseTree id, Types t)
    {
        msg = "Duplicated function names";
        unaryExpressionContextReport(prog, id, t);
        return this;
    }

    // A method to produce an exception for duplicated local variable names
    // In this case, context is 'dec' and id is the first instance of such 'identifier'.
    public TypeException duplicatedVarError(ParseTree dec, ParseTree id, Types t)
    {
        msg = "Duplicated variable names";
        unaryExpressionContextReport(dec, id, t);
        return this;
    }

    // A method to produce an exception for local variables of 'unit' type.
    // In this case, context is 'dec' and id is the 'identifier'.
    public TypeException unitVarError(ParseTree dec, ParseTree id, Types t)
    {
        msg = "Variable of 'unit' type";
        unaryExpressionContextReport(dec, id, t);
        return this;
    }

    // A method to produce an exception for undeclared function name
    // In this case, context is a the enclosing dec (as recorded by current_dec), id is an 'identifier', and t is Types.UNKNOWN.
    public TypeException undeclaredFuncError(ParseTree dec, ParseTree id, Types t)
    {
        msg = "Unknown function name";
        unaryExpressionContextReport(dec, id, t);
        return this;
    }

    // A method to produce an exception for undeclared local variable name
    // In this case, context is the enclosing dec (as recorded by current_dec), id is an 'identifier', and t is Types.UNKNOWN.
    public TypeException undeclaredVarError(ParseTree dec, ParseTree id, Types t)
    {
        msg = "Unknown variable name";
        unaryExpressionContextReport(dec, id, t);
        return this;
    }

    // A method to produce an exception related to mis-typed comparisons of integer values
    // In this case, context is the binop statement, e1, e2 are two expressions involved, t1, t2 are e1.t and e2.t.
    public TypeException comparisonError(ParseTree binop, ParseTree e1, Types t1, ParseTree e2, Types t2)
    {
        msg = "Invalid operands in integer comparison";
        binaryExpressionContextReport(binop, e1, t1, e2, t2);
        return this;
    }

    // A method to produce an exception related to mis-typed arithmetic expressions
    // In this case, context is the binop statement, e1, e2 are two expressions involved, t1, t2 are e1.t and e2.t.
    public TypeException arithmeticError(ParseTree binop, ParseTree e1, Types t1, ParseTree e2, Types t2)
    {
        msg = "Invalid operands in arithmetic expression";
        binaryExpressionContextReport(binop, e1, t1, e2, t2);
        return this;
    }

    // A method to produce an exception related to mis-typed Boolean expressions
    // In this case, context is the binop statement, e1, e2 are two expressions involved, t1, t2 are e1.t and e2.t.
    public TypeException logicalError(ParseTree binop, ParseTree e1, Types t1, ParseTree e2, Types t2)
    {

        msg = "Invalid operands in Boolean expression";
        binaryExpressionContextReport(binop, e1, t1, e2, t2);
        return this;
    }

    // A method to produce an exception for 'if' statements, in which
    // the 'then' branch and the 'else' branch have different types.
    // In this case, context is the ifStmt, and e1, e2 are the two 'last' expressions in the respective blocks.
    // and t1, t2 are e1.t and e2.t.
    public TypeException branchMismatchError(ParseTree stmt, ParseTree e1, Types t1, ParseTree e2, Types t2)
    {
        msg = "Mismatched expressions in if statement";
        binaryExpressionContextReport(stmt, e1, t1, e2, t2);
        return this;
    }

    // A method to produce an exception for if/loop conditions which are not of type bool
    // In this case, context is the ifStmt, e is the expression for condition, t is e.t.
    public TypeException conditionError(ParseTree stmt, ParseTree e, Types t)
    {
        msg = "Invalid condition in if statement or loop";
        unaryExpressionContextReport(stmt, e, t);
        return this;
    }

    // A method to produce an exception related to expressions in loop body
    // In this case, context is the loop statement, e is final expression of the body (block), t is e.t.
    public TypeException loopBodyError(ParseTree stmt, ParseTree e, Types t)
    {
        msg = "Invalid final expression in loop body";
        unaryExpressionContextReport(stmt, e, t);
        return this;
    }

    // A method to produce an exception related to expressions in function body
    // In this case, context is the dec, and e is final expression of the body (block), t is e.t.
    public TypeException functionBodyError(ParseTree dec, ParseTree e, Types t)
    {
        msg = "Invalid return value type";
        unaryExpressionContextReport(dec, e, t);
        return this;
    }

    // A method to produce an exception related to assignment
    // In this case, context is the assignment statement, and e1 and e2 are lhs (identifier) and rhs (expr), t1 and t2 are e1.t and e2.t.
    public TypeException assignmentError(ParseTree stmt, ParseTree e1, Types t1, ParseTree e2, Types t2)
    {
        msg = "Incompatible types in assignment";
        binaryExpressionContextReport(stmt, e1, t1 ,e2, t2);
        return this;
    }

    // A method to produce an exception related to argument list mismatches
    // In this case, context is the invocation statement, and e the block of arguments, t is Types.UNKNOWN.
    public TypeException argumentNumberError(ParseTree stmt, ParseTree e, Types t)
    {
        msg = "Invalid # of arguments in invocation";
        unaryExpressionContextReport(stmt, e, t);
        return this;
    }

    // A method to produce an exception related to argument type mismatches
    // In this case, context is the invocation statement, and e the argument expression, t is e.t.
    public TypeException argumentError(ParseTree stmt, ParseTree e, Types t)
    {
        msg = "Invalid argument in invocation";
        unaryExpressionContextReport(stmt, e, t);
        return this;
    }

}
