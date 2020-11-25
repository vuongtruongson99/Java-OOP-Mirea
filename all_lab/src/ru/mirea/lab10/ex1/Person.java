package ru.mirea.lab10.ex1;

public class Person {
    private String Name;
    private String SurName;
    private String Patronymic;

    public Person(String name, String surName, String patronymic) {
        this.Name = name;
        this.SurName = surName;
        this.Patronymic = patronymic;
    }

    public StringBuffer getFomat() {
        StringBuffer formatted = new StringBuffer().append(SurName).append(" ");
        if (Name.length() == 0) {
            if (Patronymic.length() != 0) {
                formatted.append(Patronymic.charAt(0)).append(".");
            }
        }
        else {
            if (Patronymic.length() == 0) {
                formatted.append(Name.charAt(0)).append(".");
            }
            else {
                formatted.append(Name.charAt(0)).append(".").append(Patronymic.charAt(0)).append(".");
            }
        }
        return formatted;
    }
}
