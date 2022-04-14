package ru.job4j.inheritance;

public class Diagnosis {

    private String code;
    private String description;

    public Diagnosis(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public Diagnosis() {

    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
