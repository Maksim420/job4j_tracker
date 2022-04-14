package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Think Java", 500);
        books[1] = new Book("JAVA PRO", 100500);
        books[2] = new Book("Clean Code", 400);
        books[3] = new Book("Java Developer", 100);
        showBooks(books);
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        showBooks(books);
        for (Book book: books) {
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " " + book.getPages());
            }
        }
    }

    public static void showBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " " + book.getPages());
        }
    }
}
