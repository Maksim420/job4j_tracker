package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean pediatric;

    public Dentist(String name, String surname, String degree, boolean pediatric) {
        super(name, surname, degree);
        this.pediatric = pediatric;
    }

    public boolean isPediatric() {
        return pediatric;
    }

    public Diagnosis checkTeeth(Patient patient) {
        return new Diagnosis("p1", "Caries");
    }
}
