package level2_exercises;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptyOptionalTest {

    @Test
    void when_creatingEmptyOptional_then_emptyOptionalCreated() {
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }
}
