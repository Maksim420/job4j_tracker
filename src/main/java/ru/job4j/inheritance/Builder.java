package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String permit;

    public Builder(String name, String surname, String level, String permit) {
        super(name, surname, level);
        this.permit = permit;
    }

    public String getPermit() {
        return permit;
    }

    public Building build(Design design) {
        return new Building((byte) 3, true);
    }
}
