package exercise_2;

import java.util.Map;

import static java.util.Map.entry;

public class ComputeDni {
    private static final Map<Integer, Character> REMAINDER_TO_LETTER = Map.ofEntries(
            entry(0, 'T'), entry(1, 'R'), entry(2, 'W'),
            entry(3, 'A'), entry(4, 'G'), entry(5, 'M'),
            entry(6, 'Y'), entry(7, 'F'), entry(8, 'P'),
            entry(9, 'D'), entry(10, 'X'), entry(11, 'B'),
            entry(12, 'N'), entry(13, 'J'), entry(14, 'Z'),
            entry(15, 'S'), entry(16, 'Q'), entry(17, 'V'),
            entry(18, 'H'), entry(19, 'L'), entry(20, 'C'),
            entry(21, 'K'), entry(22, 'E')

    );

    public static char computeLetter(int number) {
        if (number < 1 || number >= 100000000) {
            throw new IllegalArgumentException("DNI number must be between 1 and 99999999");
        }
        int remainder = number % 23;
        return REMAINDER_TO_LETTER.get(remainder);
    }
}
