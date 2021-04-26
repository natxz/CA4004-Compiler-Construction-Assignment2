import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends calBaseVisitor<String>
{
	SymbolTable symbolTable = new SymbolTable();
	
	@Override
    public String visitProg(calParser.ProgContext ctx){ // global scope
        symbolTable.open();
        visit(ctx.decl_list());
        visit(ctx.function_list());
        visit(ctx.main());
        symbolTable.close(ctx);
        return "";
    }

	@Override
	public String visitVarDecl (calParser.VarDeclContext ctx){
		String id = ctx.Identifier().getText();
		String type = visit(ctx.type());
		symbolTable.add(ctx, id, "value," + type);
		return type;
	}

	@Override
	public String visitConstantDecl (calParser.ConstantDeclContext ctx){
		String id = ctx.Identifier().getText();
		String type = visit(ctx.type()); 
		String valType = visit(ctx.expression());
		if (!valType.equals(type)) {
            System.out.println("wrong value type");
        }
		symbolTable.add(ctx, id, "constant," + type);
		return type;
		
	}

	@Override
	public String visitFuncDecl (calParser.FuncDeclContext ctx)
	{
		String id = ctx.Identifier().getText();
		String type = visit(ctx.type());
        symbolTable.open();
        String parList = visit(ctx.parameter_list());
        String parType = parList == null ? "n" : parList;
        visit(ctx.decl_list());
        visit(ctx.statement_block());
        String visitExpr = visit(ctx.expression());
        String returnType = visitExpr == null ? "v" : visitExpr;
        if(!returnType.equals(type)){
            System.out.println("Error, wrong type");
        }
        symbolTable.close(ctx);
        return type;
	}

	@Override
    public String visitFuncLst(calParser.FuncLstContext ctx) {
        symbolTable.undoSt.push(ctx.function().getChild(1).getText());
        return visit(ctx.function()) + visit(ctx.function_list());
    }

    @Override
    public String visitTypeInt(calParser.TypeIntContext ctx) {
        return "Integer";
    }

    @Override
    public String visitTypeBool(calParser.TypeBoolContext ctx) {
        return "Boolean";
    }

    @Override
    public String visitTypeVoid(calParser.TypeVoidContext ctx) {
        return "Void";
    }


	@Override
	public String visitParType (calParser.ParTypeContext ctx)
	{
		String id  = ctx.Identifier().getText();
        String type = visit(ctx.type());
        symbolTable.add(ctx, id, "variable," + type);
        return type;
	}

	@Override
	public String visitParTypeHead (calParser.ParTypeHeadContext ctx)
	{
		String id = ctx.Identifier().getText();
		String type =visit(ctx.type());
		symbolTable.add(ctx, id, "variable," + type);
		return type+ "," + visit(ctx.nemp_parameter_list());
	}

	@Override
	public String visitStmtAssign (calParser.StmtAssignContext ctx)
	{
		String id = ctx.Identifier().getText();
        if(symbolTable.getTable(id)== null){
            System.out.println(id + "has not been declared yet");
        }
        ArrayList<String> memList = parseTable(symbolTable.getTable(id));
        String desc = memList.get(0);
        if(!desc.equals("variable")) {
           System.out.println(id + "is not a variable");
        }
        String type = memList.get(1);
        String value = visit(ctx.expression());
        if(!type.equals(value)) {
            System.out.println("error, wrong type");
        }
        return value;
	}

	@Override
	public String visitStmtFunCall( calParser.StmtFunCallContext ctx){
		String id = ctx.Identifier().getText();
        if(symbolTable.getTable(id) == null) {
            System.out.println("has not been declared yet");
        }
        ArrayList<String> parType = parseTable(symbolTable.getTable(id));
        if(!parType.get(0).equals("f")) {
            System.out.println("err, not a function");
        }
        String functionParameter = parType.get(1);
        String argumentList = visit(ctx.arg_list());
        String passedArguments = argumentList == null ? "n" : argumentList;
        if(!functionParameter.equals(passedArguments)) {
        	System.out.println("erro, wrong arguemnt");
        }
        return parType.get(2);
	}
	@Override
	public String visitExpBinOp(calParser.ExpBinOpContext ctx)
	{
		String left = visit(ctx.bit(0));
		String right = visit (ctx.bit(1));
		if(!left.equals("i") && !right.equals("i")) {
            System.out.println("must be integer type");
        }
        return left;
	}

	@Override
    public String visitExpFunCall(calParser.ExpFunCallContext ctx) {
        String id = ctx.Identifier().getText();
        if(symbolTable.getTable(id) == null) {
            System.out.println("has not been declared yet");
        }
        ArrayList<String> parST = parseTable(symbolTable.getTable(id));
        String idType = parST.get(1);
        String parType = visit(ctx.arg_list());
        if(!idType.equals(parType)) {
        	System.out.println("error, Type has to be the same");
        }
        return parST.get(2);
    }	
    


	@Override
	public String visitConParens (calParser.ConParensContext ctx)
	{
		String con = visit(ctx.condition());
        if(!con.equals("Boolean")) {
            System.out.println("not a boolean type");
        }
        return con;	
    }

	@Override
	public String visitConComp (calParser.ConCompContext ctx)
	{
		String expr1 = visit(ctx.expression(0));
		String expr2 = visit (ctx.expression(1));
		if (!expr1.equals(expr2))
			System.out.println("must be same type");
		return "Boolean";
	}
	@Override
	public String visitConBinOp (calParser.ConBinOpContext ctx){
		String con1 = visit(ctx.condition(0));
		String con2 = visit (ctx.condition(1));
		if (!con1.equals("Boolean") && !con2.equals("Boolean"));
			System.out.println("must be same boolean type");
		return con1;
	}

	  public String visitMain(calParser.MainContext ctx) {
        symbolTable.open();
        visit(ctx.decl_list());
        visit(ctx.statement_block());
        symbolTable.close(ctx);
        return "";
    }
	 public ArrayList<String> parseTable(String s){
        ArrayList<String> parseList = new ArrayList<>();
        int len = s.length();
        parseList.add(s.substring(0,1));
        if(parseList.get(0).equals("f")){
            parseList.add(s.substring(2, len-2));
            parseList.add(s.substring(len-1));
        }
        else {
            parseList.add(s.substring(2));
        }
        return parseList;
    }
}