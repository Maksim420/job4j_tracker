package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String specialization;

    public Surgeon(String name, String surname, String degree, String spec) {
        super(name, surname, degree);
        this.specialization = spec;
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean operate(Patient patient) {
        return true;
    }
}
