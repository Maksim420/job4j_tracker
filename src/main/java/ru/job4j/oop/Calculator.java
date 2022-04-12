package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public double divide(int y) {
        return (double)y / x;
    }

    public double sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(sum(5));
        System.out.println(calc.multiply(5));
        System.out.println(minus(1));
        System.out.println(calc.divide(2));
        System.out.println(calc.sumAllOperation(2));
    }

}
