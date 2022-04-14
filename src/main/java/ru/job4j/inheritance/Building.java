package ru.job4j.inheritance;

public class Building {

    private byte floor;
    private boolean pool;

    public Building(byte floor, boolean pool) {
        this.floor = floor;
        this.pool = pool;
    }

    public boolean isPool() {
        return pool;
    }

    public byte getFloor() {
        return floor;
    }
}
