package ru.mirea.lab6;

import java.lang.Comparable;
import java.lang.String;
import java.lang.System;
import java.util.Comparator;

public class TestStudent {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void swap(Student[] arr, int l, int r) {
        Student t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    public static void quickSort(Student[] list, Comparator c, int left, int right) {
        int ll = left;
        int rr = right;

        if (rr > ll) {
            Student pivot = list[(ll+rr)/2];
            while(ll <= rr) {
                while(ll < right && c.compare(list[ll], pivot) < 0) {
                    ll += 1;
                }
                while(rr>left && c.compare(list[rr], pivot) > 0) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    swap(list, ll, rr);
                    ll += 1;
                    rr -= 1;
                }
            }
            if (left < rr) {
                quickSort(list, c, left, rr);
            }
            if (ll < right) {
                quickSort(list, c, ll, right);
            }
        }
    }

    public static void main(String[] args) {
        Student[] listStudent;
        listStudent = new Student[4];
        listStudent[0] = new Student(7, "Sergei", "02/09/1945", 3.7);
        listStudent[1] = new Student(1, "Anna", "01/08/1995", 2.5);
        listStudent[2] = new Student(4, "Petrov", "23/05/2000", 3.9);
        listStudent[3] = new Student(10, "Jena", "12/04/1997", 1.2);

        System.out.println("List of student before sort: ");
        for(Student t : listStudent) {
            System.out.println(t);
        }

        //selectionSort(listStudent);

        SortingStudentByGPA sortByGPA = new SortingStudentByGPA();
        quickSort(listStudent, sortByGPA, 0, 3);

        System.out.println("List of student after sort: ");
        for (Student t : listStudent) {
            System.out.println(t);
        }
    }
}
