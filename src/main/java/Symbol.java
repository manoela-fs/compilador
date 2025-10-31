public class Symbol {
    private static int nextId = 1;

    public final int id;
    public final String nome;
    public final Categoria categoria; // usa enum em vez de String
    public final Type type;
    public final int width;
    public int offset;

    public Symbol(String nome, Categoria categoria, Type type, int offset) {
        this.id = nextId++;
        this.nome = nome;
        this.categoria = categoria;
        this.type = type;
        this.width = type.getWidth(); // usa método de Type
    }

    @Override
    public String toString() {
        return String.format(
                "Symbol{id=%d, nome='%s', categoria=%s, type=%s, width=%d, offset=%d}",
                id, nome, categoria, type, width, offset
        );
    }
}
