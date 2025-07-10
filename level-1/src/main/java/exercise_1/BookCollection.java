package exercise_1;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private final List<Book> bookCollection;

    public BookCollection() {
        this.bookCollection = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.bookCollection.add(book);
    }
}
