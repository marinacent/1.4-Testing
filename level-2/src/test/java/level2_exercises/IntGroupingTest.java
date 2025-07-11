package level2_exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class IntGroupingTest {

    @ParameterizedTest
    @ValueSource(ints = {-34, 0, 22})
    void when_instantiating_then_EqualAndNotEqualNumbersCreated(int baseNumber) {
        IntGrouping testGrouping = new IntGrouping(baseNumber);
        assertThat(testGrouping.getBaseNumber()).isEqualTo(testGrouping.getDuplicate())
                .isNotEqualTo(testGrouping.getDifferentNumber);
    }
}
