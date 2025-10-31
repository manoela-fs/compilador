parser grammar LangParser;

options { tokenVocab=LangLexer; }

// PROGRAMA → SEÇÃOFUNÇÕES PRINCIPAL
program
    : secaoFuncoes principal
    ;

// SEÇÃOFUNÇÕES → LISTAFUNÇÕES | ε
secaoFuncoes
    : listafuncoes?
    ;

// LISTAFUNÇÕES → DECFUNÇÃO+
listafuncoes
    : decFuncao+
    ;

// DECFUNÇÃO → TIPORETORNO ID ( PARÂMETROS ) BLOCO
decFuncao
    : tipoRetorno ID LPAREN parametros RPAREN bloco
    ;

// TIPORETORNO → TIPO | void
tipoRetorno
    : tipo
    | VOID
    ;

// 🔹 TIPO → TIPOBASE DIMENSOES?
// Agora qualquer tipo pode ser um array multidimensional
tipo
    : tipoBase dimensoes?
    ;

// TIPOBASE → char | float | int | boolean
tipoBase
    : CHAR_TYPE
    | FLOAT_TYPE
    | INT_TYPE
    | BOOLEAN_TYPE
    ;

// PARÂMETROS → LISTAPARAMS | ε
parametros
    : listaParams?
    ;

// 🔹 LISTAPARAMS → TIPO ID ( , TIPO ID )*
// Os parâmetros agora aceitam tipo com dimensões (ex: int[5] a)
listaParams
    : tipo ID ( COMMA tipo ID )*
    ;

// PRINCIPAL → MAIN ( ) BLOCO
principal
    : MAIN LPAREN RPAREN bloco
    ;

// BLOCO → { LISTADECLARACOES LISTAESTRUTURAS }
bloco
    : LBRACE listaDeclaracoes listaEstruturas RBRACE
    ;

// LISTADECLARACOES → DECLARACAO*
listaDeclaracoes
    : declaracao*
    ;

// DECLARACAO → tipo listaIds SEMI
declaracao
    : tipo listaIds SEMI
    ;

// LISTAIDS → ID ( , ID )*
listaIds
    : ID ( COMMA ID )*
    ;

// DIMENSOES → [ INT_LITERAL ] (recursivo)
dimensoes
    : LBRACK INT_LITERAL RBRACK dimensoes?
    ;

// LISTAESTRUTURAS → ESTRUTURA*
listaEstruturas
    : estrutura*
    ;

// ESTRUTURA → ATRIBUICAO | CONTROLE | CHAMADA | RETURN
estrutura
    : atribuicao
    | controle
    | chamada
    | RETURN expressao? SEMI
    ;

// ATRIBUICAO → VAR = EXPRESSAO ;
atribuicao
    : var ASSIGN expressao SEMI
    ;

// VAR → ID ( INDICE )*
var
    : ID indice?
    ;

// INDICE → [ EXPRESSAO ] (recursivo)
indice
    : LBRACK expressao RBRACK indice?
    ;

// CONTROLE → IF | WHILE
controle
    : ifStatement
    | whileStatement
    ;

// IF → if ( EXPRESSAO ) BLOCO ( else BLOCO )?
ifStatement
    : IF LPAREN expressao RPAREN bloco ( ELSE bloco )?
    ;

// WHILE → while ( EXPRESSAO ) BLOCO
whileStatement
    : WHILE LPAREN expressao RPAREN bloco
    ;

// CHAMADA → SCANF ( VAR ) | PRINTLN ( EXPRESSAO )
chamada
    : SCANF LPAREN var RPAREN SEMI
    | PRINTLN LPAREN expressao RPAREN SEMI
    ;

// EXPRESSAO → AND_EXP ( OR AND_EXP )*
expressao
    : andExp ( OR andExp )*
    ;

// AND_EXP → EQ_EXP ( AND EQ_EXP )*
andExp
    : eqExp ( AND eqExp )*
    ;

// EQ_EXP → REL_EXP ( ( == | != ) REL_EXP )*
eqExp
    : relExp ( ( EQ | NEQ ) relExp )*
    ;

// REL_EXP → ADD_EXP ( ( < | <= | > | >= ) ADD_EXP )*
relExp
    : addExp ( ( LT | LE | GT | GE ) addExp )*
    ;

// ADD_EXP → MUL_EXP ( ( + | - ) MUL_EXP )*
addExp
    : mulExp ( ( ADD | SUB ) mulExp )*
    ;

// MUL_EXP → UNARY_EXP ( ( * | / | % ) UNARY_EXP )*
mulExp
    : unaryExp ( ( MUL | DIV | MOD ) unaryExp )*
    ;

// UNARY_EXP → ( ! | - ) UNARY_EXP | PRIMARY
unaryExp
    : ( NOT | SUB ) unaryExp
    | primary
    ;

// PRIMARY → VAR | LITERAL | ( EXPRESSAO ) | FUNCAO
primary
    : var
    | literal
    | LPAREN expressao RPAREN
    | funcCall
    ;

// FUNÇÃO COMO EXPRESSÃO
funcCall
    : ID LPAREN (expressao (COMMA expressao)*)? RPAREN
    ;

// LITERAL → INT_LITERAL | FLOAT_LITERAL | CHAR_LITERAL | STRING | TRUE | FALSE
literal
    : INT_LITERAL
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING
    | TRUE
    | FALSE
    ;
