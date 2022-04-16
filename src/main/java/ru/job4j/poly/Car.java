package ru.job4j.poly;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("drive");
    }

    @Override
    public double repair() {
        return 100;
    }
}
