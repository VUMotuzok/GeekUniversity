package ru.geekbrains.motuzok.geekuniversity.java.lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(600);
        dog.swim(5);

        Cat cat = new Cat();
        cat.run(100);
        cat.swim(9);

        System.out.println("Животных создано: " + Animal.getCount());
        System.out.println("Псов создано: " + Dog.getCount());
        System.out.println("Котов создано" + Cat.getCount());
    }
}

