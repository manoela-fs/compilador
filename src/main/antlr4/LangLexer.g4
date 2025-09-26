lexer grammar LangLexer;

// Palavras-reservadas
INT_TYPE        : 'int';
FLOAT_TYPE      : 'float';
CHAR_TYPE       : 'char';
BOOLEAN_TYPE    : 'boolean';
VOID            : 'void';
IF              : 'if';
ELSE            : 'else';
FOR             : 'for';
WHILE           : 'while';
SCANF           : 'scanf';
PRINTLN         : 'println';
RETURN          : 'return';
TRUE            : 'true';
FALSE           : 'false';

//Texto
COMMENT : '//' ~[\r\n]* -> skip ;
STRING : '"' .*? '"' ;

//Caractere
CHAR_LITERAL : '\'' . '\'' ;

//Numeros
INT_LITERAL     : [0-9]+;
FLOAT_LITERAL   : [0-9]+ '.' [0-9]+;

// Identificador
ID      : [a-zA-Z][a-zA-Z0-9_]*;

// Operadores
ASSIGN  : '=' ;

ADD     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
MOD     : '%';

AND     : '&&';
OR      : '||';
NOT     : '!';

LT      : '<';
LE      : '<=';
GT      : '>';
GE      : '>=';
NEQ     : '!=';
EQ      : '==';

//Simbolos
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
SEMI   : ';' ;
COMMA  : ',' ;

// Espaços em branco
WS      : [ \t\r\n]+ -> skip;

BAD_ID : [0-9]+ [a-zA-Z_][a-zA-Z0-9_]* ;