package level2_exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class IntGroupingTest {

    @ParameterizedTest
    @ValueSource(ints = {-34, 0, 3, 4, 22})
    void when_instantiating_then_EqualAndNotEqualNumbersCreated(int baseNumber) {
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        assertThat(testGrouping.getBaseNumber()).isEqualTo(testGrouping.getDuplicate())
                .isNotEqualTo(testGrouping.getDifferentNumber());
    }

    @Test
    void when_creatingDuplicateIntGrouping_then_duplicateHasTheSameReference() {
        int baseNumber = 2;
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        IntGrouping duplicateGrouping = testGrouping.createDuplicateGrouping();
        assertThat(duplicateGrouping).isSameAs(testGrouping);
    }

    @Test
    void when_creatingGroupingCopy_then_copyHasDifferentReference() {
        int baseNumber = 2;
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        IntGrouping copyGrouping = testGrouping.createCopy();
        assertThat(copyGrouping).isNotSameAs(testGrouping);
    }

    @Test
    void when_instantiating_then_EqualArraysCreated() {
        int baseNumber = 2;
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        assertThat(testGrouping.getNumberArray()).isEqualTo(testGrouping.getDuplicateArray());
    }

    @Test
    void when_NegativeIndexInGetNumber_then_throwException() {
        int baseNumber = 2;
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        int negativeIndex = -3;
        assertThatThrownBy(() -> {
            testGrouping.getNumber(negativeIndex);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }

    @Test
    void when_IndexTooLargeInGetNumber_then_throwException() {
        int baseNumber = 2;
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        int largeIndex = 3;
        assertThatThrownBy(() -> {
            testGrouping.getNumber(largeIndex);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
