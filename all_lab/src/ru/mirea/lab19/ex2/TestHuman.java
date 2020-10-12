package ru.mirea.lab19.ex2;

public class TestHuman {
    public static void main(String[] args) {
        Head hd1 = new Head("Blue", "Square", false);
        Hand h1 = new Hand(5, 55, "white");
        Leg l1 = new Leg(70, 5, "white");
        Human A = new Human(h1, l1, hd1);
        System.out.println(A.toString());
    }
}
