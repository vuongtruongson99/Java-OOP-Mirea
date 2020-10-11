package ru.mirea.lab7;

import java.util.*;

public class TestDequeue {
    public static boolean gameplay(int first, int second) {
        if (first == 0 && second == 9) {
            return true;
        }
        else if (first == 9 && second == 0) {
            return false;
        }
        else {
            return (first > second ? true : false);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> first = new ArrayDeque<Integer>();
        Deque<Integer> second = new ArrayDeque<Integer>();

        for (int i=0; i<5; ++i) {
            first.addLast(sc.nextInt());
        }

        for (int i=0; i<5; ++i) {
            second.addLast(sc.nextInt());
        }

        int count = 0;
        while (!first.isEmpty() && !second.isEmpty()) {
            int f = first.getFirst();
            int s = second.getFirst();

            first.removeFirst();
            second.removeFirst();

            if (gameplay(f, s)) {
                first.addLast(f);
                first.addLast(s);
            }
            else {
                second.addLast(s);
                second.addLast(f);
            }

            if (count++ == 106) {
                System.out.println("botva");
                return;
            }
        }

        System.out.println((first.isEmpty() ? "second " : "first ") + count);
    }
}
