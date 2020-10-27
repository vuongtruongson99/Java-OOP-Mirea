package ru.mirea.lab14;

public class VictorianChair implements Chair {
    private int age;
    private String type = "Victorian chair";
    VictorianChair(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
