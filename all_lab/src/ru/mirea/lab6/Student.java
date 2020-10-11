package ru.mirea.lab6;

public class Student implements Comparable<Student>{
    private int idNumber;
    private String name;
    private String dateOfBirth;
    private double GPA;

    public Student(int idNumber, String name, String dateOfBirth, double GPA) {
        this.idNumber = idNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        return this.idNumber - o.idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
