package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void whenDescByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Second"));
        items.add(new Item("Third"));
        items.add(new Item("First"));
        items.sort(new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("Third"));
        expected.add(new Item("Second"));
        expected.add(new Item("First"));
        assertThat(items, is(expected));
    }
}