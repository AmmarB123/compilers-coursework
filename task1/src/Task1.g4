grammar Task1;

wholeexpr
    : prog EOF
    ;

prog
    : dec+
    ;

dec
    : types idfr LParen vardec RParen block
    ;

vardec
    : vardecne*
;

vardecne
    : (types idfr)* (Comma)* types idfr
;

block
    : LBrace ene += exp (Semicolon ene += exp)* RBrace
;

exp
    : idfr                              #IdfrExp
    | IntLit                            #IntExp
    | idfr Assign exp                   #AssignmentExp
    | LParen exp binop exp RParen       #BinaryOpExp
    | idfr LParen args RParen           #ArgsExp
    | block                             #BlockExp
    | If exp Then block Else block      #IfExp
    | While exp Do block                #WhileExp
    | Repeat block Until exp            #RepeatExp
    | Skip                               #SkipExp
    ;


args
    : argsne*
    ;

argsne
    : exp  (Comma exp)*
    ;


binop
    :Less   #LessOP
    |LessEq #LessEqOP
    |And    #AndOP
    |Xor    #XorOP
    |Eq     #EqOP
    |Gtr    #GtrOP
    |GtrEq  #GtrEqOP
    |Or     #OrOP
    |Times  #TimesOP
    |Div    #DivOP
    |Minus  #MinusOP
    |Plus   #PlusOP
    ;


types
    :IntType    #IntergerType
    |BoolType   #BooleanType
    |UnitType   #UnitsType
    ;


idfr
    : IDENTIFIER #IDTFR
    ;

IntLit : '0' | [1-9][0-9]* ;

IntType:'int';
BoolType :'bool';
UnitType : 'unit';

Assign :  ':=';
Less:	'<';
LessEq:	'<=';
And: '&&';
Xor :	'^^';
Eq:	'==';
Gtr	: '>';
GtrEq:	'>=';
Or:	'||';
Times  : '*' ;
Div    : '/' ;
Plus   : '+' ;
Minus  : '-' ;

While:	'while';
Do:	'do';
Repeat:	'repeat';
Until:	'until';
If:	'if';
Then:	'then';
Else:	'else';

Comma:	',';
RParen:	')';
LBrace:	'{';
Semicolon:	';';
RBrace:	'}';
LParen:	'(';

Return: 'return';
Skip: 'skip';

IDENTIFIER
    :   [a-z][A-Za-z0-9_]*
    ;

WS
    :   [ \t\r\n]+ -> skip
    ;