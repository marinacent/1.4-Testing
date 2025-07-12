package level2_exercises;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    private final ArrayList<IntGrouping> intGroupingList;

    public ListManager() {
        this.intGroupingList = new ArrayList<>();
    }

    public ArrayList<IntGrouping> getIntGroupingList() {
        return intGroupingList;
    }

    public void addIntGrouping(IntGrouping... intGroupings) {
        for (IntGrouping intGrouping : intGroupings) {
            intGroupingList.add(intGrouping);
        }
    }
}
