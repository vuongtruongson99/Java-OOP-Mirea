package ru.mirea.lab14;

public class MagicChair implements Chair {
    private String type = "Magic chair";

    public String getType() {
        return type;
    }

    public void doMagic() {
        System.out.println("This chair can fly!");
    }
}
