package level2_exercises;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StringMapTest {

    @Test
    void when_addingElementToMap_then_keyInMap () {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("key", "value");
        assertThat(stringMap.keySet()).contains("key");
    }

}
