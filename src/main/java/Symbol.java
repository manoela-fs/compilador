public class Symbol {
    public final int id;
    public final String name;

    public Symbol(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("| %-3d | %-10s |", id, name);
    }

}

