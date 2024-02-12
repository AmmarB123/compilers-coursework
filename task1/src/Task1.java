import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Task1 {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        Task1Lexer lexer = new Task1Lexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        Task1Parser parser = new Task1Parser(tokens);
        ParseTree tree = parser.prog(); // begin from non-terminal "prog"

        Task1Worker worker = new Task1Worker();
        System.out.println(G5035_S_Expression_PrettyPrinter.prettyPrint(worker.visit(tree)));
    }
}

