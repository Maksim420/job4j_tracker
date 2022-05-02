package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> res = new ArrayList<>();
        for (int[] arr : list) {
            for (int num : arr) {
                res.add(num);
            }
        }
        return res;
    }
}
