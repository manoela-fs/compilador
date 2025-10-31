import java.util.ArrayList;
import java.util.List;

public class ErrorReporter {

    private final List<String> errors;

    public ErrorReporter() {
        this.errors = new ArrayList<>();
    }

    public void report(String message, int line) {
        String fullMessage = "Linha " + line + ": " + message;
        errors.add(fullMessage);
        System.err.println(fullMessage);
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void clear() {
        errors.clear();
    }

    public void printErrors() {
        if (errors.isEmpty()) {
            System.out.println("Nenhum erro semântico encontrado.");
            return;
        }

        System.out.println("Erros semânticos encontrados:");
        for (String e : errors) {
            System.out.println(e);
        }
    }
}
