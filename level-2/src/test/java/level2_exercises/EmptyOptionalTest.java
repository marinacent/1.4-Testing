package level2_exercises;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptyOptionalTest {

    @Test
    void when_getEmptyOptional_then_emptyOptionalReturned() {
        Optional<String> optional = EmptyOptional.getEmptyOptional();
        assertThat(optional).isEmpty();
    }
}
