package ru.mirea.lab24;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> states = new MyArrayList<>(10);
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия");

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания");
        System.out.printf("В списке %d элементов \n", states.size());

        for (int i=0; i<states.size(); ++i) {
            System.out.println(states.get(i));
        }

        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }
        states.remove(0);

    }
}
