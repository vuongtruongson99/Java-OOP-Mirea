package ru.mirea.lab10.ex2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string with ',' separate: ");
        String address = sc.nextLine();

        Address formatted_address = new Address();
        formatted_address.format_split(address);
        System.out.println("Country is: " + formatted_address.getCountry());
        System.out.println("City is: " + formatted_address.getCity());
        System.out.println("House is: " + formatted_address.getHouse());

        System.out.print("Input string with '-' separate: ");
        address = sc.nextLine();
        formatted_address.StringToken(address);
        System.out.println("Country is: " + formatted_address.getCountry());
        System.out.println("City is: " + formatted_address.getCity());
        System.out.println("House is: " + formatted_address.getHouse());

    }
}
