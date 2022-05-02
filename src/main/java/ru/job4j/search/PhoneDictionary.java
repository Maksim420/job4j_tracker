package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> res = new ArrayList<>();
        for (Person person : this.persons) {
            if (person.getAddress().contains(key) || person.getPhone().contains(key)
                || person.getSurname().contains(key) || person.getName().contains(key)) {
                res.add(person);
            }
        }
        return res;
    }

}
