package level2_exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectTest {

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
}
