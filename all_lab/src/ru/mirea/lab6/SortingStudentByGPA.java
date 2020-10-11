package ru.mirea.lab6;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() > o2.getGPA()) {
            return 1;
        }
        else if (o1.getGPA() == o2.getGPA()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
