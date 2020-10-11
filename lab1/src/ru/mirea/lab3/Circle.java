package ru.mirea.lab3;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "Blue";
        radius = 1;
    };

    public Circle(double radius) {
        this.radius = radius;
        this.filled = false;
        this.color = "Blue";
    }

    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}