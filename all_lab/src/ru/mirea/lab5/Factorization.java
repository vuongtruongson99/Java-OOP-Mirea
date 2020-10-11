package ru.mirea.lab5;

import java.util.Scanner;

public class Factorization {
    public static void factor(int x, int i) {
        if (i > x/2) {
            System.out.print(x);
            return;
        }
        if (x % i == 0) {
            System.out.print(i + " ");
            factor(x/i, i);
        }
        else {
            factor(x, ++i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        System.out.print("Factor of " + n + " is: " );
        factor(n, 2);
    }
}
