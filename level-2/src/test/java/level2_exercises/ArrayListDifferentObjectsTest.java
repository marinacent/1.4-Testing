package level2_exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListDifferentObjectsTest {

    @Test
    void when_addingObjectsToArrayList_then_objectsInInsertionOrder() {
        ArrayListDifferentObjects list = new ArrayListDifferentObjects();
        String testString = "a test String";
        IntGrouping testIntGrouping = new IntGrouping(0);
        int[] testArray = new int[]{1, 2, 3};
        Character testCharacter = 'a';
        list.addObjects(testString, testIntGrouping);
        list.addObjects(testArray, testCharacter);
        assertThat(list.getList()).containsExactly(testString, testIntGrouping, testArray, testCharacter);
    }
}
