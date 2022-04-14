package ru.job4j.inheritance;

public class Profession {

    private String name;
    private String surname;

   public Profession(String name, String surname) {
       this.name = name;
       this.surname = surname;
   }

   public Profession() {

   }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
