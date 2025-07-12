package level2_exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ListManagerTest {

    @Test
    void when_addingObjectsToArrayList_then_objectsInInsertionOrder() {
        ListManager listManager = new ListManager();
        IntGrouping firstIntGrouping = new IntGrouping(1);
        IntGrouping secondIntGrouping = new IntGrouping(2);
        IntGrouping thirdIntGrouping = new IntGrouping(3);
        listManager.addIntGrouping(firstIntGrouping, secondIntGrouping, thirdIntGrouping);
        assertThat(listManager.getIntGroupingList()).containsExactly(
                firstIntGrouping, secondIntGrouping, thirdIntGrouping
        );

    }
}
