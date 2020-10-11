package ru.mirea.lab5;

import java.util.Scanner;

public class SumDigit {
    public static int sum(int x) {
        if (x == 0) {
            return 0;
        }
        return (x % 10) + sum(x/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
