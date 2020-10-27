package ru.mirea.lab11;

public class ArrayQueue {
    private int size;
    private int head;
    private int tail;
    private Object[] elements = new Object[10];

    public void fixCapacity(int capacity) {
        int len = elements.length;

        if (capacity > len) {
            int i = 0;
            Object[] new_elements = new Object[len * 2];
            while (head != tail) {
                new_elements[i] = elements[head];
                head = (head + 1) % len;
                i++;
            }
            head = 0;
            tail = len - 1;
            elements = new_elements;
        }
    }

    // pre-condition: element != null
    // post-condition: element[tail] = obj
    // tail = (tail + 1) % len
    // size = size + 1
    public void enqueue(Object obj) {
        assert obj != null;
        fixCapacity(size + 2);
        elements[tail] = obj;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // pre-condition: size > 0;
    // post-condition: first_ele = elements[head];
    public Object element() {
        assert size > 0;
        return elements[head];
    }

    // pre-condition: size > 0
    // post-condition: first_ele = elements[head];
    // head = (head + 1) % elements.length;
    // size--
    public Object dequeue() {
        Object first_ele = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return first_ele;
    }

    // post-condition: return size;
    public int size() {
        return size;
    }

    // post-condition: return (size == 0);
    public boolean isEmpty() {
        return (size == 0);
    }

    // post-condition: size = 0;
    //                 head = 0;
    //                 tail = 0;
    public void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }
}
