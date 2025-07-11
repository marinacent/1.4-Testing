package exercise_1;

import java.util.*;

public class BookCollection {
    private final List<Book> bookList;
    private final Set<Book> bookSet = new HashSet<>();

    public BookCollection() {
        this.bookList = new ArrayList<Book>();
    }

    public void addBook(String bookTitle) {
        Book book = new Book(bookTitle);
        if (!bookSet.contains(book)) {
            bookList.add(book);
            bookSet.add(book);
        }
    }

    public void addBook(String bookTitle, int index) {
        Book book = new Book(bookTitle);
        if (!bookSet.contains(book)) {
            bookList.add(index, book);
            bookSet.add(book);
        }
    }

    public void addBooks(String[] bookTitles) {
        for (String title : bookTitles) {
            addBook(title);
        }
    }

    public String getBookTitle(int index) {
        Book book = bookList.get(index);
        return book.getTitle();
    }

    public void removeBook(String bookTitle) {
        Book book = new Book(bookTitle);
        if (bookSet.remove(book)) {
            bookList.remove(book);
        }
    }

    public void sortBooks() {
        bookList.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    public int size() {
        return bookList.size();
    }

    public boolean containsBook(String title) {
        return bookSet.contains(new Book(title));
    }

    public int indexOf(String title) {
        return bookList.indexOf(new Book(title));
    }

    public Book get(int index) {
        return bookList.get(index);
    }
}
