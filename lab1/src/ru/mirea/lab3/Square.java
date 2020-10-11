package ru.mirea.lab3;

public class Square extends Rectangle {
    public Square() {
        this.color = "Red";
        this.filled = false;
        this.length = 1;
        this.width = 1;
    }

    public Square(double side) {
        super(side, side);
        this.color = "Red";
        this.filled = false;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        String isNot = "";
        if (this.isFilled() == false) {
            isNot = "not";
        }
        return "Square{" +
                "side= " + this.length +
                "color= " + this.color +
                "filled= " + isNot + " filled";
    }
}
