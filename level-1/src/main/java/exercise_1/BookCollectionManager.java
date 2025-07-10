package exercise_1;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {
    private final List<Book> bookCollection;

    public BookCollectionManager() {
        this.bookCollection = new ArrayList<Book>();
    }

    public List<Book> getBookCollection() {
        return bookCollection;
    }

    public void addBook(Book book) {
        bookCollection.add(book);
    }

    public void addBook(Book book, int index) {
        bookCollection.add(index, book);
    }

    public String getBookTitle(int index) {
        Book book = bookCollection.get(index);
        return book.getTitle();
    }

    public void removeBook(String bookTitle) {
        bookCollection.remove(new Book(bookTitle));
    }
}
