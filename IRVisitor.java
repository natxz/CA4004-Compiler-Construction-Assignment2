import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IRVisitor extends calBaseVisitor<String> {
    SymbolTable symbolTable;
    int count;
    int temp;
    BufferedWriter bufferedWriter;

    public IRVisitor(String fileName) {
        super();
        this.symbolTable = new SymbolTable();
        this.count = 1;
        this.temp = 1;
        try {
            this.bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        }
        catch(IOException exc) {
            System.out.println("unsuccessful");
            exc.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public String visitProg(calParser.ProgContext ctx) {
        symbolTable.open();
        visit(ctx.decl_list());
        visit(ctx.function_list());
        visit(ctx.main());
        symbolTable.close(ctx);
        return "";
    }
    private void writeCo(String c) {
        try {
            bufferedWriter.write(c);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        catch (IOException exc) {
            System.out.println(" IR file unsuccessful");
            exc.printStackTrace(System.out);
            System.exit(1);
        }
    }

    @Override
    public String visitFuncLst(calParser.FuncLstContext ctx) {
        String type = ctx.function().getChild(0).getText();
        String id = visit(ctx.function());
        symbolTable.add(ctx, id, type);
        return id + visit(ctx.function_list());
    }

    @Override
    public String visitVarDecl(calParser.VarDeclContext ctx) {
        String id = ctx.Identifier().getText();
        String type = ctx.type().getText();
        symbolTable.add(ctx, id, "v," + type);
        return id;
    }

    @Override
    public String visitConstantDecl(calParser.ConstantDeclContext ctx) {
        String id = ctx.Identifier().getText();
        String type = ctx.type().getText();
        String expr = visit(ctx.expression());
        if(expr.charAt(0) == '-') {
            expr = "0 " + expr;
        }
        symbolTable.add(ctx, id, "c," + type);
        writeCo(" " + id + " = " + expr);
        return id;
    }

    @Override
    public String visitFuncDecl(calParser.FuncDeclContext ctx) {
        symbolTable.open();
        writeCo(ctx.Identifier() + ":");
        String par = visit(ctx.parameter_list());
        if(par != null) {
            getpar(par.split(","));
        }
        visit(ctx.decl_list());
        visit(ctx.statement_block());
        if(ctx.expression() != null) {
            String expr = visit(ctx.expression());
            writeCo(" return " + expr);
            symbolTable.close(ctx);
            return expr;
        }
        else {
            writeCo(" return");
            symbolTable.close(ctx);
            return "";
        }
    }

    @Override
    public String visitParType(calParser.ParTypeContext ctx) {
        return ctx.Identifier().getText();
    }

    @Override
    public String visitParTypeHead(calParser.ParTypeHeadContext ctx) {
        return ctx.Identifier() + "," + visit(ctx.nemp_parameter_list());
    }

    @Override
    public String visitStmtAssign(calParser.StmtAssignContext ctx) {
        String id = ctx.Identifier().getText();
        String expr = visit(ctx.expression());
        if(expr.charAt(0) == '-') {
            expr = "0 " + expr;
        }
        writeCo(" " + id + " = " + expr);
        return id;
    }

    @Override
    public String visitStmtFunCall(calParser.StmtFunCallContext ctx) {
        String id = ctx.Identifier().getText();
        String arg = visit(ctx.arg_list());
        int count = 0;
        if(arg != null) {
            String[] splitArg = arg.split(",");
            createArg(splitArg);
            count = splitArg.length;
        }
        writeCo(" call " + id + ", " + count);
        return id;
    }

   

    @Override
    public String visitExpFunCall(calParser.ExpFunCallContext ctx) {
        String id = ctx.Identifier().getText();
        String[] arg = visit(ctx.arg_list()).split(",");
        createArg(arg);
        String temp = temp();
        writeCo(" temporary = call " + id + ", " + arg.length);
        return temp;
    }

    @Override
    public String visitNempID(calParser.NempIDContext ctx) {
        return ctx.Identifier().getText();
    }

    @Override
    public String visitNempArgLst(calParser.NempArgLstContext ctx) {
        return ctx.Identifier().getText() + "," + visit(ctx.nemp_arg_list());
    }

    @Override
    public String visitBitID(calParser.BitIDContext ctx) {
        return ctx.Identifier().getText();
    }


    @Override
    public String visitBitNeg(calParser.BitNegContext ctx) {
        return ctx.Identifier().getText();
    }

    @Override
    public String visitBitTru(calParser.BitTruContext ctx) {
        return "True";
    }

    @Override
    public String visitBitFals(calParser.BitFalsContext ctx) {
        return "False";
    }

    @Override
    public String visitConNeg(calParser.ConNegContext ctx) {
        return "~ " + visit(ctx.condition());
    }

    @Override
    public String visitConParens(calParser.ConParensContext ctx) {
        return visit(ctx.condition());
    }

    @Override
    public String visitConComp(calParser.ConCompContext ctx) {
        String left = visit(ctx.expression(0));
        String right = visit(ctx.expression(1));
        return left + " " + right;
    }

    @Override
    public String visitConBinOp(calParser.ConBinOpContext ctx) {
        String left = visit(ctx.condition(0));
        String right = visit(ctx.condition(1));
        return left + " " + right;
    }

    @Override
    public String visitMain(calParser.MainContext ctx) {
        symbolTable.open();
        writeCo("main:");
        visit(ctx.decl_list());
        visit(ctx.statement_block());
        symbolTable.close(ctx);
        return "";
    }

    private void createArg(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            writeCo(" par  " + args[i]);
        }
    }
    private String temp() {
        String temp1 = "temporary" + temp;
        temp ++;
        return temp1;
    }

    private void getpar(String[] par) {
        for(int i = 0; i < par.length; i++) {
            writeCo(" " + par[i] + " = fetch parameters " + (i + 1));
        }
    }

    
}