package ru.mirea.lab20.ex2;

public class Husky extends Dog {
    private String _bark;
    public Husky(String type, String origin, double weight, double height, String bark) {
        super(type, origin, weight, height);
        this._bark = bark;
    }

    public void set_bark(String _bark) {
        this._bark = _bark;
    }

    public String get_bark() {
        return _bark;
    }

    @Override
    public void bark() {
        System.out.println("This " + )
    }
}
