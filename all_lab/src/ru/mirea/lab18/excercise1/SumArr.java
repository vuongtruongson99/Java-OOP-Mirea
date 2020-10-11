package ru.mirea.lab18.excercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of element in array: ");
        int size = sc.nextInt();
        System.out.print("Input " + size + " elements of array: ");
        int[] arr = new int[size];
        for (int i=0; i<size; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("-----------Menu-------------");
        System.out.println("[1] - Print sum of this array with for loop.");
        System.out.println("[2] - Print sum of this array with while loop.");
        System.out.println("[3] - Print sum of this array with do...while loop.");
        System.out.println("[4] - Print out array.");
        System.out.println("[0] - Exit program.");

        int n = -1;
        do {
            System.out.print("Input your choice: ");
            n = sc.nextInt();
            int sum = 0;
            switch (n) {
                case 1:
                    for (int i=0; i<size; ++i) {
                        sum += arr[i];
                    }
                    System.out.println("Answer with for loop: " + sum);
                    break;
                case 2:
                    int w = 0;
                    while (w < size) {
                        sum += arr[w++];
                    }
                    System.out.println("Answer with while loop: " + sum);
                    break;
                case 3:
                    int d = 0;
                    do {
                        sum += arr[d++];
                    } while (d < size);
                    System.out.println("Answer with do...while... loop: " + sum);
                    break;
                case 4:
                    System.out.print("All element of array is: ");
                    for (int i=0; i<size; ++i) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("");
                    break;
                default:
                    break;
            }

        } while (n != 0);

    }
}
