import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String code = """
                // Exemplo completo de programa
                
                int soma(int x, int y) {
                    int r;
                    r = x + y;
                    return r;
                }
                
                float media(float a, float b, float c) {
                    float m;
                    m = (a + b + c) / 3.0;
                    return m;
                }
                
                char letra() {
                    char l;
                    l = 'A';
                    return l;
                }
                
                boolean maiorQue10(int x) {
                    boolean res;
                    if (x > 10) {
                        res = true;
                    } else {
                        res = false;
                    }
                    return res;
                }
                
                main() {
                    int a, b, c;
                    float v[5];
                    boolean ok;
                
                    a = 10;
                    b = 20;
                    c = soma(a, b);
                
                    if (maiorQue10(c)) {
                        println("Maior que 10");
                    } else {
                        println("Menor ou igual a 10");
                    }
                
                    while (a < 50) {
                        a = a + 5;
                        println(a);
                    }
                
                    scanf(b);
                    v[0] = 1.5;
                    println(v[0]);
                }
                
                """;

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
