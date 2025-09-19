import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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
                    println("x é maior que 5 e flag é true);
                } else {
                    println("Outro caso");
                      
                    if (flag) {
                        boolean bool = false;
                    }
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
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("Erro de sintaxe na linha " + line + ":" + charPositionInLine + " - " + msg);
            }
        });

        ParseTree tree = parser.program();

        SymbolTableVisitor visitor = new SymbolTableVisitor();
        
        if (tree != null) {
            visitor.visit(tree);
        } else {
            System.err.println("Não foi possível gerar a árvore sintática devido a erros.");
        }

        System.out.println("| ID  | Nome       | Categoria  | Tipo     | Valor Inicial | Escopo     |");
        System.out.println("|-----|------------|------------|----------|---------------|------------|");
        for (Symbol s : visitor.getTabela()) {
            System.out.println(s);
        }        
        
        System.out.println("\nTokens:");
        input = CharStreams.fromString(code);
        lexer = new LangLexer(input);
        Token token;
        Vocabulary vocab = lexer.getVocabulary();

        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            String text = token.getText();
            String tokenName = vocab.getSymbolicName(token.getType());

            if (token.getType() == LangLexer.ID) {
                Symbol symbol = visitor.get(text);
                System.out.printf("Token: %-12s | Text: %-12s | ID: %d\n", tokenName, "'" + text + "'", symbol.id);
            } else {
                System.out.printf("Token: %-12s | Text: %s\n", tokenName, "'" + text + "'");
            }
        }
    }
}