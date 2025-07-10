package exercise_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookCollectionManagerTest {

    private BookCollectionManager bookCollectionManager;
    private List<Book> bookCollection;
    private BookCollectionManager populatedBookCollectionManager;
    private List<Book> populatedBookCollection;
    private final String[] bookTitles = new String[]{"The mysteries of Udolpho", "Northanger Abbey", "Macbeth"};
    private final String bookTitle = "A first book on an alphabetical list";

    @BeforeEach
    void setUp() {
        bookCollectionManager = new BookCollectionManager();
        bookCollection = bookCollectionManager.getBookCollection();

        populatedBookCollectionManager = new BookCollectionManager();
        populatedBookCollectionManager.addBooks(bookTitles);
        populatedBookCollection = populatedBookCollectionManager.getBookCollection();

    }

    @Test
    public void BookCollection_NotNull_AfterInstantiation() {
        assertNotNull(bookCollectionManager);
    }

    @Test
    public void addBook_correctSize_withoutIndex() {
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
        int index = 0;

        populatedBookCollectionManager.addBook(bookTitle, index);

        assertEquals(index, populatedBookCollection.indexOf(new Book(bookTitle)));
    }


    @Test
    public void addBook_duplicatesNotAllowed() {
        populatedBookCollectionManager.addBook(bookTitles[1]);

        assertEquals(bookTitles.length, populatedBookCollection.size());
    }

    @Test
    public void getBookTitle_returnsCorrectTitle_GivenIndex() {
        int index = 0;

        populatedBookCollectionManager.addBook(bookTitle);
        String returnedTitle = populatedBookCollectionManager.getBookTitle(index);

        assertEquals(bookTitle, returnedTitle);

    }

    @Test
    public void removeBook_reducesListSize() {
        String bookToRemove = "Macbeth";

        populatedBookCollectionManager.removeBook(bookToRemove);

        assertEquals(bookTitles.length - 1, populatedBookCollection.size());
    }

    @Test
    public void bookCollection_isSorted_afterAddingBook() {
        populatedBookCollectionManager.addBook(bookTitle);

        int titleComparison = 1;
        for (int i = 1; i < populatedBookCollection.size() && titleComparison > 0; i++) {
            titleComparison = populatedBookCollection.get(i).getTitle().compareTo(
                    populatedBookCollection.get(i - 1).getTitle());
        }

        assertTrue(titleComparison > 0);

    }

    @Test
    public void bookCollection_isSorted_afterRemovingBook() {
        String bookToRemove = "Macbeth";
        populatedBookCollectionManager.removeBook(bookToRemove);

        int titleComparison = 1;
        for (int i = 1; i < populatedBookCollection.size() && titleComparison > 0; i++) {
            titleComparison = populatedBookCollection.get(i).getTitle().compareTo(
                    populatedBookCollection.get(i - 1).getTitle());
        }

        assertTrue(titleComparison > 0);

    }

}
