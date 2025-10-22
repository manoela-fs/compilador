import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {

        // Alterar aqui para testar outro caso
        int test = 12;

        String code = switch (test) {
            // 🧩 TESTE 1 – Programa mínimo com main vazio
            case 1 -> """
                main() {
                }
            """;

            // 🧩 TESTE 2 – Declarações simples
            case 2 -> """
                main() {
                    int a;
                    float b;
                    char c;
                    boolean ok;
                }
            """;

            // 🧩 TESTE 3 – Declaração de vetor
            case 3 -> """
                main() {
                    int v[5];
                }
            """;

            // 🧩 TESTE 4 – Atribuição simples e expressão aritmética
            case 4 -> """
                main() {
                    int a;
                    a = 5 + 3 * 2;
                    println(a);
                }
            """;

            // 🧩 TESTE 5 – Indexação e atribuição em vetor
            case 5 -> """
                main() {
                    int v[10];
                    v[0] = 3;
                    v[1] = v[0] + 2;
                    println(v[1]);
                }
            """;

            // 🧩 TESTE 6 – Estrutura condicional if/else
            case 6 -> """
                main() {
                    int a;
                    a = 5;
                    if (a > 3) {
                        println("maior");
                    } else {
                        println("menor ou igual");
                    }
                }
            """;

            // 🧩 TESTE 7 – Estrutura de repetição while
            case 7 -> """
                main() {
                    int i;
                    i = 0;
                    while (i < 3) {
                        println(i);
                        i = i + 1;
                    }
                }
            """;

            // 🧩 TESTE 8 – Estrutura de repetição for
            case 8 -> """
                main() {
                    int i;
                    for (i = 0; i < 3; i = i + 1) {
                        println(i);
                    }
                }
            """;

            // 🧩 TESTE 9 – Função auxiliar antes do main
            case 9 -> """
                int soma(int x, int y) {
                    return x + y;
                }

                main() {
                    int r;
                    r = soma(2, 3);
                    println(r);
                }
            """;

            // 🧩 TESTE 10 – Função como expressão dentro de atribuição
            case 10 -> """
                int multiplicar(int a, int b) {
                    return a * b;
                }

                main() {
                    int resultado;
                    resultado = multiplicar(4, 5);
                    println(resultado);
                }
            """;

            // 🧩 TESTE 11 – ERRO proposital: atribuição inválida
            case 11 -> """
                main() {
                    int a = 5; // Inicialização direta não permitida
                }
            """;

            // 🧩 TESTE 12 – ERRO proposital: chamada de função com falta de parêntese
            case 12 -> """
                int soma(int x, int y) {
                    return x + y;
                }

                main() {
                    int r;
                    r = soma(2, 3; // Parêntese errado
                    println(r);
                }
            """;

            default -> throw new IllegalArgumentException("Número de teste inválido.");
        };

        System.out.println("🧠 Executando TESTE " + test + "...\n");

        // Criar CharStream a partir da string
        CharStream input = CharStreams.fromString(code);

        // Criar o lexer e o parser
        LangLexer lexer = new LangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);

        // Mostrar erros detalhados
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.addErrorListener(ConsoleErrorListener.INSTANCE);

        // Parse do programa
        ParseTree tree = parser.program();

        // Print da árvore gerada
        System.out.println("\n🌳 Árvore sintática:");
        System.out.println(tree.toStringTree(parser));
    }
}
