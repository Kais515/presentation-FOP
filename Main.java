    //24231084

    package com.mycompany.mavenproject1;

    public class Main {
        public static void main(String[] args) {

            Doctor d1 = new Doctor("Ali", "Cardiology", true);
            Doctor d2 = new Doctor("Sara", "Cardiology", false);
            Doctor d3 = new Doctor("John", "Neurology", true);

            Department cardiology = new Department(
                    "Cardiology",
                    new Doctor[]{d1, d2},
                    2
            );

            Department neurology = new Department(
                    "Neurology",
                    new Doctor[]{d3},
                    3
            );

            Patient p1 = new Patient("Ahmed", 30, "Cardiology");
            Patient p2 = new Patient("Mona", 25, "Neurology");

            Department[] departments = {cardiology, neurology};

            for (Department dep : departments) {
                if (dep.getName().equals(p1.getDepartmentNeeded())) {
                    Doctor doc = dep.findAvailableDoctor();
                    if (doc != null) {
                        Appointment a1 = new Appointment(p1, doc, "10/10/2026");
                        a1.showDetails();
                        doc.setAvailable(false);
                    }
                }
            }

            for (Department dep : departments) {
                if (dep.getName().equals(p2.getDepartmentNeeded())) {
                    Doctor doc = dep.findAvailableDoctor();
                    if (doc != null) {
                        Appointment a2 = new Appointment(p2, doc, "11/10/2026");
                        a2.showDetails();
                    }
                }
            }
        }
    }
