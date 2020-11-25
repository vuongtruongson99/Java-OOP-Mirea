package ru.mirea.lab26.ex2;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.print(2/i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Wrong format number");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
