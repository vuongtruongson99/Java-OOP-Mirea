package ru.mirea.lab21.ex1;

public class Car implements Nameable {
    private String name;

    Car(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("This car is called " + this.name);
    }
}
