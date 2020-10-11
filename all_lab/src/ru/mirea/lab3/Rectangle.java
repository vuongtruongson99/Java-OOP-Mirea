package ru.mirea.lab3;

import javax.crypto.spec.RC2ParameterSpec;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.color = "Green";
        this.length = 1.0;
        this.width = 1.0;
        this.filled = false;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "Green";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        String isNot = "";
        if (this.isFilled() == false) {
            isNot = "not";
        }
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + isNot + " filled" +
                '}';
    }
}
