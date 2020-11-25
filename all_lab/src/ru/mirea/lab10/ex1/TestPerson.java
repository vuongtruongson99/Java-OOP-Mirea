package ru.mirea.lab10.ex1;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input surname: ");
        String surname = sc.nextLine();
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input sure patronymic: ");
        String patronymic = sc.nextLine();

        Person Name = new Person(name, surname, patronymic);
        System.out.println("Your formatted name is: " + Name.getFomat());
    }
}
