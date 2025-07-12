package level2_exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArrayListDifferentObjectsTest {
    private ArrayListDifferentObjects list;
    private final String testString = "a test String";
    private final IntGrouping testIntGrouping = new IntGrouping(0);
    private final int[] testArray = new int[]{1, 2, 3};
    private final Character testCharacter = 'a';

    @BeforeEach
    void setUp() {
        list = new ArrayListDifferentObjects();
    }


    @Test
    void when_addingObjectsToList_then_ListContainsObjects() {
        list.addObjects(testString, testIntGrouping);
        list.addObjects(testArray, testCharacter);
        assertThat(list.getObjectlist()).contains(testString, testIntGrouping, testArray, testCharacter);
    }

    @Test
    void when_addingObjectsToList_then_objectsInInsertionOrder() {
        list.addObjects(testString, testIntGrouping);
        list.addObjects(testArray, testCharacter);
        assertThat(list.getObjectlist()).containsExactly(testString, testIntGrouping, testArray, testCharacter);
    }

    @Test
    void when_addingObjectsToList_then_objectAddedOnlyOnce() {
        list.addObjects(testString, testIntGrouping);
        list.addObjects(testArray, testCharacter);
        assertThat(list.getObjectlist()).containsOnlyOnce(testString);
    }

    @Test
    void when_objectNotAdded_then_objectNotInList() {
        list.addObjects(testString, testIntGrouping);
        list.addObjects(testArray);
        assertThat(list.getObjectlist()).doesNotContain(testCharacter);
    }
}
