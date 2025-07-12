package level2_exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringMapTest {

    @Test
    void when_addingElementToMap_then_keyInMap () {
        String key = "key";
        String value = "value";
        StringMap testMap = new StringMap();
        testMap.addElement(key, value);
        assertThat(testMap.getMap().keySet()).contains(key);
    }
}
