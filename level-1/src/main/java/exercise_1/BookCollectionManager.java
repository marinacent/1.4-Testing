package exercise_1;

import java.util.*;

public class BookCollectionManager {
    private final List<Book> bookCollection;

    public BookCollectionManager() {
        this.bookCollection = new ArrayList<Book>();
    }

    public List<Book> getBookCollection() {
        return bookCollection;
    }

    public void addBook(String bookTitle) {
        Book book = new Book(bookTitle);
        if (!bookCollection.contains(book)) {
            bookCollection.add(book);
            bookCollection.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        }
    }

    public void addBook(String bookTitle, int index) {
        Book book = new Book(bookTitle);
        if (!bookCollection.contains(book)) {
            bookCollection.add(index, book);
            bookCollection.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        }
    }

    public void addBooks(String[] bookTitles) {
        for (String title : bookTitles) {
            addBook(title);
        }
    }

    public String getBookTitle(int index) {
        Book book = bookCollection.get(index);
        return book.getTitle();
    }

    public void removeBook(String bookTitle) {
        bookCollection.remove(new Book(bookTitle));
    }
}
