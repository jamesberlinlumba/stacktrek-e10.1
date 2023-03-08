package Database;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<Integer, String> books = new HashMap<Integer, String>();
    private static Book instance;
    private Book() {}
    public static synchronized Book getInstance() {
        if (instance == null) {
            instance = new Book();
        }

        return instance;
    }

    public Map viewBooks() {
        return books;
    }
    public void addBook(String bookName) {
        if (!books.containsValue(bookName)) {
            books.put(books.hashCode(), bookName);
        }
    }

    public void removeBook(int bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
        }
    }

    public void removeBook(String bookName) {
        if (books.containsValue(bookName)) {
            for (Map.Entry item : books.entrySet()) {
                if (item.getValue().equals(bookName)) {
                    books.remove(item.getKey());
                }
            }
        }
    }
}
