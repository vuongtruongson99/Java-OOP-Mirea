package ru.mirea.lab1;

public class TestBall {
    public static void main(String [] args) {
        Ball ball1 = new Ball("Red", 10.5);
        Ball ball2 = new Ball("Purple");
        Ball ball3 = new Ball();

        System.out.println(ball3);

        ball1.setRadius(0.3);
        if (ball1.isEqual(ball2)) {
            System.out.println("2 balls are equal!");
        }
        else {
            System.out.println("2 balls are not equal!");
        }
    }
}
