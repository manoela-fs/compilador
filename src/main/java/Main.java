import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

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

        Token token;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            System.out.println(
                    "Token: " + LangLexer.VOCABULARY.getSymbolicName(token.getType()) +
                            " | Text: '" + token.getText() + "'"
            );
        }
    }
}
