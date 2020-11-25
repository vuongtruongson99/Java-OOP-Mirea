package ru.mirea.lab19.ex1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(210.2);
        System.out.println("This circle has radius: " + c1.getRadius());

        Circle c2 = new Circle();
        System.out.println("This circle has radius: " + c2.getRadius());
    }
}