package ru.mirea.lab20.ex3;

public class FurnitureShop {
    private FurnitureShop() {}

    public static final Furniture getFurniture(FurnitureType type) {
        switch (type) {
            case Table:
                return new Table();
            case Chair:
                return new Chair();
            default:
                throw new IllegalArgumentException("This furniture type is unsupported");
        }
    }
}

