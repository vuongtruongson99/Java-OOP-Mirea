package ru.mirea.lab10.exercise2;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Client sit on " + chair.getType());
    }
}
