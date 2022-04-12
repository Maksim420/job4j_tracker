package ru.job4j.oop;

public class Student {

    public void Music() {
        System.out.println("tra ta ta");
    }

    public void Song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.Music();
        petya.Music();
        petya.Music();
        petya.Song();
        petya.Song();
        petya.Song();
    }
}
