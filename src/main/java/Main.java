
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

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
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);

        // Listener de erro sintático
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

        // Executa parser
        ParseTree tree = parser.program();

        // Monta tabela de símbolos
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
    }
}