package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number);
    }

    @Override
    public double fill(int amount) {
        return amount * 50;
    }
}
