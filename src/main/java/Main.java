
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) {
                
        String code = """
            void main(){
                int a,b;
                      float c;
                      c = a + b *;
                      prinln(c);
                                    }
        """;

//        // Exemplo 2 - Erro léxico (string não fechada)
//        String code = """
//            String s = "texto sem fim;
//        """;

//        // Exemplo 3 - Erro léxico (caractere inválido #)
//        String code = """
//            int valor = 50 # 20;
//        """;

//        // Exemplo 4 - Erro sintático (falta ponto e vírgula)
//        String code = """                      
//            int a = 5;
//            float b = 2.0
//        """;

//        // Exemplo 5 - Erro sintático (parêntese não fechado no if)
//        String code = """
//            if (a > 10 {
//                println("Erro de parêntese");
//            }
//        """;

//        // Exemplo 6 - Erro sintático (chave de fechamento a mais)
//        String code = """
//            int x = 1;
//            if (x > 0) {
//                println("ok");
//            }}
//        """;

//        // Exemplo 7 - Erro sintático (for incompleto)
//        String code = """
//            for (int i = 0; i < 10;) {
//                println(i);
//            }
//        """;

//        // Exemplo 8 - Erro sintático (while sem condição)
//        String code = """
//            while () {
//                println("loop infinito?");
//            }
//        """;

//        // Exemplo 9 - Erro léxico (char inválido, mais de um caractere)
//        String code = """
//            char c = 'ab';
//        """;

//        CharStream input = CharStreams.fromString(code);
//        LangLexer lexer = new LangLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        LangParser parser = new LangParser(tokens);


        CharStream input = CharStreams.fromString(code);
        LangLexer lexer = new LangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();
        for (Token t : tokens.getTokens()) {
            if (t.getType() == LangLexer.BAD_ID) {
                System.err.printf("Erro lexico na linha %d:%d - identificador invalido '%s'%n",
                    t.getLine(), t.getCharPositionInLine(), t.getText());
                return;
            }
        }

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
                if (symbol != null) {
                    System.out.printf("Token: %-12s | Text: %-12s | ID: %d\n", tokenName, "'" + text + "'", symbol.id);
                } else {
                    System.out.printf("Token: %-12s | Text: %-12s | [nao encontrado na tabela]\n", tokenName, "'" + text + "'");
                }
            } else {
                System.out.printf("Token: %-12s | Text: %s\n", tokenName, "'" + text + "'");
            }
        }
    }
}
