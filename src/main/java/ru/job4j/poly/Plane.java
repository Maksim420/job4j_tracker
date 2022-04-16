package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("fly");
    }

    @Override
    public double repair() {
        return 100000;
    }
}
