package ru.mirea.lab11;

public class ArrayQueueModule {
    private static int size;
    private static int head;
    private static int tail;
    private static Object[] elements = new Object[10];

    private static void fixCapacity(int capacity) {
        int len = elements.length;
        if (capacity > len) {
            int i = 0;
            Object[] new_elements = new Object[len * 2];

            while (tail != head) {
                new_elements[i] = elements[head];
                head = (head + 1) % len;
                ++i;
            }
            head = 0;
            tail = len - 1;
            elements = new_elements;
        }
    }

    // pre-cond: element != null
    // post-cond: element[tail] = element;
    //            tail = (tail + 1) % elements.length;
    //            size++;
    public static void enqueue(Object element) {
        assert element != null;
        fixCapacity(size + 2);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // pre-cond: size > 0
    // post-cond: R = elements[head];
    public static Object element() {
        assert size > 0;
        return elements[head];
    }

    // pre-cond: size > 0;
    // post-cond: R = elements[head];
    //            head = (head + 1) % elements.length;
    //            elements[head] = null;
    //            size--;
    public static Object dequeue() {
        assert size > 0;
        Object first_element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return first_element;
    }

    // post-cond: R = size;
    public static int size() {
        return size;
    }

    // post-cond: R = (size == 0)
    public static boolean isEmpty() {
        return (size == 0);
    }

    // post-cond: size = 0, head=0, tail=0;
    public static void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }
}
