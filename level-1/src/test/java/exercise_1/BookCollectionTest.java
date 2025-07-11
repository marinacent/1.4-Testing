package exercise_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookCollectionTest {

    private BookCollection bookCollection;
    private final String[] bookTitles = new String[]{"The mysteries of Udolpho", "Northanger Abbey", "Macbeth"};
    private final String bookTitle = "A first book on an alphabetical list";

    @BeforeEach
    void setUp() {
        bookCollection = new BookCollection();
    }

    @Test
    void when_instantiated_then_bookCollectionIsNotNull() {
        assertNotNull(bookCollection);
    }

    @Test
    void when_addBookWithoutIndex_then_sizeIncreasesByOne() {
        int expectedSize = 1;

        bookCollection.addBook(bookTitle);

        assertEquals(expectedSize, (bookCollection.size()));
    }

    @Test
    void when_addBookWithIndex_then_sizeIncreasesByOne() {
        int expectedSize = 1;

        bookCollection.addBook(bookTitle, 0);

        assertEquals(expectedSize, (bookCollection.size()));
    }

    @Test
    void when_addBooksArray_then_sizeIncreaseMatchesArrayLength() {
        bookCollection.addBooks(bookTitles);

        assertEquals(bookTitles.length, bookCollection.size());
    }

    @Test
    void when_addBookWithoutIndex_then_bookIsInList() {
        bookCollection.addBook(bookTitle);
        assertTrue(bookCollection.containsBook(bookTitle));
    }

    @Test
    void when_addBookWithIndex_then_bookIsInList() {
        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitle, 2);
        assertTrue(bookCollection.containsBook(bookTitle));
    }

    @Test
    void when_addBooksArray_then_eachBookIsInList() {
        bookCollection.addBooks(bookTitles);
        for (String title : bookTitles) {
            assertTrue(bookCollection.containsBook(title));
        }
    }

    @Test
    void when_addBookWithIndex_then_bookIsInsertedAtCorrectPosition() {
        int index = 0;

        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitle, index);

        assertEquals(index, bookCollection.indexOf(bookTitle));
    }


    @Test
    void when_addDuplicateBook_then_duplicateIsNotAdded() {
        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitles[1]);

        assertEquals(bookTitles.length, bookCollection.size());
    }

    @Test
    void when_getBookTitleByIndex_then_correctTitleIsReturned() {
        int index = 0;

        bookCollection.addBooks(bookTitles);
        String returnedTitle = bookCollection.getBookTitle(index);

        assertEquals(bookTitles[index], returnedTitle);

    }

    @Test
    void when_removeBook_then_sizeDecreasesByOne() {
        String bookToRemove = "Macbeth";

        bookCollection.addBooks(bookTitles);
        bookCollection.removeBook(bookToRemove);

        assertEquals(bookTitles.length - 1, bookCollection.size());
    }

    @Test
    void when_removeNonExistingBook_then_sizeDoesNotChange() {
        bookCollection.addBooks(bookTitles);
        bookCollection.removeBook("Nonexistent Book");
        assertEquals(bookTitles.length, bookCollection.size());
    }

    private void assertListIsSortedAlphabetically() {
        int titleComparison = 1;
        for (int i = 1; i < bookCollection.size() && titleComparison > 0; i++) {
            titleComparison = bookCollection.get(i).getTitle().compareTo(
                    bookCollection.get(i - 1).getTitle());
        }
        assertTrue(titleComparison > 0);
    }

    @Test
    void when_addBookAndSort_then_listIsSorted() {
        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitle);
        bookCollection.sortBooks();

        assertListIsSortedAlphabetically();

    }

    @Test
    void when_removeBookAndSort_then_listIsSorted() {
        String bookToRemove = "Macbeth";
        bookCollection.addBooks(bookTitles);
        bookCollection.removeBook(bookToRemove);
        bookCollection.sortBooks();

        assertListIsSortedAlphabetically();

    }

}
