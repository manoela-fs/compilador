    import java.util.*;

    /**
     * SymbolTable hierárquica usando Scope.
     */
    public class SymbolTable {

        private Scope currentScope;
        private final Scope globalScope;
        private final ErrorReporter errorReporter;

        private final List<Scope> allScopes = new ArrayList<>();

        public SymbolTable(ErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
            // cria escopo global
            globalScope = new Scope("Global", null);
            currentScope = globalScope;
            allScopes.add(globalScope);
        }

        /** Abre um novo escopo */
        public void abrirEscopo(String nome) {
            Scope novo = new Scope(nome, currentScope);
            currentScope = novo;
            allScopes.add(novo);
        }

        /** Fecha o escopo atual */
        public void fecharEscopo() {
            if (currentScope != null && currentScope.getParent() != null) {
                currentScope = currentScope.getParent();
            } else {
                errorReporter.report("Tentativa de fechar escopo inexistente.", -1);
            }
        }

        /** Adiciona um símbolo no escopo atual */
        public boolean adicionarSimbolo(Symbol s, int line) {
            if (currentScope.existsHere(s.nome)) {
                errorReporter.report("Símbolo '" + s.nome + "' já declarado no escopo '" + currentScope.getName() + "'.", line);
                return false;
            }

            // atribui offset
            s.offset = currentScope.getNextOffset();
            currentScope.incrementOffset(s.width);

            currentScope.addSymbol(s);
            return true;
        }

        /** Busca símbolo na hierarquia (escopo atual → global) */
        public Symbol buscarSimbolo(String nome) {
            return currentScope.lookup(nome);
        }

        /** Busca símbolo apenas no escopo atual */
        public Symbol buscarNoEscopoAtual(String nome) {
            return currentScope.existsHere(nome) ? currentScope.getSymbols().get(nome) : null;
        }

        /** Retorna o nome do escopo atual */
        public String getEscopoAtual() {
            return currentScope.getName();
        }

        /** Imprime todos os escopos e símbolos de forma hierárquica */
        public void imprimirTabelaHierarquica() {
            System.out.println("📋 Tabelas de Símbolos por Escopo:");

            String fmtHeader = "%-4s | %-15s | %-10s | %-20s | %-5s | %-6s%n";
            String fmtRow    = "%-4d | %-15s | %-10s | %-20s | %-5d | %-6d%n";

            for (Scope s : allScopes) {
                if (s.getSymbols().isEmpty()) continue;
                System.out.println("\n===== TABELA DE SÍMBOLOS (" + s.getName() + ") =====");
                System.out.printf(fmtHeader, "ID", "Nome", "Categoria", "Tipo", "Width", "Offset");
                System.out.println("-------------------------------------------------------------");

                for (Symbol sym : s.getSymbols().values()) {
                    String tipoStr = sym.type != null ? sym.type.toString() : "unknown";
                    String categoria = sym.categoria != null ? sym.categoria.name() : "UNKNOWN";
                    System.out.printf(fmtRow, sym.id, sym.nome, categoria, tipoStr, sym.width, sym.offset);
                }
            }
            System.out.println("\n==============================");
        }

        /** Retorna o nível atual (profundidade) */
        public int getNivelAtual() {
            int nivel = 0;
            Scope s = currentScope;
            while (s != null) {
                s = s.getParent();
                nivel++;
            }
            return nivel;
        }
    }
