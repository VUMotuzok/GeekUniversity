package ru.geekbrains.motuzok.geekuniversity.java.lesson7;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Плюшный", 5, false);
        allCats[1] = new Cat("Пухль", 10, false);
        allCats[2] = new Cat("Шашлык", 45, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].satiety == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                allCats[i].satiety = true;
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить в миску?");
        action = scanner.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
