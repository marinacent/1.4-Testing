package exercise_1;

import java.util.*;

public class BookCollection {
    private final List<Book> bookList;

    public BookCollection() {
        this.bookList = new ArrayList<Book>();
    }

    public void addBook(String bookTitle) {
        Book book = new Book(bookTitle);
        if (!bookList.contains(book)) {
            bookList.add(book);
        }
    }

    public void addBook(String bookTitle, int index) {
        Book book = new Book(bookTitle);
        if (!bookList.contains(book)) {
            bookList.add(index, book);
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
        bookList.remove(new Book(bookTitle));
    }

    public void sortBooks() {
        bookList.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    public int size() {
        return bookList.size();
    }

    public boolean containsBook(String title) {
        return bookList.contains(new Book(title));
    }

    public int indexOf(String title) {
        return bookList.indexOf(new Book(title));
    }

    public Book get(int index) {
        return bookList.get(index);
    }
}
