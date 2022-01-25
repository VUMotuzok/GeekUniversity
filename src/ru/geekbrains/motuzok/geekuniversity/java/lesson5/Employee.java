package ru.geekbrains.motuzok.geekuniversity.java.lesson5;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void aboutEmployee() {
        System.out.println("имя сотрудника: " + this.fullName + " " +
                "должность: " + this.position + " " +
                "email " + this.email + " " +
                "телефон: " + this.phoneNumber + " " +
                "зарплата: " + this.salary + " " +
                "возраст: " + this.age);
    }
}
