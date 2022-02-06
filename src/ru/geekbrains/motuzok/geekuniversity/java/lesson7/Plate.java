package ru.geekbrains.motuzok.geekuniversity.java.lesson7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("Всего еды: " + food);
        System.out.println("__________________________");
        if (food < 0) {
            System.out.println("Еды в миске нет, идите есть в другое место!");
        }
    }
}
