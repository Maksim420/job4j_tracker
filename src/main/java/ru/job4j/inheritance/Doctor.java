package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String degree;

    public Doctor(String name, String surname, String degree) {
        super(name, surname);
        this.degree = degree;
    }

    public Doctor(String degree) {
        this.degree = degree;
    }

    public Doctor() {

    }

    public String getDegree() {
        return degree;
    }

    public boolean heal(Patient patient) {
        return true;
    }

    public void diagnose(Patient patient, Diagnosis diagnosis) {
        patient.setDiagnosis(diagnosis);
    }

}
