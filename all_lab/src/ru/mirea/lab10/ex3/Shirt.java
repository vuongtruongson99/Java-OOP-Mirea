package ru.mirea.lab10.ex3;

public class Shirt {
    private StringBuffer code;
    private StringBuffer name;
    private StringBuffer color;
    private StringBuffer size;

    public Shirt(String shirt) {
        String[] arrOfStr = shirt.split(",");
        code = new StringBuffer(arrOfStr[0]);
        name = new StringBuffer(arrOfStr[1]);
        color = new StringBuffer(arrOfStr[2]);
        size = new StringBuffer(arrOfStr[3]);
    }
    @Override
    public String toString() {
        return new StringBuffer().append("This shirt has code ").append(code).append(", and name is ").append(name).append(", color is ").append(color).append(", and size is ").append(size).toString();
    }
}
