package ru.mirea.lab21.ex1;

public class Plane implements Nameable {
    private String name;

    Plane(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("This plane is called " + this.name);
    }
}
