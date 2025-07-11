package exercise_2;

public class ComputeDni {
    private static final String REMAINDER_TO_LETTER = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char computeLetter(int number) {
        if (number < 1 || number >= 100000000) {
            throw new IllegalArgumentException("DNI number must be between 1 and 99999999");
        }
        int remainder = number % 23;
        return REMAINDER_TO_LETTER.charAt(remainder);
    }
}
