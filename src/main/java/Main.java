import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String code = """
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

        CharStream input = CharStreams.fromString(code);

        LangLexer lexer = new LangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.addErrorListener(ConsoleErrorListener.INSTANCE);

        ParseTree tree = parser.program();

        System.out.println("Arvore sintatica:");
        System.out.println(tree.toStringTree(parser));

        // Analise Semantica
        ErrorReporter errorReporter = new ErrorReporter();
        SymbolTable symbolTable = new SymbolTable(errorReporter);
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(symbolTable, errorReporter);

        // Executar analise semantica
        semanticAnalyzer.visit(tree);

        // tabela de símbolos
        symbolTable.imprimirTabelas();
    }
}
