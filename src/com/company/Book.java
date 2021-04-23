package p1;

public class Book {
    private String name;
    private String author;
    private int ID;
    static int nextID = 0;

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

    @Override
    public String toString() {
        return "ID: " + ID + " Name: '" + name + "' Author: " + author + ".";
    }
}

