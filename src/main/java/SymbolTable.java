import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, Symbol> table = new HashMap<>();
    private int nextId = 1;

    // Adiciona identificador
    public Symbol add(String name) {
        if (!table.containsKey(name)) {
            table.put(name, new Symbol(nextId++, name));
        }
        return table.get(name);
    }

    // Consulta símbolo pelo nome
    public Symbol get(String name) {
        return table.get(name);
    }

    // Imprime a tabela
    public void print() {
        System.out.println("| ID | Nome |");
        System.out.println("|----|------|");
        for (Symbol s : table.values()) {
            System.out.println(s);
        }
    }
}
