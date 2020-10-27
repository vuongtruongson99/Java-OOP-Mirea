package ru.mirea.lab8;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {}

    public void remove(E element) {
        if (element == deque.getFirst()) {
            System.out.println("Cannot delete the first element of list!");
        } else {
            deque.removeFirstOccurrence(element);
            System.out.println("Element " + element + " has been removed from this UnfairWaitList!");
        }
    }

    public void moveToBack(E element) {
        deque.removeFirstOccurrence(element);
        deque.add(element);
    }

    @Override
    public String toString() {
        return "UnfairWaitList has size " + this.getSize() + " and elements are: " + deque;
    }
}
