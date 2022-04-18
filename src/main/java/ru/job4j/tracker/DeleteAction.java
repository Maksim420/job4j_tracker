package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.println("Item has been deleted.");
        } else {
            System.out.println("Error. Item has not been deleted.");
        }
        return true;
    }
}
