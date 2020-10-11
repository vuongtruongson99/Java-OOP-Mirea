package ru.mirea.lab10.exercise2;

public class MagicChair implements Chair {
    private String type = "Magic chair";

    public String getType() {
        return type;
    }

    public void doMagic() {
        System.out.println("This chair can fly!");
    }
}
