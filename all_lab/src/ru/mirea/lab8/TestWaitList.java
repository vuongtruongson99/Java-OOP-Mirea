package ru.mirea.lab8;

public class TestWaitList {
    public static void main(String[] args) {
        IWaitList<Integer> q = new BoundedWaitList<Integer>(10);
        for (int i=0; i<11; ++i) {
            q.add(i);
        }
        System.out.println(q.toString());

        UnfairWaitList<Integer> q2 = new UnfairWaitList<Integer>();
        for (int i=0; i<11; ++i) {
            q2.add(i);
        }
        q2.remove(3);
        q2.moveToBack(2);
        System.out.println(q2.toString());
    }
}
