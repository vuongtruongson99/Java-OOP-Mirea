package ru.mirea.lab8;

import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E> {
    final protected Deque<E> deque = new ConcurrentLinkedDeque<>();

    public WaitList() {}

    public WaitList(Collection<E> c) {
        deque.addAll(c);
    }

    @Override
    public void add(E element) {
        deque.add(element);
    }

    @Override
    public E remove() {
        return deque.remove();
    }

    @Override
    public boolean contains(E element) {
        return deque.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return deque.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int getSize() {
        return deque.size();
    }
}
