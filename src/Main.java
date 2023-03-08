import Database.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book book = Book.getInstance();
        book.addBook("book 1");
        book.addBook("book 2");
        book.addBook("book 3");
        System.out.println(book.viewBooks());
        book.removeBook(-1383388997);
        System.out.println(book.viewBooks());
        book.addBook("book 3");
        System.out.println(book.viewBooks());
        book.addBook("book 3");
        System.out.println(book.viewBooks());

        Book libro = Book.getInstance();
        System.out.println("Libro: " + libro.viewBooks());
        libro.removeBook("book 2");
        System.out.println("Libro: " + libro.viewBooks());
    }
}