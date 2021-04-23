package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(createBooks());
        boolean exit = false;
        while(!exit){
            System.out.println("Какую книгу вы хотите?");
            library.printBooks();
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if(answer.matches("[-+]?\\d+")){
                library.printBooks(library.findBook(Integer.parseInt(answer)));
            } else {
                library.printBooks(library.findBook(answer));
            }
        }
    }

    public static Book[] createBooks(){
        Book b = new Book("Книга жалоб и предложений", "Администрация");
        Book b1 = new Book("Гарри Поттер", "Джоан Роулинг");
        Book b2 = new Book("Геометрия", "Мерзляк");
        Book b3 = new Book("Джава для чайников", "Назар");
        Book b4 = new Book("Как держаться на позитиве", "Иванна");
        Book b5 = new Book("Кто прочитает,тот Назар", "Царь Даниил II");
        Book b6 = new Book("Как править страной", "Баба Зина");
        Book b7 = new Book("Как править страной", "Баба Галя");
        return new Book[]{b, b1, b2, b3, b4, b5, b6, b7};
    }
}



