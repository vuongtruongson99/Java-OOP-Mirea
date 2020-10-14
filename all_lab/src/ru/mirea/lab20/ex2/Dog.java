package ru.mirea.lab20.ex2;

public abstract class Dog {
    private String origin;
    private double weight;
    private double height;

    public Dog(String origin, double weight, double height) {
        this.origin = origin;
        this.weight = weight;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    public abstract void bark();
}
