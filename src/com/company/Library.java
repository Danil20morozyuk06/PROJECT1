package p1;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void printBooks(){
        printBooks(this.books);
    }

    public void printBooks(Book... books){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBook(int id){
        for (Book book : books){
            if(book.getID() == id){
                return book;
            }
        }

        return null;
    }

    public Book[] findBook(String title){
        Book[] result = new Book[books.length];
        int size = 0;
        for (Book book : books){
            if(book.getName().equals(title)){
                result[size++] = book;
            }
        }

        Book[] finalBooks = new Book[size];
        int i = 0;
        for (Book book : result){
            if(book == null){
                break;
            }
            finalBooks[i++] = book;
        }

        return result;
    }
}

