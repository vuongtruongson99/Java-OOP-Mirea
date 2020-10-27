package ru.mirea.lab14;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}
