package exercise_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookCollectionManagerTest {

    private BookCollectionManager bookCollectionManager;

    @BeforeEach
    void setUp() {
        bookCollectionManager = new BookCollectionManager();
    }

    @Test
    public void BookCollectionTest() {
        assertNotNull(bookCollectionManager);
    }

    @Test
    public void addBook_withoutIndex() {
        String[] bookTitles = {"The mysteries of Udolpho", "Northanger Abbey", "Macbeth"};
        for (String title : bookTitles) {
            bookCollectionManager.addBook(new Book(title));
        }
        List<Book> bookCollection = bookCollectionManager.getBookCollection();

        assertEquals((bookCollection.size()), bookTitles.length);
    }

}
