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

        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            String text = token.getText();

            if (text.matches("int|float|char|boolean|void")) {
                ultimoTipo = text;
            }            
            else if (ultimoTipo != null && text.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                if ("void".equals(ultimoTipo)) {
                    tabelaSimbolos.add(new Symbol(text, "Função", "void", null, "Global"));
                    escopoAtual = text;
                } else {
                    tabelaSimbolos.add(new Symbol(text, "Variável", ultimoTipo, null, escopoAtual));
                }
                ultimoTipo = null;
            }            
            else if (text.equals("=")) {
                Token prox = lexer.nextToken();
                if (!tabelaSimbolos.isEmpty()) {
                    Symbol ultimo = tabelaSimbolos.get(tabelaSimbolos.size() - 1);
                    ultimo.valorInicial = prox.getText();
                }
            }
        }

        System.out.println("| Nome       | Categoria  | Tipo     | Valor Inicial | Escopo     |");
        System.out.println("|------------|------------|----------|---------------|------------|");
        for (Symbol s : tabelaSimbolos) {
            System.out.println(s);
        }
    }
}
