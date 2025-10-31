public class TypeChecker {

    private final ErrorReporter errorReporter;

    public TypeChecker(ErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }

    // ================= Atribuição =================
    public boolean checkAssignment(Type target, Type value, int line) {
        if (target != null && value != null && isCompatible(target, value)) {
            return true;
        } else {
            errorReporter.report("Tipo incompatível: não é possível atribuir " + value + " a " + target, line);
            return false;
        }
    }

    // ================= Compatibilidade =================
    public boolean isCompatible(Type t1, Type t2) {
        if (t1 == null || t2 == null) return false;

        if (t1 instanceof PrimitiveType && t2 instanceof PrimitiveType) {
            return t1 == t2;
        }

        if (t1 instanceof ArrayType a1 && t2 instanceof ArrayType a2) {
            int rank1 = getArrayRank(a1);
            int rank2 = getArrayRank(a2);
            if (rank1 != rank2) return false;
            Type inner1 = getArrayInnerMost(a1);
            Type inner2 = getArrayInnerMost(a2);
            return isCompatible(inner1, inner2);
        }

        return false;
    }

    private int getArrayRank(ArrayType arr) {
        int rank = 1;
        Type cur = arr.getInnerType();
        while (cur instanceof ArrayType a) {
            rank++;
            cur = a.getInnerType();
        }
        return rank;
    }

    private Type getArrayInnerMost(ArrayType arr) {
        Type cur = arr;
        while (cur instanceof ArrayType a) {
            cur = a.getInnerType();
        }
        return cur;
    }

    // ================= Operações aritméticas =================
    public boolean checkArithmetic(Type left, Type right, int line) {
        if (isNumeric(left) && isNumeric(right)) return true;
        errorReporter.report("Operação aritmética inválida entre " + left + " e " + right, line);
        return false;
    }

    public boolean checkArithmetic(Type operand, int line) {
        if (isNumeric(operand)) return true;
        errorReporter.report("Operação aritmética inválida para tipo " + operand, line);
        return false;
    }

    private boolean isNumeric(Type type) {
        return type instanceof PrimitiveType pt && (pt == PrimitiveType.INT || pt == PrimitiveType.FLOAT);
    }

    // ================= Operações lógicas =================
    public boolean checkLogicalBinary(Type left, Type right, int line) {
        if (isBoolean(left) && isBoolean(right)) return true;
        errorReporter.report("Operação lógica inválida entre " + left + " e " + right, line);
        return false;
    }

    public boolean checkLogicalUnary(Type operand, int line) {
        if (isBoolean(operand)) return true;
        errorReporter.report("Expressão não-booleano em contexto lógico: " + operand, line);
        return false;
    }

    private boolean isBoolean(Type type) {
        return type instanceof PrimitiveType pt && pt == PrimitiveType.BOOLEAN;
    }

    // ================= Operações de igualdade =================
    public boolean checkEquality(Type left, Type right, int line) {
        if (left != null && right != null && isCompatible(left, right)) return true;
        errorReporter.report("Comparação de igualdade inválida entre " + left + " e " + right, line);
        return false;
    }

    // ================= Operações relacionais =================
    public boolean checkRelational(Type left, Type right, int line) {
        if (left != null && right != null && isNumeric(left) && isNumeric(right)) return true;
        errorReporter.report("Comparação relacional inválida entre " + left + " e " + right, line);
        return false;
    }

    // ================= Operadores unários =================
    public boolean checkNegation(Type operand, int line) {
        if (operand != null && isNumeric(operand)) return true;
        errorReporter.report("Negação numérica inválida para tipo " + operand, line);
        return false;
    }

    public boolean checkNot(Type operand, int line) {
        if (operand != null && isBoolean(operand)) return true;
        errorReporter.report("Negação lógica inválida para tipo " + operand, line);
        return false;
    }

    // ================= Indexação / Arrays =================
    public boolean checkIndexIsInteger(Type indexType, int line) {
        if (indexType instanceof PrimitiveType pt && pt == PrimitiveType.INT) return true;
        errorReporter.report("Índice de array deve ser int, mas é " + indexType, line);
        return false;
    }

    public Type getElementTypeAfterIndex(Type arrayType, int numIndices, int line) {
        Type cur = arrayType;
        int consumed = 0;

        while (consumed < numIndices) {
            if (!(cur instanceof ArrayType arr)) {
                errorReporter.report("Tentativa de indexar além das dimensões disponíveis (indexes=" + numIndices + ").", line);
                return null;
            }
            cur = arr.getInnerType();
            consumed++;
        }

        return cur;
    }

    // ================= Width =================
    public int widthOf(Type type) {
        return type.getWidth();
    }

}
