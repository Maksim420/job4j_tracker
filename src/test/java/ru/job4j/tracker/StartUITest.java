package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input input = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(new ConsoleOutput()),
                new ExitAction()
        };
        new StartUI(new ConsoleOutput()).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        String newName = "New name";
        Input input = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), newName, "1"}
        );
        UserAction[] actions = {
                new EditAction(new ConsoleOutput()),
                new ExitAction()
        };
        new StartUI(new ConsoleOutput()).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(newName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        Input input = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(new ConsoleOutput()),
                new ExitAction()
        };
        new StartUI(new ConsoleOutput()).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}