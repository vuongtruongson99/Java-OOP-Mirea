package ru.mirea.lab13;

public class TestClient {
    public static void main(String [] args) {
        ComplexAbstractFactory factory = new ConcreateFactory();
        Complex num1 = factory.CreateComplex(1, 3);
        System.out.println(num1.toString());
        Complex num2 = factory.createComplex();
        System.out.println(num2.toString());
    }
}