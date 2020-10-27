package ru.mirea.lab11;

public class TestArrayQueueModule {
    public static void fill() {
        for (int i=0; i<20; ++i) {
            ArrayQueueModule.enqueue(i);
        }
    }

    public static void dump() {
        System.out.println(ArrayQueueModule.size());
        while(!ArrayQueueModule.isEmpty()) {
            System.out.print(
                ArrayQueueModule.dequeue() + " "
            );
        }
    }
    public static void main(String[] args) {
        fill();
        //ArrayQueueModule.enqueue(null);
        dump();
    }
}
