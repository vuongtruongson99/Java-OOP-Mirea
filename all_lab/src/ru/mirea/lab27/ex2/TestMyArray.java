package ru.mirea.lab27.ex2;

public class TestMyArray {
    public static <E> void convertToMyArr(String s, E [] arr) {
        MyArray<E> tmp = new MyArray<E>();
        tmp.setArr(arr);

        System.out.print(s + "  ");
        for (int i=0; i<tmp.getLength(); ++i) {
            System.out.print(tmp.getArrInd(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] s = {"Hello", "World", "!"};
        convertToMyArr("String", s);

        Integer[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        convertToMyArr("Integer", i);

        Double[] d = {1.2, 3.14, 5.12, 15.52, 123.34};
        convertToMyArr("Double", d);
    }
}
