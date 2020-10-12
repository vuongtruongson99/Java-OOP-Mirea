package ru.mirea.lab20.ex2;

public abstract class Dog {
    private String type;
    private String origin;
    private double weight;
    private double height;

    public Dog(String type, String origin, double weight, double height) {
        this.type = type;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
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
