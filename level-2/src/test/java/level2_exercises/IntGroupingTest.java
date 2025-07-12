package level2_exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

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
        assertThat(duplicateGrouping).isEqualTo(testGrouping);
    }

    @Test
    void when_creatingGroupingCopy_then_copyHasDifferentReference() {
        int baseNumber = 2;
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        IntGrouping copyGrouping = testGrouping.createCopy();
        assertThat(copyGrouping).isNotEqualTo(testGrouping);
    }

    @Test
    void when_instantiating_then_EqualArraysCreated() {
        int baseNumber = 2;
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        assertThat(testGrouping.getNumberArray()).isEqualTo(testGrouping.getDuplicateArray());
    }
}
