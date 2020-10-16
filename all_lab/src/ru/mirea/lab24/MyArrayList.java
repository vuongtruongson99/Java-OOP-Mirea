// Создать свою коллекцию, такую же как и ArrayList.
package ru.mirea.lab24;

public class MyArrayList<T> {
    private int INIT_SIZE = 10;
    private int pointer = 0;

    MyArrayList() {}
    MyArrayList(int size) {
        this.INIT_SIZE = size;
    }

    private Object[] array = new Object[INIT_SIZE];

    public void add(int index, T obj) {
        if (index > array.length) {
            System.out.println("Wrong index");
            System.exit(0);
        }
        Object[] tmp = new Object[array.length + 1];
        for (int i=0; i<index; ++i) {
            tmp[i] = array[i];
        }
        tmp[index] = obj;
        for (int i=index; i< array.length; ++i) {
            tmp[i+1] = array[i];
        }
        array = tmp;
        pointer++;
    }

    public void add(T obj) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = obj;
    }

    public void remove(int index) {
        for (int i=index; i<pointer; ++i) {
            array[i] = array[i+1];
        }
        array[pointer] = null;
        pointer--;
    }

    public boolean contains(T obj) {
        for (int i=0; i<pointer; ++i) {
            if (array[i] == obj) {
                return true;
            }
        }
        return false;
    }

    public void resize(int size) {
        Object[] newArr = new Object[size];
        System.arraycopy(array, 0, newArr, 0, pointer);
        array = newArr;
    }

    public void set(int index, T obj) {
        if (index > pointer) {
            System.out.print("Index out of bound");
            System.exit(0);
        }
        array[index] = obj;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public int size() {
        return pointer;
    }
}
