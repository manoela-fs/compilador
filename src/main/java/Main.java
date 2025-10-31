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
                    float[5] v;
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

        // Criar lexer e parser
        LangLexer lexer = new LangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);

        // Remover listeners padrão e adicionar diagnóstico
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.addErrorListener(ConsoleErrorListener.INSTANCE);

        // Parse do programa
        ParseTree tree = parser.program();

        // Print da árvore sintática
        System.out.println("\n🌳 Árvore sintática:");
        System.out.println(tree.toStringTree(parser));

        // =================== Análise Semântica ===================
        ErrorReporter errorReporter = new ErrorReporter();
        SymbolTable symbolTable = new SymbolTable(errorReporter);
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(symbolTable, errorReporter);

        // Executar análise semântica
        semanticAnalyzer.visit(tree);

        // Print da tabela de símbolos
        System.out.println("\n📋 Tabela de Símbolos:");
        symbolTable.imprimirTabelaHierarquica();

        // Print de erros semânticos, se houver
        if (errorReporter.hasErrors()) {
            System.out.println("\n⚠️ Erros semânticos:");
            errorReporter.printErrors();
        } else {
            System.out.println("\n✅ Análise semântica concluída sem erros.");
        }
    }
}
