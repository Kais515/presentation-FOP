package com.mycompany.mavenproject1;

public class Patient extends Person {
    private int age;
    private String departmentNeeded;

    public Patient(String name, int age, String departmentNeeded) {
        super(name);
        this.age = age;
        this.departmentNeeded = departmentNeeded;
    }

    public String getDepartmentNeeded() {
        return departmentNeeded;
    }

    @Override
    public String getRole() {
        return "Patient";
    }
}
