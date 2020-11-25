package ru.mirea.lab29.ex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String test = sc.nextLine();

        String regex = "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(test);

        System.out.print("String: " + test + ": " + m.matches() + " format dd/mm/yyyy");
    }
}
