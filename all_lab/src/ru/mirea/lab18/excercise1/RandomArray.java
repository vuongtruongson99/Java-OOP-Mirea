package ru.mirea.lab18.excercise1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 30;
        System.out.print("Input number element of array: ");
        int sz = sc.nextInt();

        int[] arr = new int[sz];
        System.out.print("Random array: ");
        for (int i=0; i<sz; ++i) {
            arr[i] = rand.nextInt(upperbound);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Sorted random array: ");
        Arrays.sort(arr);
        for (int i=0; i<sz; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
