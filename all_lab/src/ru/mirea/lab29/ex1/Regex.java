package ru.mirea.lab29.ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str1 = "abcdefghijklmnopqrstuv18340";
        System.out.println("String " + str1 + ": " + p1.matcher(str1).matches());

        str1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println("String " + str1 + ": " + p1.matcher(str1).matches());
    }
}
