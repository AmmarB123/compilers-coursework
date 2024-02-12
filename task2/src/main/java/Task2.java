package main.java;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Task2 {

    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        SExpressionsLexer lexer = new SExpressionsLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        SExpressionsParser parser = new SExpressionsParser(tokens);
        ParseTree tree = parser.prog(); // begin parsing at prog rule

        SExpressionsAnalyser typeChecker = new SExpressionsAnalyser();
        try {
            System.out.println(typeChecker.visitAndPrint((SExpressionsParser.ProgContext) tree));
        } catch (TypeException ex) {
            System.out.println(ex.report());
        }
    }
}