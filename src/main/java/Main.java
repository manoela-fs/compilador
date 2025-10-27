import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) {
        String code = """
            // exemplo
            int soma(int x, int y) {
                int r;
                r = x + y;
                return r;
            }

            main() {
                int a, b;
                float c;
                a = 10;
                b = 20;
                c = a + b * 2.5;
                println(c);
            }
        """;

        CharStream input = CharStreams.fromString(code);
        LangLexer lexer = new LangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // checar erros lexicos via tokens.generation (opcional)
        tokens.fill();
        for (Token t : tokens.getTokens()) {
            // caso você tenha token BAD_ID, trate aqui
        }

        LangParser parser = new LangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                    int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.printf("Erro sintático na linha %d:%d - %s%n", line, charPositionInLine, msg);
            }
        });

        ParseTree tree = parser.programa();
        if (tree == null || parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Não foi possível gerar a árvore sintática (erros).");
            return;
        }

        SymbolTableVisitor visitor = new SymbolTableVisitor();
        visitor.visit(tree);

        System.out.println("\nTabela de Símbolos:");
        System.out.println("| ID  | Nome       | Categoria  | Tipo               | Width | Offset | Escopo     |");
        System.out.println("|-----|------------|------------|--------------------|-------|--------|------------|");
        for (SymbolTableVisitor.Symbol s : visitor.getTabela()) {
            System.out.println(s);
        }

        System.out.println("\nErros semânticos:");
        if (visitor.getSemanticErrors().isEmpty()) {
            System.out.println("Nenhum erro semântico detectado.");
        } else {
            for (String err : visitor.getSemanticErrors()) {
                System.out.println(err);
            }
        }
    }
}