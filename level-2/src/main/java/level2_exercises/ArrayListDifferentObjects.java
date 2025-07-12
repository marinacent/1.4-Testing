package level2_exercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDifferentObjects {
    private final List<Object> Objectlist;

    public ArrayListDifferentObjects() {
        this.Objectlist = new ArrayList<>();
    }

    public List<Object> getObjectlist() {
        return Objectlist;
    }

    public void addObjects(Object... objects) {
        for (Object object : objects) {
            Objectlist.add(object);
        }
    }
}
