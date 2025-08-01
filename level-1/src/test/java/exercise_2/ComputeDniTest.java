package exercise_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ComputeDniTest {

    @ParameterizedTest
    @CsvSource({
            "87654321,X",
            "43218765,V",
            "56789012,B",
            "34567890,V",
            "78901234,X",
            "21098765,Z",
            "12345678,Z",
            "78714688,V",
            "77529779,E",
            "91142657,M"
    })
    void when_givenDniNumber_then_computeCorrectLetter(String number, String letter) {
        int intNumber = Integer.parseInt(number);
        char expectedLetter = letter.trim().charAt(0);
        char actualLetter = ComputeDni.computeLetter(intNumber);
        assertEquals(expectedLetter, actualLetter);
    }

    @ParameterizedTest
    @ValueSource(ints = {-3, 0, 111111111})
    void when_givenIllegalInteger_then_throwIllegalArgumentException(int number) {
        assertThrows(IllegalArgumentException.class, () -> {
            ComputeDni.computeLetter(number);
        });
    }

}
