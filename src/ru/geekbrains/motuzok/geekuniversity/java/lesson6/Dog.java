package ru.geekbrains.motuzok.geekuniversity.java.lesson6;


public class Dog extends Animal {

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    Dog() {
        ++count;
    }

    @Override
    void run(int distance) {
        if (distance <= 500) {
            System.out.println("Пёс пробежал " + distance + " м");
        } else {
            System.out.println("Пёс не умеет бежать более 500 м");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Пёс проплыл " + distance + " м");
        } else {
            System.out.println("Пёс не умеет плавать более 10 м");
        }
    }
}