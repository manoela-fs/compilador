
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String code = """
            // Comentário inicial
            int x = 10;
            float y = 3.14;
            char c = 'a';
            boolean flag = true;
            void main() {
                if (x > 5 && flag) {
                    println("x é maior que 5 e flag é true");
                } else {
                    println("Outro caso");
                }
                for (int i = 0; i < 10; i = i + 1) {
                    y = y + 0.1;
                }
                while (x != 0) {
                    x = x - 1;
                }
                return;
            }
        """;

        CharStream input = CharStreams.fromString(code);
        LangLexer lexer = new LangLexer(input);

        List<Symbol> tabelaSimbolos = new ArrayList<>();
        Token token;
        String ultimoTipo = null;
        String escopoAtual = "Global";
        int contadorId = 1;

        int lastIdxWaitingAssign = -1;

        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            int type = token.getType();
            String text = token.getText();

            if (type == LangLexer.INT_TYPE || type == LangLexer.FLOAT_TYPE ||
                type == LangLexer.CHAR_TYPE || type == LangLexer.BOOLEAN_TYPE ||
                type == LangLexer.VOID) {
                ultimoTipo = text;
                continue;
            }

            if (ultimoTipo != null && (type == LangLexer.ID || type == LangLexer.MAIN)) {
                String nome = text;

                if ("void".equals(ultimoTipo)) {
                    tabelaSimbolos.add(new Symbol(contadorId++, nome, "Funcao", "void", null, "Global"));
                    escopoAtual = nome;
                    lastIdxWaitingAssign = -1;
                } else {
                    tabelaSimbolos.add(new Symbol(contadorId++, nome, "Variavel", ultimoTipo, null, escopoAtual));
                    
                    lastIdxWaitingAssign = tabelaSimbolos.size() - 1;
                }

                ultimoTipo = null;
                continue;
            }

            if (ultimoTipo != null) {
                ultimoTipo = null;
            }

            if (type == LangLexer.ASSIGN) {
                if (lastIdxWaitingAssign != -1 && lastIdxWaitingAssign < tabelaSimbolos.size()) {
                    Token prox = lexer.nextToken();
                    
                    if (prox != null && prox.getType() != Token.EOF) {
                        tabelaSimbolos.get(lastIdxWaitingAssign).valorInicial = prox.getText();
                    }
                    
                    lastIdxWaitingAssign = -1;
                } else {
                    // ASSIGN que não é inicialização de declaração (atribuição em runtime) -> ignore para tabela de símbolos
                }
                continue;
            }

            if (type == LangLexer.RBRACE) {
                escopoAtual = "Global";
                lastIdxWaitingAssign = -1;
                continue;
            }
        }

        System.out.println("| ID  | Nome       | Categoria  | Tipo     | Valor Inicial | Escopo     |");
        System.out.println("|-----|------------|------------|----------|---------------|------------|");
        for (Symbol s : tabelaSimbolos) {
            System.out.println(s);
        }
    }
}
