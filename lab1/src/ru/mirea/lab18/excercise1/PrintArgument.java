package ru.mirea.lab18.excercise1;

public class PrintArgument {
    public static void main(String[] args) {
        for (int i=0; i<args.length; ++i) {
            System.out.println("Argument[" + i + "] = " + args[i]);
        }
    }
}
