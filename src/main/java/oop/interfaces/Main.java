package oop.interfaces;

import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {
    public static void main(String[] args) {
        Person manGena = new Person("Gena", "Pupkin", 30);
        Person manAvtondil = new Person("Avtondil", "Pupkin", 9);
        Person manAvtondil1 = new Person("Avtondil", "Pupkin", 15);
        Person manAvtondil3 = new Person("Avtondil", "Pupkin", 45);
        Person manAvtondil2 = new Person("Avtondil", "Pipkin", 9);
        Person manYanis = new Person("Янис", "Леопольдов", 32);
        Person manArtur = new Person("Артур", "Пирожков", 15);
        System.out.println("SORT ARRAY OF MANS");
        Person[] people = new Person[]{manYanis, manArtur, manGena, manAvtondil, manAvtondil1, manAvtondil2, manAvtondil3};
        printArray(people);
        System.out.println("Отсортировали МУЖИКОВ");
        Arrays.sort(people);
        printArray(people);
        System.out.print("Использование переопределенного метода toString: ");
        System.out.println(manGena.toString());
        double temp = manArtur.getWalk(25);
        if (temp >= 0) {
            System.out.println(manArtur.getName() + " : " + "Среднее время в пути: " + temp + "ч");
        } else {
            System.out.println(manArtur.getName() + " : оЙ,да не звезди.Ты столько не мог пройти!");
        }


    }

    public static void printArray(Person[] people) {
        System.out.println("Вывод МУЖИКОООВ:");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + ", " + people[i].getSurname() + ", " + people[i].getAge());
        }
    }
}
