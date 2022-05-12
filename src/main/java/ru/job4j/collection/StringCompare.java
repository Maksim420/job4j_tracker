package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int lenLeft = left.length(), lenRight = right.length();
        int length = Math.min(lenLeft, lenRight);
        for (int i = 0; i < length; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            rsl = Integer.compare(lenLeft, lenRight);
        }
        return rsl;
    }
}
