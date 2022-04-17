package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        String answer = switch (new Random().nextInt(3)) {
            case (1) -> "Да";
            case (2) -> "Нет";
            default -> "Может быть";
        };
        System.out.println(answer);
    }
}
