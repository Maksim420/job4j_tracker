package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predName = person -> person.getName().contains(key);
        Predicate<Person> predPhone = person -> person.getPhone().contains(key);
        Predicate<Person> predSurname = person -> person.getSurname().contains(key);
        Predicate<Person> predAdress = person -> person.getAddress().contains(key);
        Predicate<Person> combine = predName.or(predPhone).or(predSurname).or(predAdress);
        ArrayList<Person> res = new ArrayList<>();
        for (Person person : this.persons) {
            if (combine.test(person)) {
                res.add(person);
            }
        }
        return res;
    }
}
