package ru.mirea.lab27.ex2;

public class MyArray<E> {
    private E [] arr;

    public E getArrInd(int i) {
        return arr[i];
    }

    public void setArr(E [] arr) {
        this.arr = arr;
    }

    public int getLength() {
        return arr.length;
    }
}
