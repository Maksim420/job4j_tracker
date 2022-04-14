package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String permit;

    public Builder(String name, String surname, String level, String permit) {
        super(name, surname, level);
        this.permit = permit;
    }

    public  Builder(String permit) {
        this.permit = permit;
    }

    public Builder() {

    }

    public String getPermit() {
        return permit;
    }

    public Building build(Design design) {
        return new Building();
    }
}
