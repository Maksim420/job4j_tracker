package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance (Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b =  new Point(0, 1);
        System.out.println(a.distance(b));
    }
}
