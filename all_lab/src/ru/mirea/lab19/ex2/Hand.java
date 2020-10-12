package ru.mirea.lab19.ex2;

public class Hand {
    private int numberOfFinger;
    private double longOfHand;
    private String color;

    Hand(int numberOfFinger, double longOfHand, String color) {
        this.numberOfFinger = numberOfFinger;
        this.longOfHand = longOfHand;
        this.color = color;
    }

    public void setNumberOfFinger(int numberOfFinger) {
        this.numberOfFinger = numberOfFinger;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLongOfHand(double longOfHand) {
        this.longOfHand = longOfHand;
    }

    public int getNumberOfFinger() {
        return numberOfFinger;
    }

    public String getColor() {
        return color;
    }

    public double getLongOfHand() {
        return longOfHand;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "numberOfFinger=" + numberOfFinger +
                ", longOfHand=" + longOfHand +
                ", color='" + color + '\'' +
                '}';
    }
}
