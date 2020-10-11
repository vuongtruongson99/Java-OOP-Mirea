package ru.mirea.lab1;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public Dog(String n) {
        name = n;
        age = 0;
    }

    public Dog() {
        name = "Puppy";
        age = 0;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + " age " + this.age;
    }

    public void intoHumanAge() {
        System.out.println(name + "'s age in human year is " + age * 7 + " years");
    }
}
