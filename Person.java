package com.mycompany.mavenproject1;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getRole() {
        return "Person";
    }

    public String getName() {
        return name;
    }
}
