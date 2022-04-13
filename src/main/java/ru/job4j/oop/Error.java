package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void show() {
        System.out.println("active " + this.active);
        System.out.println("status " + this.status);
        System.out.println("message " + this.message);
    }

    public static void main(String[] args) {
        Error er1 = new Error();
        Error er2 = new Error(true, 1, "Critical error");
        Error er3 = new Error(false, 2, "Fatal error");
        er1.show();
        er2.show();
        er3.show();
    }

}
