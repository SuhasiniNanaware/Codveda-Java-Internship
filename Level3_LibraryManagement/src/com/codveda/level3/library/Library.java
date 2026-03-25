package com.codveda.level3.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // View Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Library Books ---");

        for (Book b : books) {
            b.displayBook();
        }
    }

    // Borrow Book
    public void borrowBook(int id) {

        for (Book b : books) {

            if (b.getId() == id) {

                if (!b.isBorrowed()) {
                    b.borrowBook();
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book already borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return Book
    public void returnBook(int id) {

        for (Book b : books) {

            if (b.getId() == id) {

                if (b.isBorrowed()) {
                    b.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }
}