package ru.mirea.lab20.ex1;

public abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public abstract void displayInfo();
}
