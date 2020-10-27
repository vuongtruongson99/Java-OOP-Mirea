package ru.mirea.lab11;

public class ArrayQueueADT {
    private int size;
    private int head;
    private int tail;
    private Object[] elements = new Object[10];

    private static void fixCapacity(ArrayQueueADT queue, int capacity) {
        assert queue != null;
        int len = queue.elements.length;
        if (capacity > len) {
            int i = 0;
            Object[] new_elements = new Object[len * 2];

            while (queue.tail != queue.head) {
                new_elements[i] = queue.elements[queue.head];
                queue.head = (queue.head + 1) % len;
                ++i;
            }
            queue.head = 0;
            queue.tail = len - 1;
            queue.elements = new_elements;
        }
    }

    // pre-cond: element != null
    //           queue != null
    // post-cond: element[tail] = element;
    //            tail = (tail + 1) % elements.length;
    //            size++;
    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;
        assert queue != null;
        fixCapacity(queue,queue.size + 2);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    // pre-cond: size > 0
    //           queue != null
    // post-cond: R = elements[head];
    public static Object element(ArrayQueueADT queue) {
        assert queue != null;
        assert queue.size > 0;
        return queue.elements[queue.head];
    }

    // pre-cond: size > 0;
    //           queue != null
    // post-cond: R = elements[head];
    //            head = (head + 1) % elements.length;
    //            elements[head] = null;
    //            size--;
    public static Object dequeue(ArrayQueueADT queue) {
        assert queue != null;
        assert queue.size > 0;
        Object first_element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return first_element;
    }

    // pre-cond: queue != null
    // post-cond: R = size;
    public static int size(ArrayQueueADT queue) {
        assert queue != null;
        return queue.size;
    }

    // pre-cond: queue != null
    // post-cond: R = (size == 0)
    public static boolean isEmpty(ArrayQueueADT queue)  {
        assert queue != null;
        return (queue.size == 0);
    }

    // pre-conde: queue != null
    // post-cond: size = 0, head=0, tail=0;
    public static void clear(ArrayQueueADT queue) {
        assert queue != null;
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }
}
