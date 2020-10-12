package ru.mirea.lab19.ex3;

public class Book {
    private String nameOfAuthor;
    private String nameOfBook;
    private int publishingYear;
    private double customerReview;

    public void setCustomerReview(double customerReview) {
        this.customerReview = customerReview;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public double getCustomerReview() {
        return customerReview;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfAuthor='" + nameOfAuthor + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", publishingYear=" + publishingYear +
                ", customerReview=" + customerReview +
                '}';
    }
}
