package ru.job4j.collection;

import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int rows = (int) Math.ceil((double) list.size() / cells);
        int[][] res = new int[rows][cells];
        int row = 0, cell = 0;
        for (Integer el : list) {
            res[row][cell] = el;
            cell++;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return res;
    }
}
