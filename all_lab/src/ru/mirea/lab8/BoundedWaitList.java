package ru.mirea.lab8;

public class BoundedWaitList <E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (this.getSize() >= capacity) {
            System.out.println("There is no more space in this BoundedWaitList");
        }
        else {
            deque.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList has size " + this.getSize() + " and elements are: " + deque;
    }
}
