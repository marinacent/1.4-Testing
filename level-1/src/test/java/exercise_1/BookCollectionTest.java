package exercise_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookCollectionTest {

    @Test
    public void BookCollectionTest() {
        BookCollection bookCollection = new BookCollection();
        assertNotNull(bookCollection);
    }

    

}
