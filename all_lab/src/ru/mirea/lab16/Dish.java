package ru.mirea.lab16;

public final class Dish implements Item {
    private final double _cost;
    private final String _name;
    private final String _description;

    Dish(String name, String description) {
        this._cost = 0;
        this._name = name;
        this._description = description;
    }

    Dish(double cost, String name, String description) {
        this._cost = cost;
        this._name = name;
        this._description = description;
    }

    @Override
    public String get_name() {
        return _name;
    }

    @Override
    public String get_description() {
        return _description;
    }

    @Override
    public double get_cost() {
        return _cost;
    }
}
