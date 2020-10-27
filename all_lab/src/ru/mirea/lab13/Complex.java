package ru.mirea.lab13;

public class Complex {
    private int real;
    private int image;

    Complex() {
        this.real = 0;
        this.image = 0;
    }

    Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}