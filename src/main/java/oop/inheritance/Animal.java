package oop.inheritance;

import oop.interfaces.Walkable;

public class Animal implements Walkable {

    // Переопределил метод "eat"  в классе class Cat
    public void eat() {
        System.out.print(" Кормление : ");
        System.out.print("Покорми меня! Строит грустные глазки");
        System.out.println();
    }

    //Переопределил метод "meet" в классе class Dog
    public void meet() {
        System.out.print(" Встреча хозяина : ");
        System.out.println(" А, это ты пришел. Ну ладно.");
    }

    @Override
    public double getWalk(int distance) {
        if (distance <= MAX_WALK_DISTANCE) {
            double time = distance / AVERAGE_SPEED;
            return time;
        }
        return -1;
    }
}

