parser grammar LangParser;

options { tokenVocab=LangLexer; }

// Regras principais
program
    : (declaration | functionDecl | statement)* EOF
    ;

// Declaração de variável
declaration
    : type ID (ASSIGN expression)? SEMI
    ;

// Declaração de função
functionDecl
    : VOID ID LPAREN RPAREN block
    ;

// Bloco de código
block
    : LBRACE statement* RBRACE
    ;

// Declarações dentro de bloco
statement
    : block
    | declaration
    | ifStatement
    | forStatement
    | whileStatement
    | returnStatement
    | exprStatement
    ;

// Estruturas de controle
ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?
    ;

forStatement
    : FOR LPAREN declaration expression SEMI expression RPAREN statement
    ;

whileStatement
    : WHILE LPAREN expression RPAREN statement
    ;

returnStatement
    : RETURN (expression)? SEMI
    ;

// Expressões e chamadas de função
exprStatement
    : expression SEMI
    | functionCall SEMI
    ;

functionCall
    : PRINTLN LPAREN (expression)? RPAREN
    | SCANF LPAREN (expression)? RPAREN
    ;

// Expressões (suporte a atribuição e operadores)
expression
    : ID ASSIGN expression                     #assignExpr
    | expression (ADD|SUB|MUL|DIV|MOD) expression   #arithmeticExpr
    | expression (EQ|NEQ|LT|LE|GT|GE) expression   #comparisonExpr
    | expression (AND|OR) expression               #logicalExpr
    | LPAREN expression RPAREN                     #parenExpr
    | ID                                          #idExpr
    | INT_LITERAL                                 #intLiteralExpr
    | FLOAT_LITERAL                               #floatLiteralExpr
    | CHAR_LITERAL                                #charLiteralExpr
    | STRING                                      #stringLiteralExpr
    | TRUE                                        #trueExpr
    | FALSE                                       #falseExpr
    ;

// Tipos
type
    : INT_TYPE
    | FLOAT_TYPE
    | CHAR_TYPE
    | BOOLEAN_TYPE
    ;
