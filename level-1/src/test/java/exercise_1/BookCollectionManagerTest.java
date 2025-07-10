package exercise_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookCollectionManagerTest {

    private BookCollectionManager bookCollectionManager;
    private final String[] bookTitles = new String[] {"The mysteries of Udolpho", "Northanger Abbey", "Macbeth"};
    private List<Book> bookCollection;


    @BeforeEach
    void setUp() {
        bookCollectionManager = new BookCollectionManager();
        bookCollection = bookCollectionManager.getBookCollection();
    }

    @Test
    public void BookCollection_NotNull_AfterInstantiation() {
        assertNotNull(bookCollectionManager);
    }

    @Test
    public void addBook_correctSize_withoutIndex() {
        String bookTitle = "Hamlet";
        int expectedSize = 1;

        bookCollectionManager.addBook(bookTitle);

        assertEquals(1, (bookCollection.size()));
    }

    @Test
    public void addBooks_correctSize() {
        bookCollectionManager.addBooks(bookTitles);

        assertEquals(bookTitles.length, bookCollection.size());
    }

    @Test
    public void addBook_correctIndex() {
        String bookTitle = "Hamlet";
        int index = 2;

        bookCollectionManager.addBooks(bookTitles);
        bookCollectionManager.addBook(bookTitle, index);

        assertEquals(index, bookCollection.indexOf(new Book(bookTitle)));
    }


    @Test
    public void addBook_duplicatesNotAllowed() {
        bookCollectionManager.addBooks(bookTitles);
        bookCollectionManager.addBook(bookTitles[1]);

        assertEquals(bookTitles.length, bookCollection.size());
    }

}
