package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Replace item ===");
        int id = input.askInt("Enter current item id: ");
        String name = input.askStr("Enter name of new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item has been replaced.");
        } else {
            System.out.println("Error. Item has not been replaced.");
        }
        return true;
    }
}
