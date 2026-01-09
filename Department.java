package com.mycompany.mavenproject1;

public class Department {
    private String name;
    private Doctor[] doctors;
    private int floor;

    public Department(String name, Doctor[] doctors, int floor) {
        this.name = name;
        this.doctors = doctors;
        this.floor = floor;
    }

    public Doctor findAvailableDoctor() {
        for (Doctor d : doctors) {
            if (d.isAvailable()) {
                return d;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getDoctorCount() {
        return doctors.length;
    }
}
