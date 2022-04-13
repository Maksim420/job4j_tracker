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
}