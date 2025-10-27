parser grammar LangParser;

options { tokenVocab=LangLexer; }

// ======================
// REGRAS SINTÁTICAS (Parser)
// ======================

programa
    : listaFuncoes principal EOF
    ;

listaFuncoes
    : decFuncao listaFuncoes
    | /* vazio */
    ;

decFuncao
    : tipoRetorno ID '(' parametros ')' bloco
    ;

tipoRetorno
    : tipo
    | VOID
    ;

tipo
    : tipoBase dimensao
    ;

tipoBase
    : CHAR
    | FLOAT
    | INT
    | BOOLEAN
    ;

dimensao
    : '[' NUM_INT ']' dimensao
    | /* vazio */
    ;

parametros
    : tipo ID listaParametros
    | /* vazio */
    ;

listaParametros
    : ',' tipo ID listaParametros
    | /* vazio */
    ;

principal
    : MAIN '(' ')' bloco
    ;

bloco
    : '{' listaVariaveis comandos '}'
    ;

listaVariaveis
    : tipo ID listaId ';' listaVariaveis
    | /* vazio */
    ;

listaId
    : ',' ID listaId
    | /* vazio */
    ;

comandos
    : comando comandos
    | /* vazio */
    ;

comando
    : leitura
    | escrita
    | atribuicao
    | funcao
    | selecao
    | enquanto
    | retorno
    ;

leitura
    : SCANF '(' termoLeitura novoTermoLeitura ')' ';'
    ;

termoLeitura
    : ID dimensao2
    ;

novoTermoLeitura
    : ',' termoLeitura novoTermoLeitura
    | /* vazio */
    ;

dimensao2
    : '[' exprAditiva ']' dimensao2
    | /* vazio */
    ;

escrita
    : PRINTLN '(' termoEscrita novoTermoEscrita ')' ';'
    ;

termoEscrita
    : ID dimensao2
    | CONSTANTE
    | TEXTO
    ;

novoTermoEscrita
    : ',' termoEscrita novoTermoEscrita
    | /* vazio */
    ;

selecao
    : IF '(' expressao ')' bloco senao
    ;

senao
    : ELSE bloco
    | /* vazio */
    ;

enquanto
    : WHILE '(' expressao ')' bloco
    ;

atribuicao
    : ID '=' complemento ';'
    ;

complemento
    : expressao
    | funcao
    ;

funcao
    : FUNC ID '(' argumentos ')'
    ;

argumentos
    : expressao novoArgumento
    | /* vazio */
    ;

novoArgumento
    : ',' expressao novoArgumento
    | /* vazio */
    ;

retorno
    : RETURN expressao ';'
    ;

// ======================
// EXPRESSÕES
// ======================

expressao
    : exprOu
    ;

exprOu
    : exprE exprOu2
    ;

exprOu2
    : OR exprE exprOu2
    | /* vazio */
    ;

exprE
    : exprRelacional exprE2
    ;

exprE2
    : AND exprRelacional exprE2
    | /* vazio */
    ;

exprRelacional
    : exprAditiva exprRelacional2
    ;

exprRelacional2
    : COMP exprAditiva
    | /* vazio */
    ;

exprAditiva
    : exprMultiplicativa exprAditiva2
    ;

exprAditiva2
    : opAditivo exprMultiplicativa exprAditiva2
    | /* vazio */
    ;

opAditivo
    : '+'
    | '-'
    ;

exprMultiplicativa
    : fator exprMultiplicativa2
    ;

exprMultiplicativa2
    : opMultiplicativo fator exprMultiplicativa2
    | /* vazio */
    ;

opMultiplicativo
    : '*'
    | '/'
    | '%'
    ;

fator
    : sinal termo
    | TEXTO
    | NOT fator
    | '(' expressao ')'
    | funcao
    ;

termo
    : ID dimensao2
    | CONSTANTE
    ;

sinal
    : '+'
    | '-'
    | /* vazio */
    ;