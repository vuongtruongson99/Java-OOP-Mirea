package ru.mirea.lab18;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number for calculate factor: ");
        int n = sc.nextInt();
        int factor = 1;
        for (int i=1; i<=n; ++i) {
            factor *= i;
        }
        System.out.print("Factor of " + n + " are " + factor);
    }
}
