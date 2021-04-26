import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;

public class cal {
    public static void main (String[] args) throws Exception {
        String inputFile = null;
        String outputFile = null;

        if (args.length > 0) {
            inputFile = args [0];
            if(args.length == 2) {
                outputFile = args[1];
            }
        }

        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        
        if(outputFile == null) {
            outputFile = ("output.ir");
        }

        calLexer lex = new calLexer (CharStreams.fromStream (is));
        CommonTokenStream tokes = new CommonTokenStream (lex);
        calParser parse = new calParser (tokes);
        parse.removeErrorListeners();
        lex.removeErrorListeners();
        calErrorListener errorListener = new calErrorListener();
        parse.addErrorListener(errorListener);
        lex.addErrorListener(errorListener);
        ParseTree tree = parse.prog();
        
        if(errorListener.getSyntaxErrors()) {
            System.out.println(inputFile + " has not parsed");
        }
        else {
            System.out.println(inputFile + " parsed successfully");
        }
        EvalVisitor EvalV = new EvalVisitor();
        EvalV.visit(tree);
        System.out.println("Evaluation success");

        IRVisitor IRPass = new IRVisitor(outputFile);
        IRPass.visit(tree);
        System.out.println("IR completed"); 
    }
}