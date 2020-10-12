package ru.mirea.lab19.ex3;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setCustomerReview(4.3);
        b1.setNameOfAuthor("Marcel Proust");
        b1.setNameOfBook("In Search of Lost Time");
        b1.setPublishingYear(1913);
        System.out.println(b1.toString());

        Book b2 = new Book();
        b2.setNameOfAuthor("James Joyce");
        b2.setNameOfBook("Ulysses");
        b2.setPublishingYear(1904);
        b2.setCustomerReview(4.6);
        System.out.println(b2.toString());
    }
}
