import org.antlr.v4.runtime.*;

public class calErrorListener extends BaseErrorListener {
    private boolean hasSyntaxErrors = false;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPosition,
                            String msg,
                            RecognitionException e)
    {
        this.hasSyntaxErrors = true;
    }
    public boolean getSyntaxErrors(){
        return this.hasSyntaxErrors;
    }
}