package com.mycompany.mavenproject1;

public class Doctor extends Person {
    
    private String department;
    private boolean available;

    public Doctor(String name, String department, boolean available) {
        super(name);
        this.department = department;
        this.available = available;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String getRole() {
        return "Doctor";
    }
}
