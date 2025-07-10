package exercise_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookCollectionTest {

    private BookCollection bookCollection;
    private List<Book> bookList;
    private final String[] bookTitles = new String[]{"The mysteries of Udolpho", "Northanger Abbey", "Macbeth"};
    private final String bookTitle = "A first book on an alphabetical list";

    @BeforeEach
    void setUp() {
        bookCollection = new BookCollection();
        bookList = bookCollection.getBookList();

    }

    @Test
    public void BookCollection_NotNull_AfterInstantiation() {
        assertNotNull(bookCollection);
    }

    @Test
    public void addBook_correctSize_withoutIndex() {
        int expectedSize = 1;

        bookCollection.addBook(bookTitle);

        assertEquals(1, (bookList.size()));
    }

    @Test
    public void addBooks_correctSize() {
        bookCollection.addBooks(bookTitles);

        assertEquals(bookTitles.length, bookList.size());
    }

    @Test
    public void addBook_correctIndex() {
        int index = 0;

        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitle, index);

        assertEquals(index, bookList.indexOf(new Book(bookTitle)));
    }


    @Test
    public void addBook_duplicatesNotAllowed() {
        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitles[1]);

        assertEquals(bookTitles.length, bookList.size());
    }

    @Test
    public void getBookTitle_returnsCorrectTitle_GivenIndex() {
        int index = 0;

        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitle);
        String returnedTitle = bookCollection.getBookTitle(index);

        assertEquals(bookTitle, returnedTitle);

    }

    @Test
    public void removeBook_reducesListSize() {
        String bookToRemove = "Macbeth";

        bookCollection.addBooks(bookTitles);
        bookCollection.removeBook(bookToRemove);

        assertEquals(bookTitles.length - 1, bookList.size());
    }

    @Test
    public void bookCollection_isSorted_afterAddingBook() {
        bookCollection.addBooks(bookTitles);
        bookCollection.addBook(bookTitle);

        int titleComparison = 1;
        for (int i = 1; i < bookList.size() && titleComparison > 0; i++) {
            titleComparison = bookList.get(i).getTitle().compareTo(
                    bookList.get(i - 1).getTitle());
        }

        assertTrue(titleComparison > 0);

    }

    @Test
    public void bookCollection_isSorted_afterRemovingBook() {
        String bookToRemove = "Macbeth";
        bookCollection.addBooks(bookTitles);
        bookCollection.removeBook(bookToRemove);

        int titleComparison = 1;
        for (int i = 1; i < bookList.size() && titleComparison > 0; i++) {
            titleComparison = bookList.get(i).getTitle().compareTo(
                    bookList.get(i - 1).getTitle());
        }

        assertTrue(titleComparison > 0);

    }

}
