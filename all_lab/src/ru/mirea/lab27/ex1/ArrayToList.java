package ru.mirea.lab27.ex1;

import java.util.LinkedList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String [] str = {"1", "Hello", "Java", "OOP"};

        List<String> lst = new LinkedList<String>();
        for (int i=0; i< str.length; ++i) {
            lst.add(str[i]);
            System.out.print(lst.get(i) + " ");
        }
    }
}
