package ru.mirea.lab19.ex2;

public class Leg {
    private double longOfLeg;
    private int numberOfToe;
    private String color;

    Leg(double longOfLeg, int numberOfToe, String color) {
        this.longOfLeg = longOfLeg;
        this.numberOfToe = numberOfToe;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLongOfLeg(double longOfLeg) {
        this.longOfLeg = longOfLeg;
    }

    public void setNumberOfFinger(int numberOfToe) {
        this.numberOfToe = numberOfToe;
    }

    public String getColor() {
        return color;
    }

    public double getLongOfLeg() {
        return longOfLeg;
    }

    public int getNumberOfToe() {
        return numberOfToe;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "longOfLeg=" + longOfLeg +
                ", numberOfToe=" + numberOfToe +
                ", color='" + color + '\'' +
                '}';
    }
}
