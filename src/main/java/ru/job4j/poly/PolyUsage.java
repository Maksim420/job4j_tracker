package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle[] vehicles = {car, train, plane};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            System.out.println(vehicle.repair());
        }
    }
}
