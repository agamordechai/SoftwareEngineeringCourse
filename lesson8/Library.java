package lesson8;

import java.util.HashSet;
import java.util.HashMap;

public class Library {
    private HashSet<Book> availableBooks;
    private HashMap<Book, Reader> rentedBooks;

    public Library() {
        availableBooks = new HashSet<>();
        rentedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }
    public boolean available(Book book) {
        return availableBooks.contains(book);
    }
    public boolean inLibrary(Book book) {
        return availableBooks.contains(book) || rentedBooks.containsKey(book);
    }
    public boolean rentBook(Book book, Reader reader) {
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            rentedBooks.put(book, reader);
            return true;
        }
        return false;
    }
    public boolean returnBook(Book book) {
        if (rentedBooks.containsKey(book)) {
            rentedBooks.remove(book);
            availableBooks.add(book);
            return true;
        }
        return false;
    }
}
