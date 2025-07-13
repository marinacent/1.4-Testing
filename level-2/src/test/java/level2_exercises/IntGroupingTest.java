package level2_exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class IntGroupingTest {

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
    void when_assigningObjectToAnotherObject_then_objectsHaveTheSameReference() {
        Person sophia = new Person("Sophia Garcia", 51, "black");
        Person garcia = sophia;
        assertThat(sophia).isSameAs(garcia);
    }

    @Test
    void when_creatingTwoObjects_then_objectsHaveDifferentReference() {
        Person sophia = new Person("Sophia Garcia", 51, "black");
        Person garcia = new Person("Sophia Garcia", 51, "black");
        assertThat(sophia).isNotSameAs(garcia);
    }

    @Test
    void when_intArraysWithSameValues_then_intArraysAreEqual() {
        int[] originalArray = {1, 2, 3, 4};
        int[] copyArray = {1, 2, 3, 4};
        assertThat(originalArray).isEqualTo(copyArray);
    }

    @Test
    void when_negativeIndex_then_throwException() {
        Person sophia = new Person("Sophia Garcia", 51, "black");
        sophia.addFavoriteComposer("Glass");
        sophia.addFavoriteComposer("Pärt");
        assertThatThrownBy(() -> {
            sophia.printFavoriteComposers(-3);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }

    @Test
    void when_indexTooLarge_then_throwException() {
        Person sophia = new Person("Sophia Garcia", 51, "black");
        sophia.addFavoriteComposer("Glass");
        sophia.addFavoriteComposer("Pärt");
        assertThatThrownBy(() -> {
            sophia.printFavoriteComposers(3);
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }
}
