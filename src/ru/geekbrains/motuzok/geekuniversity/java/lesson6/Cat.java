package ru.geekbrains.motuzok.geekuniversity.java.lesson6;

public class Cat extends Animal {

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    Cat() {
        ++count;
    }

    @Override
    void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м");
        } else {
            System.out.println("Кот не умеет бежать более 200 м");
        }

    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плыть :(");
    }
}
