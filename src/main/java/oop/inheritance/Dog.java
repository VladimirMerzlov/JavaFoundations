package oop.inheritance;

public class Dog extends Animal {
    private String name;
    private int age;
    private double weight;
    private String sex;

    public Dog(String name, int age, double weight, String sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public void printDog() {
        System.out.println("Name: " + name + " Age: " + age + " Weight: " + weight + " Sex: " + sex);
    }

    // Переопределил метода "meet"
    public void meet() {
        System.out.print(" Встреча хозяина : ");
        System.out.println("Печенька мне в рот, ТЫ ПРИШЕЛ)))!!! Ура,Гав!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Ошибка! Вес не может быть отрицательным или равным 0");
        }
    }
}
