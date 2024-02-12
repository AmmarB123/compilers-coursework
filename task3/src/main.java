import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class main {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        SExpressionsLexer lexer = new SExpressionsLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        SExpressionsParser parser = new SExpressionsParser(tokens);
        ParseTree tree = parser.prog(); // begin from non-terminal "prog"

        Worker worker = new Worker();
        System.out.println(worker.visit(tree));
    }
}
