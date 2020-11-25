package ru.mirea.lab30.ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email: ");
        String email = sc.nextLine();

        String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(\\.([a-zA-Z]{2,5}))*$";
        Pattern p = Pattern.compile(regex);
        if (p.matcher(email).matches()) {
            System.out.println("Email: " + email + " is valid email");
        }
        else {
            System.out.println("Email: " + email + " is not valid email");
        }
    }
}
