package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Dusia",3,5.6,"Cat");
        cat1.printCat();
        Dog dog1 =new Dog("Cooper",1,32.5,"Dog");
        dog1.printDog();
        Cat cat2 = new Cat("Chicha",5,15,"Cat");
        cat2.printCat();
        cat2.eat();
        cat2.meet();
        Dog dog2 = new Dog("Hoha",5,10,"Dog");
        dog2.printDog();
        dog2.meet();
        dog2.eat();
        System.out.println("Выводим прежнее имя,используя getName:  "+cat1.getName());
        cat1.setName("Coco");
        System.out.println("Выводим измененное имя,используя getName:  "+cat1.getName());
        System.out.println("Выводим прежний возраст,используя getAge:  "+dog2.getAge());
        dog2.setAge(60);
        System.out.println("Выводим измененный возраст,используя getAge:  "+dog2.getAge());

    }
}
