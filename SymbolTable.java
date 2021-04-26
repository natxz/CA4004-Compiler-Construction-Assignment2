import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    Map<String, LinkedList<String>> symbolTable = new HashMap<>();
    LinkedList<String> undoSt = new LinkedList<>();

    public void open() {
        undoSt.push("Start");
    }

    public void close(ParserRuleContext ctx) {
        String popped = undoSt.pop();
        while(!popped.equals("Start")) {
            remove(ctx, popped);
            popped = undoSt.pop();
        }
    }

    public Boolean InScope(String ID) {
        for(String s : undoSt) {
            if(s.equals("Start")){
                return false;
            }
            else if(s.equals(ID)){
                return true;
            }
        }
        return false;
    }

    public void add(ParserRuleContext ctx, String ID, String value){
        if (!InScope(ID)){
            if (symbolTable.containsKey(ID)) {
                LinkedList<String> symbolTableValues = symbolTable.get(ID);
                symbolTableValues.push(value);
                symbolTable.put(ID, symbolTableValues);
            }
            else {
                LinkedList<String> symbolTableList = new LinkedList<>();
                symbolTableList.add(value);
                symbolTable.put(ID, symbolTableList);
            }
        }
        else {
            tableError(ctx, ID + " has already been declared in the scope");
        }
    }

    public void remove(ParserRuleContext ctx, String ID) {
        if(symbolTable.containsKey(ID)) {
            LinkedList<String> symbolTableValues = symbolTable.get(ID);
            if(symbolTableValues.size() > 1){
                symbolTableValues.pop();
                symbolTable.put(ID, symbolTableValues);
            }
            else {
                symbolTable.remove(ID);
            }
        } 
        else {
            tableError(ctx, ID + " does not exist in the symbolTable");
        }
    }
    public String getTable(String ID) {
        return symbolTable.get(ID).getFirst();
    }

    public void tableError(ParserRuleContext ctx, String error){
        System.out.println(ctx.getStart().getLine() + " | " + error);
        System.exit(1);
    }
}