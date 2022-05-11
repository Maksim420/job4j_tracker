package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class ItemAscByNameTest {

    @Test
    public void WhenAscByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Second"));
        items.add(new Item("Third"));
        items.add(new Item("First"));
        items.sort(new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("First"));
        expected.add(new Item("Second"));
        expected.add(new Item("Third"));
        assertThat(items, is(expected));
    }

}