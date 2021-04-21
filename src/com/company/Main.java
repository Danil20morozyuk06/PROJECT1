package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Scanner s = new Scanner(System.in);
        System.out.println("Здраствйте,что вас интересует?");
        String command = s.nextLine();
        if (command.equals("Здраствуйте,можно взять книгу?")) {
            for (int c = 0; c < library.books.length; c++) {
                System.out.println(library.books[c].getName() + "  ID:" + library.books[c].getID());
            }
            library.getBook();
        }
        System.out.println();
    }
}


