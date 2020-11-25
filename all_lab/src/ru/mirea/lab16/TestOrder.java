package ru.mirea.lab16;

public class TestOrder {
    public static void main(String [] args) {
        Order o = new Order();
        Drink d1 = new Drink(15.23, "Coktail", "Abc123abc");
        Dish d2 = new Dish(20.01, "Fish", "Fish fresh");

        o.add(d1);
        o.add(d1);
        o.add(d2);
        o.getOrd();
        System.out.println(o.OrderQuantity());
        System.out.println(o.costTotal());

        o.removeAll("Coktail");
        System.out.println();
        o.getOrd();
        System.out.println(o.OrderQuantity());
        System.out.println(o.costTotal());
    }
}
