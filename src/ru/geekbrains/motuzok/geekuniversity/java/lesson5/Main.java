package ru.geekbrains.motuzok.geekuniversity.java.lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Motuzok Victoria", "Teamlead", "m93vu@ya.ru", "89537021151", 250000, 28);
        employee[1] = new Employee("Oleg Chekanov", "CEO", "sandboxxx@ya.ru", "89290186332", 500000, 33);
        employee[2] = new Employee("Tanya Opanasenko", "Sales Head", "TOOpanasenko@job.ru", "89057394751", 100000, 31);
        employee[3] = new Employee("Vera Samoylova", "Sales Agent", "VMSamoylova@1cbit.ru", "89537199553", 50000, 43);
        employee[4] = new Employee("Olga Tikhonova", "Sales Agent", "OVTikhonova@abt.ru", "89084667806", 25000, 65);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > 40) {
                employee[i].aboutEmployee();
            }
        }
    }
}
