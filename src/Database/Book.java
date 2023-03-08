package Database;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<Integer, String> books = new HashMap<>();
    private static Book instance;
    private Book() {}
    public static synchronized Book getInstance() {
        if (instance == null) {
            instance = new Book();
        }

        return instance;
    }

    public Map<Integer, String> viewBooks() {
        return books;
    }
    public void addBook(String bookName) {
        if (!books.containsValue(bookName)) {
            books.put(bookName.hashCode(), bookName);
        }
    }

    public void removeBook(int bookId) {
        books.remove(bookId);
    }

    public void removeBook(String bookName) {
        if (books.containsValue(bookName)) {
            for (Map.Entry<Integer, String> item : books.entrySet()) {
                if (item.getValue().equals(bookName)) {
                    books.remove(item.getKey());
                }
            }
        }
    }
}
