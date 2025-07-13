package level2_exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class IntTest {

    @Test
    void when_twoIntsWithSameValue_then_IntsAreEqual() {
        int a = 1;
        int b = 1;
        assertThat(a).isEqualTo(b);
    }

    @Test
    void when_twoIntsWithDifferentValue_then_IntsAreNotEqual() {
        int a = 1;
        int b = 2;
        assertThat(a).isNotEqualTo(b);
    }

    @Test
    void when_intArraysWithSameValues_then_intArraysAreEqual() {
        int[] originalArray = {1, 2, 3, 4};
        int[] copyArray = {1, 2, 3, 4};
        assertThat(originalArray).isEqualTo(copyArray);
    }
}
