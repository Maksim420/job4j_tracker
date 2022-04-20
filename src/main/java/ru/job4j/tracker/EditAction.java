package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Replace item ===");
        int id = input.askInt("Enter current item id: ");
        String name = input.askStr("Enter name of new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Item has been replaced.");
        } else {
            out.println("Error. Item has not been replaced.");
        }
        return true;
    }
}
