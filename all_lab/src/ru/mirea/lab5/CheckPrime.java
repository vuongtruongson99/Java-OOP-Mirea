package ru.mirea.lab5;

import java.util.Scanner;

public class CheckPrime {
    public static boolean Prime(int x, int i) {
        if (x < 2) {
            return false;
        }
        else if (x == 2) {
            return true;
        }
        else if (x % i == 0) {
            return false;
        }
        else if (i < x/2) {
            return Prime(x, ++i);
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int check = sc.nextInt();
        System.out.println(Prime(check, 2));
    }
}
