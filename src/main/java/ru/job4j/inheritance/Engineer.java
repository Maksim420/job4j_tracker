package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String level;

    public Engineer(String name, String surname, String level) {
        super(name, surname);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public Design design(String type) {
        return new Design();
    }

}
