package ru.mirea.lab9;

import java.math.BigInteger;
import java.util.Scanner;

public class TestUser {
    static void validate(String identifier) throws CheckIdentifierNumberException {
        if (identifier.length() != 12) {
            throw new CheckIdentifierNumberException("Not enough number in identifier!");
        }
        else {
            for (int i=0; i<identifier.length(); i++) {
                if ((int)identifier.charAt(i) < 48 || (int)identifier.charAt(i) > 57) {
                    throw new CheckIdentifierNumberException("Identifier is not a number!");
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String userName = sc.nextLine();

        boolean check = false;
        do {
            System.out.print("Enter your identifier number: ");
            String identifierNumber = sc.nextLine();
            try {
                validate(identifierNumber);
                check = true;
                System.out.println("Valid user!");
            } catch (CheckIdentifierNumberException ex) {
                System.out.println("Exception occured: " + ex);
            }
        } while (check == false);



    }
}
