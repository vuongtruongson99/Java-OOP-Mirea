package ru.mirea.lab20.ex2;

public class Husky extends Dog {
    public Husky(String origin, double weight, double height) {
        super(origin, weight, height);
    }

    @Override
    public void bark() {
        System.out.println("Woof woof");
    }

    @Override
    public String toString() {
        return "This husky comes from " + this.getOrigin() + ", and is " + this.getHeight() + "cm tall " + "and " + this.getWeight() + "kg";
    }
}
