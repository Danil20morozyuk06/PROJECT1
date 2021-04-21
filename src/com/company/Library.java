package com.company;

import java.util.Scanner;

public class Library {
    Book book;

    static Book b = new Book("Книга жалоб и предложений", "Администрация");
    static Book b1 = new Book("Гарри Поттер", "Джоан Роулинг");
    static Book b2 = new Book("Геометрия", "Мерзляк");
    static Book b3 = new Book("Джава для чайников", "Назар");
    static Book b4 = new Book("Как держаться на позитиве", "Иванна");
    static Book b5 = new Book("Кто прочитает,тот Назар", "Царь Даниил II");
    static Book b6 = new Book("Как править страной", "Баба Зина");
    static Book b7 = new Book("Как править страной", "Баба Галя");

    static Book[] books = {b, b1, b2, b3, b4, b5, b6, b7};

    public static void getBook() {

        int o = 0;
        while (o <= 0) {
            Scanner s = new Scanner(System.in);
            System.out.println("говорите,если хотите какую-нибудь книгу");
            String string = s.nextLine();
            for (int a = 0; a < books.length; a++) {
                if (string.equals(books[a].getName())) {
                    System.out.println(books[a].toString());
                }
                String stringID = "" + books[a].getID();
                if (string.equals(stringID)) {
                    System.out.println(books[a].toString());
                }
            }
            if (string.equals("нет,спасибо")) {
                System.out.println("приходите еще \uD83D\uDE07");
                o++;
            }
        }
    }
}
