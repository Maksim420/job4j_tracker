package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> words = new HashSet<>();
        words.addAll(Arrays.asList(origin));
        for (String word : duplicate) {
            if (!words.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
