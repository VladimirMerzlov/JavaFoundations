package oop.interfaces;

import static java.lang.Integer.parseInt;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        if (parseInt(this.name) - parseInt(person.name) != 0) {
            return parseInt(this.name) - parseInt(person.name);
        }
        if (parseInt(this.surname) - parseInt(person.surname) != 0) {
            return parseInt(this.surname) - parseInt(person.surname);
        }
        if (this.age - person.age != 0) {
            return this.age - person.age;
        }
        return 0;
    }

}
