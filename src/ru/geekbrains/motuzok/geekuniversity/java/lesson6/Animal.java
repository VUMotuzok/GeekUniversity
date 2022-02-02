package ru.geekbrains.motuzok.geekuniversity.java.lesson6;

abstract class Animal {

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    Animal() {
        ++count;
    }

    abstract void run(int distance);

    abstract void swim(int distance);
}