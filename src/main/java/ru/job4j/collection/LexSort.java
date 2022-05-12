package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftNum = left.split(". ", 2);
        String[] rightNum = right.split(". ", 2);
        return Integer.compare(Integer.parseInt(leftNum[0]),
                Integer.parseInt(rightNum[0]));
    }
}
