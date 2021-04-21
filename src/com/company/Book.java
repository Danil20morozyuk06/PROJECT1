package com.company;

public class Book {
    private String name;
    private String author;
    private int ID;
    static int nextID = 0;
    @Override
    public String toString() {
        return "вот ваша книга " + name + " автор которой " + author + ".";
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.ID = nextID++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
