package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan");
        student.setGroup("b-12");
        student.setEntryDate(new Date());
        System.out.println(
                student.getFullName() + " " + student.getGroup() + " " + student.getEntryDate());
    }
}
