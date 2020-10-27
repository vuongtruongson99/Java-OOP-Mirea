package ru.mirea.lab11;

public class TestArrayQueueADT {
    public static void fill(ArrayQueueADT q) {
        for (int i=0; i< 20; ++i) {
            ArrayQueueADT.enqueue(q, i);
        }
    }

    public static void dump(ArrayQueueADT q) {
        System.out.println(ArrayQueueADT.size(q));
        while(!ArrayQueueADT.isEmpty(q)) {
            System.out.print(ArrayQueueADT.dequeue(q) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        fill(queue);
        dump(queue);
    }
}
