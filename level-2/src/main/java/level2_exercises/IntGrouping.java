package level2_exercises;

public class IntGrouping {
    private final int baseNumber;
    private final int duplicate;
    private final int differentNumber;
    private final int[] numberArray;
    private final int[] duplicateArray;

    public IntGrouping(int baseNumber) {
        this.baseNumber = baseNumber;
        this.duplicate = baseNumber;
        if (baseNumber == 3) {
            this.differentNumber = 4;
        } else {
            this.differentNumber = 3;
        }
        this.numberArray = new int[]{baseNumber, duplicate, differentNumber};
        this.duplicateArray = numberArray;
    }

    public int getBaseNumber() {
        return baseNumber;
    }

    public int getDuplicate() {
        return duplicate;
    }

    public int getDifferentNumber() {
        return differentNumber;
    }

    public int[] getNumberArray() {
        return numberArray;
    }

    public int[] getDuplicateArray() {
        return duplicateArray;
    }

    public IntGrouping createDuplicateGrouping() {
        return this;
    }

    public IntGrouping createCopy() {
        return new IntGrouping(baseNumber);
    }


}
