package exercise_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class IndexOutOfBoundsTest {

    @ParameterizedTest
    @ValueSource(ints = {-34, -1, 4, 10, 1345})
    void when_invalidIndex_then_throwArrayIndexOutOfBoundsException(int index) {
        char[] testArray = {'a', 'b', 'c', 'd'};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            IndexOutOfBounds.getCharByIndex(testArray, index);
        });
    }
}
