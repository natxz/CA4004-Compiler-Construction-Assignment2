grammar cal;

prog: decl_list function_list main;  

decl_list: decl SEMI decl_list |;  

decl: var_decl | const_decl;     

var_decl: Variable Identifier COLON type                              #VarDecl
;                         

const_decl: Constant Identifier COLON type ASSIGN expression             #ConstantDecl
;      

function_list: function function_list                                   #FuncLst
|                                                                       #EmptyFunc
 ;

function: type Identifier LBR parameter_list RBR Is decl_list Begin statement_block Return LBR (expression |)   
     RBR SEMI End                                                  #FuncDecl
        ;

type: TypeInteger                                               #TypeInt
    | TypeBoolean                                               #TypeBool
    | TypeVoid                                                  #TypeVoid
    ;

parameter_list: nemp_parameter_list |; 

nemp_parameter_list: Identifier COLON type                          #ParType
    | Identifier COLON type COMMA nemp_parameter_list               #ParTypeHead
    
    ;                                                          

main:  Main Begin decl_list statement_block End;

statement_block: ( statement statement_block ) |;

statement: Identifier ASSIGN expression SEMI                                    #StmtAssign                                                                                 
    | Identifier LBR arg_list RBR SEMI                                          #StmtFunCall                                
    | Begin statement_block End                                                 #StmtBeg                                    
    | If condition Begin statement_block End Else Begin statement_block End     #StmtIf                                
    | While condition Begin statement_block End                                 #StmtWhle                                
    | Skipp SEMI                                                               #StmtSkip                                
        ;

expression: bit binary_arith_op bit                                            #ExpBinOp                                                                                                              
    | LBR expression RBR                                                        #ExpParens                                
    | Identifier LBR arg_list RBR                                               #ExpFunCall                                
    | bit                                                                      #ExpBit                               
    ;

binary_arith_op:  PLUS | MINUS ;    

bit: Identifier                                                #BitID
| MINUS Identifier                                             #BitNeg                                            
| Number                                                       #BitNum
| True                                                         #BitTru
| False                                                       #BitFals
;

condition: TILDE condition                                     #ConNeg                                                      
    | LBR condition RBR                                        #ConParens                                                                                         
    | expression comp_op expression                            #ConComp
    | condition  (OR | AND) condition                          #ConBinOp                                                                         
    ;

comp_op: EQUAL | NOTEQUAL | LESS | LESSEQUAL | GREATER | GREATEREQUAL; 

arg_list: nemp_arg_list |;                                

nemp_arg_list: Identifier                                       #NempID                     
| Identifier COMMA nemp_arg_list                               #NempArgLst                                                  
;

// reserved words
Variable: V A R I A B L E;
Constant: C O N S T A N T;
Return: R E T U R N;
TypeInteger: I N T E G E R;
TypeBoolean: B O O L E A N;
TypeVoid: V O I D;
Main: M A I N;
If: I F;
Else: E L S E;
True: T R U E;
False: F A L S E;
While: W H I L E;
Begin: B E G I N;
End: E N D;
Is: I S;
Skipp:					S K I P;

//tokens
COMMA:					',';
SEMI:					';';
COLON:					':';
ASSIGN:					':=';
LBR:					'(';
RBR:					')';
PLUS:					'+';
MINUS:					'-';
TILDE:					'~';
NOTEQUAL:				'!=';
OR:						'|';
AND:					'&';
EQUAL:					'=';
LESSEQUAL:				'<=';
LESS:					'<';
GREATER:				'>';
GREATEREQUAL:			'>=';


//Removed X,Z,Q and J as they are not used 
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment Y:('y'|'Y');


Number:					('-'?[1-9][0-9]* | '0');
Identifier:				[a-zA-Z][a-zA-Z0-9_]*;
COMMENT:				'/*' (COMMENT |.)*? '*/' -> skip;
LINE_COMMENT:			'//' ~[\r\n]* -> skip;
WS:						[ \t\n\r]+ -> skip;














