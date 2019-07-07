package io_strems.io;

import java.io.Serializable;

public class Footballer implements Serializable {
    private String name;
    private int age;
    private String position;

    public Footballer(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
}
