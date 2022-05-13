package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int res;
        String leftTopDep = left.split("/")[0];
        String rightTopDep = right.split("/")[0];
        if (leftTopDep.equals(rightTopDep)) {
            res = left.replaceFirst(leftTopDep, "").compareTo(
                    right.replaceFirst(rightTopDep, "")
            );
        } else {
            res = rightTopDep.compareTo(leftTopDep);
        }
        return res;
    }
}
