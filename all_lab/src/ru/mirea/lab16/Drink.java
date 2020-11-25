package ru.mirea.lab16;

public final class Drink implements Item {
    private final String _name;
    private final String _description;
    private final double _cost;

    Drink(double cost, String name, String description) {
        this._cost = cost;
        this._name = name;
        this._description = description;
    }

    Drink(String name, String description) {
        _cost = 0;
        this._name = name;
        this._description = description;
    }

    @Override
    public double get_cost() {
        return _cost;
    }

    @Override
    public String get_description() {
        return _description;
    }

    @Override
    public String get_name() {
        return _name;
    }
}
