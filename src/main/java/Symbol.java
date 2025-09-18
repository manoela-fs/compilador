/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Camile
 */
public class Symbol {
    String nome;
    String categoria;
    String tipo;
    String valorInicial;
    String escopo;

    public Symbol(String nome, String categoria, String tipo, String valorInicial, String escopo) {
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.valorInicial = valorInicial;
        this.escopo = escopo;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-10s | %-8s | %-12s | %-10s |",
                nome, categoria, tipo, valorInicial == null ? "-" : valorInicial, escopo);
    }
}
