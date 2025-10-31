// Type.java
public abstract class Type {
    public abstract int getWidth();        // largura em bytes
    public abstract String toString();     // representação textual
}

// Tipos primitivos
class PrimitiveType extends Type {
    public static final PrimitiveType INT     = new PrimitiveType("int", 4);
    public static final PrimitiveType FLOAT   = new PrimitiveType("float", 8);
    public static final PrimitiveType CHAR    = new PrimitiveType("char", 1);
    public static final PrimitiveType BOOLEAN = new PrimitiveType("boolean", 1);
    public static final PrimitiveType VOID    = new PrimitiveType("void", 0);

    private final String name;
    private final int width;

    private PrimitiveType(String name, int width) {
        this.name = name;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Arrays (multidimensionais)
class ArrayType extends Type {
    private final Type innerType;  // pode ser PrimitiveType ou outro ArrayType
    private final int size;        // tamanho desta dimensão

    public ArrayType(Type innerType, int size) {
        this.innerType = innerType;
        this.size = size;
    }

    public Type getInnerType() {
        return innerType;
    }

    public int getSize() {
        return size;
    }

    public int getDimensionsProduct() {
        if (innerType instanceof ArrayType) {
            return size * ((ArrayType) innerType).getDimensionsProduct();
        } else {
            return size;
        }
    }

    @Override
    public int getWidth() {
        return size * innerType.getWidth();
    }

    @Override
    public String toString() {
        return innerType.toString() + "[" + size + "]";
    }
}