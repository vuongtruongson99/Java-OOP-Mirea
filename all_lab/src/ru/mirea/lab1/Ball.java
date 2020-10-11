package ru.mirea.lab1;

public class Ball {
    private String color;
    private double radius;

    public Ball() {
        color = "white";
        radius = 0.0;
    }

    public Ball(String c, double r) {
        color = c;
        radius = r;
    }

    public Ball(String c) {
        color = c;
        radius = 0.0;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "The ball is " + color + " and the radius is " + radius;
    }

    public boolean isEqual(Ball b2) {
        if (this.radius == b2.radius) {
            return true;
        }
        else {
            return false;
        }
    }
}
