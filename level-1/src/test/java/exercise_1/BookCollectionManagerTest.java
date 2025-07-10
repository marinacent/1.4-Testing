package exercise_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookCollectionManagerTest {

    private BookCollectionManager bookCollectionManager;
    private final String[] bookTitles = new String[] {"The mysteries of Udolpho", "Northanger Abbey", "Macbeth"};

    @BeforeEach
    void setUp() {
        bookCollectionManager = new BookCollectionManager();
    }

    @Test
    public void BookCollection_NotNull_AfterInstantiation() {
        assertNotNull(bookCollectionManager);
    }

    @Test
    public void addBook_correctSize_withoutIndex() {
        for (String title : bookTitles) {
            bookCollectionManager.addBook(title);
        }
        List<Book> bookCollection = bookCollectionManager.getBookCollection();

        assertEquals(bookTitles.length, (bookCollection.size()));
    }

    @Test
    public void addBook_correctIndex() {
        String bookTitle = "Hamlet";
        int index = 2;

        for (String title : bookTitles) {
            bookCollectionManager.addBook(title);
        }
        bookCollectionManager.addBook(bookTitle, index);
        List<Book> bookCollection = bookCollectionManager.getBookCollection();

        assertEquals(index, bookCollection.indexOf(new Book(bookTitle)));
    }

}
