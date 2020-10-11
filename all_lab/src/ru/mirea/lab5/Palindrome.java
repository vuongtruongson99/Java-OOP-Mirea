package ru.mirea.lab5;

import java.util.Scanner;

public class Palindrome {
    public static String checkPalindrome(String x) {
        boolean check = false;
        for (int i = 0; i<x.length()/2; ++i) {
            if (x.charAt(i) != x.charAt(x.length() - i - 1)) {
                check = true;
                break;
            }
        }
        if (check) {
            return "No";
        }
        else {
            return "Yes";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s));
    }
}
// abcba
// abba