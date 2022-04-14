package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name, String surname, String level, String language) {
        super(name, surname, level);
        this.language = language;
    }

    public Programmer(String language) {
        this.language = language;
    }

    public Programmer() {

    }

    public String getLanguage() {
        return language;
    }

    public String writeProgram() {
        String program = "";
        return program;
    }
}
