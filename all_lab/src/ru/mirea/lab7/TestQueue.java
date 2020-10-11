package ru.mirea.lab7;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestQueue {
    public static boolean gameplay(int first, int second) {
        if (first == 0 && second == 9) {
            return true;
        }
        else if (second == 0 && first == 9) {
            return false;
        }
        else {
            if (first > second) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> first = new LinkedList<Integer>();
        Queue<Integer> second = new LinkedList<Integer>();

        for (int i=0; i<5; ++i) {
            first.add(sc.nextInt());
        }

        for (int i=0; i<5; ++i) {
            second.add(sc.nextInt());
        }

        int count = 0;
        while(!first.isEmpty() && !second.isEmpty()) {
            int f = first.peek();
            int s = second.peek();

            first.remove();
            second.remove();

            if (gameplay(f, s)) {
                first.add(f);
                first.add(s);
            }
            else {
                second.add(s);
                second.add(f);
            }

            if(count++ == 106) {
                System.out.println("botva");
                return;
            }
        }

        System.out.println((first.isEmpty() ? "second " : "first ") + count);

    }
}
