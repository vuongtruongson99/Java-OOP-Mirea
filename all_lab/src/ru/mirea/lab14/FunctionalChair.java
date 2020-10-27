package ru.mirea.lab14;

public class FunctionalChair implements Chair {
    private String type = "Functional chair";

    public String getType() {
        return type;
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
