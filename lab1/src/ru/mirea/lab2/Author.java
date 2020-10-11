package ru.mirea.lab2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        if (this.gender == 'M') {
            return this.name + " (m) at " + this.email;
        }
        else if(this.gender == 'F') {
            return this.name + " (mrs) at " + this.email;
        }
        else {
            return this.name + " at " + this.email;
        }
    }
}
