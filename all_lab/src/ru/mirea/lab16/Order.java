package ru.mirea.lab16;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private int size;
    private List<Item> ord;

    Order() {
        ord = new LinkedList<Item>();
        size = 0;
    }

    public void add(Item o) {
        ord.add(o);
        size++;
    }

    public boolean remove(String name) {
        for (int i=0; i<ord.size(); ++i) {
            if (ord.get(i).get_name() == name) {
                size--;
                return ord.remove(ord.get(i));
            }
        }
        return false;
    }

    public void removeAll(String name) {
        for (int i=0; i<ord.size(); ) {
            if (ord.get(i).get_name() == name) {
                size--;
                ord.remove(ord.get(i));
            }
            else {
                ++i;
            }
        }
    }

    public int OrderQuantity() {
        return size;
    }

    public double costTotal() {
        double total = 0;
        for (int i=0; i<ord.size(); ++i) {
            total += ord.get(i).get_cost();
        }
        return total;
    }

    public List<Item> getOrd() {
        return ord;
    }
}
