import java.util.HashMap;
import java.util.Map;

/**
 * Representa um escopo de símbolos.
 */
public class Scope {
    private final String name;
    private final Scope parent;
    private final Map<String, Symbol> symbols;
    private int nextOffset;

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
        this.symbols = new HashMap<>();
        this.nextOffset = 0;
    }

    public String getName() {
        return name;
    }

    public Scope getParent() {
        return parent;
    }

    /**
     * Adiciona um símbolo ao escopo atual.
     */
    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.nome, symbol);
    }

    /**
     * Verifica se existe um símbolo **neste escopo apenas**.
     */
    public boolean existsHere(String name) {
        return symbols.containsKey(name);
    }

    /**
     * Procura um símbolo neste escopo ou em escopos pais.
     */
    public Symbol lookup(String name) {
        Symbol s = symbols.get(name);
        if (s != null) return s;
        if (parent != null) return parent.lookup(name);
        return null;
    }

    /**
     * Retorna o próximo offset disponível neste escopo.
     */
    public int getNextOffset() {
        return nextOffset;
    }

    /**
     * Incrementa o offset após adicionar uma variável ou parâmetro.
     */
    public void incrementOffset(int width) {
        nextOffset += width;
    }

    /**
     * Lista os símbolos deste escopo.
     */
    public Map<String, Symbol> getSymbols() {
        return symbols;
    }
}
