package ru.job4j.inheritance;

public class Patient {

    private String name;
    private String surname;
    private Diagnosis diagnosis;

    public Patient(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Patient() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }
}
