package ru.mirea.lab1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {       // 1st constructor
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {     // 3rd constructor
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
