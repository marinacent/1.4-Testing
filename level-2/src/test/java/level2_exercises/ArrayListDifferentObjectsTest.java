package level2_exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListDifferentObjectsTest {
    private ArrayListDifferentObjects list;
    private final String testString = "a test String";
    private final IntGrouping testIntGrouping = new IntGrouping(0);
    private final int[] testArray = new int[]{1, 2, 3};
    private final Character testCharacter = 'a';

    @BeforeEach
    void setUp() {
        ArrayListDifferentObjects list = new ArrayListDifferentObjects();
    }


    @Test
    void when_addingObjectsToList_then_ListContainsObjects() {
        list.addObjects(testString, testIntGrouping);
        list.addObjects(testArray, testCharacter);
        assertThat(list.getList()).contains(testString, testIntGrouping, testArray, testCharacter);
    }

    @Test
    void when_addingObjectsToList_then_objectsInInsertionOrder() {
        list.addObjects(testString, testIntGrouping);
        list.addObjects(testArray, testCharacter);
        assertThat(list.getList()).containsExactly(testString, testIntGrouping, testArray, testCharacter);
    }

    
}
