package ru.mirea.lab12.ex1;

import java.util.Scanner;

public class TestPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your phone number: ");
        String phoneNumber = sc.nextLine();
        Number newFormatted = new Number(phoneNumber);
        System.out.print("Your phone number after formatted: ");
        System.out.println(newFormatted.format_num());
    }
}
