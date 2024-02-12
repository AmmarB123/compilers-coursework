package main.java;
import org.antlr.v4.runtime.tree.TerminalNode;

public enum Types {
    INT, BOOL, UNIT, UNKNOWN;

    public static Types toType(SExpressionsParser.TypeContext type)
    {

        Types t = switch (((TerminalNode) (type.getChild(0))).getSymbol().getType()) {

            case SExpressionsParser.IntType -> INT;

            case SExpressionsParser.BoolType -> BOOL;

            case SExpressionsParser.UnitType -> UNIT;

            default -> throw new RuntimeException("Shouldn't be here - wrong argument for Types.toType().");

        };
        return t;
    }
}

