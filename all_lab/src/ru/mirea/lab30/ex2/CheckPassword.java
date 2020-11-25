package ru.mirea.lab30.ex2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an password: ");
        String email = sc.nextLine();

        String regex = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
        Pattern p = Pattern.compile(regex);
        if (p.matcher(email).matches()) {
            System.out.println("Password: " + email + " is valid password");
        }
        else {
            System.out.println("Password: " + email + " is not valid Password");
        }
    }
}
