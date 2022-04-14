package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean pediatric;

    public Dentist(String name, String surname, String degree, boolean pediatric) {
        super(name, surname, degree);
        this.pediatric = pediatric;
    }

    public Dentist(boolean pediatric) {
        this.pediatric = pediatric;
    }

    public Dentist() {

    }

    public boolean isPediatric() {
        return pediatric;
    }

    public Diagnosis checkTeeth(Patient patient) {
        return new Diagnosis();
    }
}
