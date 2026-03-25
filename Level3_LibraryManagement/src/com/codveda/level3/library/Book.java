package com.codveda.level3.library;

public class Book {

    private int id;
    private String title;
    private boolean isBorrowed;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public void displayBook() {
        System.out.println("ID: " + id +
                " | Title: " + title +
                " | Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}