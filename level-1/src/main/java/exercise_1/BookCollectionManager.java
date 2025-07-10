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
        this.bookCollection.add(book);
    }

    public void addBook(Book book, int index) {
        this.bookCollection.add(index, book);
    }

    public String getBookTitle(int index) {
        Book book = this.bookCollection.get(index);
        return book.getTitle();
    }

    public void removeBook(String bookTitle) {
        int bookIndex = this.bookCollection.indexOf()
    }
}
