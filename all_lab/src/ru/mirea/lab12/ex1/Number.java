package ru.mirea.lab12.ex1;

public class Number {
    private StringBuffer number;

    public Number(String num) {
        number = new StringBuffer(num);
    }

    public String format_num() {
        StringBuffer formatted = new StringBuffer("+");
        if (number.charAt(0) == '8') {
            formatted.append("7").append(number.substring(1, 4)).append("-").append(number.substring(4, 7)).append("-").append(number.substring(7));
        }
        else {
            formatted.append(number.charAt(1)).append(number.substring(2, 5)).append("-").append(number.substring(5, 8)).append("-").append(number.substring(8));
        }
        return formatted.toString();
    }
}
