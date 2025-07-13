package level2_exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PersonTest {

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
