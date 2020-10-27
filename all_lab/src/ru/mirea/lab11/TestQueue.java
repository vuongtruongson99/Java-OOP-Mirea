package ru.mirea.lab11;

public class TestQueue {
    public static void fillQueue(ArrayQueue q) {
        for (int i=0; i<20; ++i) {
            q.enqueue(i);
        }
    }

    public static void dump(ArrayQueue q) {
        System.out.println(q.size());
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        fillQueue(q);
        //System.out.print(q.dequeue());
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        dump(q);
        q.enqueue(null);
    }
}
