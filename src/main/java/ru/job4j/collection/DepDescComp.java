package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String leftTopDep = left.split("/")[0];
        String rightTopDep = right.split("/")[0];
        int res = rightTopDep.compareTo(leftTopDep);
        return res != 0 ? res : left.compareTo(right);
    }
}
