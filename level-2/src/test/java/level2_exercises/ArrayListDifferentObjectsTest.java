package level2_exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListDifferentObjectsTest {
    private List<Object> list;
    private final String testString = "a test String";
    private final Person testPerson = new Person("Catherine Tilney", 31, "green");
    private final int[] testArray = new int[]{1, 2, 3};
    private final Character testCharacter = 'a';

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        list.add(testString);
        list.add(testPerson);
        list.add(testArray);
    }


    @Test
    void when_addingObjectsToList_then_ListContainsObjects() {
        list.add(testCharacter);
        assertThat(list).contains(testString, testArray, testPerson, testCharacter);
    }

    @Test
    void when_addingObjectsToList_then_objectsInInsertionOrder() {
        list.add(testCharacter);
        assertThat(list).containsExactly(testString, testPerson, testArray, testCharacter);
    }

    @Test
    void when_addingObjectsToList_then_objectAddedOnlyOnce() {
        list.add(testCharacter);
        assertThat(list).containsOnlyOnce(testString);
    }

    @Test
    void when_objectNotAdded_then_objectNotInList() {
        assertThat(list).doesNotContain(testCharacter);
    }
}
