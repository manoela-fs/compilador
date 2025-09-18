import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

public class Main {
    public static void main(String[] args) {
        String code = """
            int x;
            float y;
            boolean flag;
            x = 10;
            y = y + 0.1;
            flag = true;
        """;

        CharStream input = CharStreams.fromString(code);
        LangLexer lexer = new LangLexer(input);

        SymbolTable st = new SymbolTable();
        Token token;

        // Constroi a tabela de símbolos
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            if (token.getType() == LangLexer.ID) {
                st.add(token.getText());
            }
        }

        // Imprime a tabela de símbolos
        st.print();

        // Imprime tokens
        System.out.println("\nTokens e IDs:");
        input = CharStreams.fromString(code);
        lexer = new LangLexer(input);
        Vocabulary vocab = lexer.getVocabulary();

        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            String text = token.getText();
            String tokenName = vocab.getSymbolicName(token.getType());
            if (token.getType() == LangLexer.ID) {
                Symbol sym = st.get(text);
                System.out.printf("Token: %-10s | Text: %-10s | ID: %d\n", tokenName, text, sym.id);
            } else {
                System.out.printf("Token: %-10s | Text: %s\n", tokenName, text);
            }
        }
    }
}
