package oop.interfaces;

import static java.lang.Integer.parseInt;

public class Person implements Comparable<Person>,Walkable {
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
        int result = this.name.compareTo(person.name);
        if (result == 0) {
            result = this.surname.compareTo(person.surname);
        }
        return result;
    }
    @Override
    public String toString() {
        return  "name: " + name + ", " +"surname: " + surname +", "+"age: " + age;
    }

    @Override
    public int getwalk(int distance) {
return 0;
    }
}
