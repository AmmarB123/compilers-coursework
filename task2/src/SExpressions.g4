grammar SExpressions;

prog
    : '[' decs+=dec (Comma decs+=dec)* ']' EOF
;

dec
    : '[' FunDecl Comma identifier Comma type Comma '[' (params+=typed_idfr (Comma params+=typed_idfr)*)? ']' Comma block ']'
;

typed_idfr
    : '[' identifier Comma type ']'
;

type
    : IntType
    | BoolType
    | UnitType
;

block locals [Types t = Types.UNKNOWN]
    : '[' (exprs+=expr (Comma exprs+=expr)*)? ']'
;

expr locals [Types t = Types.UNKNOWN]
    : '[' IfStmt Comma expr Comma block Comma block ']'                                 #IfExpr
    | '[' BinOpExpr Comma binop Comma expr Comma expr ']'                               #BinExpr
    | '[' WhileLoop Comma expr Comma block ']'                                          #WhileExpr
    | '[' RepeatLoop Comma expr Comma block ']'                                         #RepeatExpr
    | '[' Asgmt Comma identifier Comma expr ']'                                         #AsgmtExpr
    | '[' FunInvoc Comma identifier Comma block ']'                                     #FunInvocExpr
    | block                                                                             #BlockExpr
    | identifier                                                                        #IdExpr
    | integer                                                                           #IntExpr
    | Skip                                                                              #SkipExpr
;

identifier
    : 'Idfr("' Idfr '")'
;

integer
    : 'IntLit(' IntLit ')'
;

binop
    : Eq            // #Eq
    | Less          // #Less
    | Gtr           // #Gtr
    | LessEq        // #LessEq
    | GtrEq         // #GtrEq
    | Plus          // #Plus
    | Times         // #Times
    | Minus         // #Minus
    | Div           // #Div
    | And           // #And
    | Or            // #Or
    | Xor           // #Xor
;


IntType : 'IntType' ;
BoolType : 'BoolType' ;
UnitType : 'UnitType' ;

FunDecl : 'FunDecl' ;
IfStmt : 'IfStmt' ;
BinOpExpr : 'BinOpExpr' ;
WhileLoop : 'WhileLoop' ;
RepeatLoop : 'RepeatLoop' ;
Asgmt : 'Asgmt' ;
FunInvoc : 'FunInvoc' ;

Skip : 'Skip' ;

Comma : ',' ;


Eq : 'Eq' ;
Less : 'Less' ;
Gtr : 'Gtr' ;
LessEq : 'LessEq' ;
GtrEq : 'GtrEq' ;

Plus : 'Plus' ;
Times : 'Times' ;
Minus : 'Minus' ;
Div : 'Div' ;

And : 'And' ;
Or : 'Or' ;
Xor : 'Xor' ;


Idfr : [a-z][A-Za-z0-9_]* ;
IntLit : '0' | [1-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;