package oop.interfaces;

import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {
    public static void main(String[] args) {
        Person manGena = new Person("Gena", "Pupkin", 30);
        Person manAvtondil = new Person("Avtondil", "Pupkin", 9);

        Person manYanis = new Person("Янис", "Леопольдов", 32);
        Person manArtur = new Person("Артур", "Пирожков", 15);
        System.out.println("SORT ARRAY OF MANS");
        Person[] people = new Person[]{manYanis, manArtur, manGena, manAvtondil};
        printArray(people);
        System.out.println("Отсортировали МУЖИКОВ");
        Arrays.sort(people);
        printArray(people);
    }

    public static void printArray(Person[] people) {
        System.out.println("Вывод МУЖИКОООВ:");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + ", " + people[i].getSurname() + ", " + people[i].getAge());
        }
    }
}
