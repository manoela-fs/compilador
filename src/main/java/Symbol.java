/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Camile
 */
public class Symbol {
    public final int id;
    public final String nome;
    public final String categoria; // "Variável", "Função", "Parâmetro"
    public final String type;      // ex: "int", "float", "char", "boolean", "array(int,10)"
    public final int width;        // largura em bytes (ex: int=4, float=8, char=1, boolean=1, array => n * innerWidth)
    public final int offset;       // offset dentro do escopo
    public final String escopo;    // nome do escopo (ex: "Global" ou "main" ou "soma")

    public Symbol(int id, String nome, String categoria, String type, int width, int offset, String escopo) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.type = type;
        this.width = width;
        this.offset = offset;
        this.escopo = escopo;
    }

    @Override
    public String toString() {
        return String.format("| %-3d | %-10s | %-10s | %-18s | %-5d | %-6d | %-10s |",
                id, nome, categoria, type == null ? "-" : type, width, offset, escopo);
    }
}
