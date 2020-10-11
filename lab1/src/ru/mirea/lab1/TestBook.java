package ru.mirea.lab1;

public class TestBook {
    public static void main(String [] args) {
        Book b1 = new Book("Alexander", 1995, "Story of my live");
        Book b2 = new Book("Harry Jone", "Snowman");
        Book b3 = new Book();

        b3.setAuthor("Stephenie Meyer");
        b3.setNameOfBook("Midnight sun");
        b3.setYear(1992);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b3.setAuthor("Stephenie Meyer");
        b3.setNameOfBook("Midnight sun");

        b2.ageOfBook();
        b3.ageOfBook();
    }
}
