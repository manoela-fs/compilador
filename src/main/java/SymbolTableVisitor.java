/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Camile
 */

import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitor extends LangParserBaseVisitor<Void> {
    private final List<Symbol> tabela = new ArrayList<>();
    private int contadorId = 1;
    private String escopoAtual = "Global";

    public List<Symbol> getTabela() {
        return tabela;
    }
    
    public Symbol get(String nome) {
        for (Symbol s : tabela) {
            if (s.nome.equals(nome)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Void visitDeclaration(LangParser.DeclarationContext ctx) {
        String tipo = ctx.type().getText();
        String nome = ctx.ID().getText();
        String valorInicial = ctx.expression() != null ? ctx.expression().getText() : null;

        tabela.add(new Symbol(contadorId++, nome, "Variavel", tipo, valorInicial, escopoAtual));
        return null;
    }

    @Override
    public Void visitFunctionDecl(LangParser.FunctionDeclContext ctx) {
        String nome = ctx.ID().getText();

        tabela.add(new Symbol(contadorId++, nome, "Funcao", "void", null, "Global"));

        // muda o escopo
        String escopoAntigo = escopoAtual;
        escopoAtual = nome;
        visit(ctx.block());
        escopoAtual = escopoAntigo;

        return null;
    }
}

