package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when12to34then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double rsl = a.distance(b);
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when00to11then1dot41() {
        double expected = 1.41;
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double rsl = a.distance(b);
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when111to333then3dot464() {
        double expected = 3.464;
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 3, 3);
        double rsl = a.distance3d(b);
        assertEquals(expected, rsl, 0.001);
    }

    @Test
    public void when123to456then5dot196() {
        double expected = 5.196;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double rsl = a.distance3d(b);
        assertEquals(expected, rsl, 0.001);
    }
}