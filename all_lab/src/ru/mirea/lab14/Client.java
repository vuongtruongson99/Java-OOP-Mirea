package ru.mirea.lab14;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Client sit on " + chair.getType());
    }
}
