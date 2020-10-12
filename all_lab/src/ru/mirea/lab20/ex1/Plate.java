package ru.mirea.lab20.ex1;

public class Plate extends Dish{
    private String size;

    public Plate(String size, String color, String material) {
        super(material, color);
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void displayInfo() {
        System.out.println("This plate has size " + this.size + ", material is " + this.getMaterial() + ", and " + this.getColor());
    }
}
