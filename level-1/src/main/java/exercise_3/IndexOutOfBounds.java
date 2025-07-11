package exercise_3;

public class IndexOutOfBounds {

    public static char getCharByIndex(char[] charArray, int index) {
        if (index < 0 || index >= charArray.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        return charArray[index];
    }
}
