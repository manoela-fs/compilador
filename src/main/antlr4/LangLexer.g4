lexer grammar LangLexer;

// ======================
// PALAVRAS-CHAVE
// ======================
VOID     : 'void';
CHAR     : 'char';
FLOAT    : 'float';
INT      : 'int';
BOOLEAN  : 'boolean';
MAIN     : 'main';
IF       : 'if';
ELSE     : 'else';
WHILE    : 'while';
RETURN   : 'return';
SCANF    : 'scanf';
PRINTLN  : 'println';
FUNC     : 'func';  // Usado para chamadas de função

// ======================
// OPERADORES E SÍMBOLOS
// ======================
COMP     : '==' | '!=' | '<' | '<=' | '>' | '>=';
PLUS     : '+';
MINUS    : '-';
MULT     : '*';
DIV      : '/';
MOD      : '%';
AND      : '&&';
OR       : '||';
ASSIGN   : '=';
NOT      : '!';
COMMA    : ',';
SEMI     : ';';
LPAREN   : '(';
RPAREN   : ')';
LBRACE   : '{';
RBRACE   : '}';
LBRACK   : '[';
RBRACK   : ']';

// ======================
// CONSTANTES E IDENTIFICADORES
// ======================
TEXTO     : '"' (~["\r\n])* '"';
fragment NUM_DEC   : [0-9]+ '.' [0-9]+;
fragment NUM_INT   : [0-9]+;
CONSTANTE : NUM_DEC | NUM_INT;
ID        : [a-zA-Z_][a-zA-Z_0-9]*;

// ======================
// ESPAÇOS E COMENTÁRIOS
// ======================
WS        : [ \t\r\n]+ -> skip;
COMMENT   : '//' ~[\r\n]* -> skip;