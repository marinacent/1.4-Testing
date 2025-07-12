package level2_exercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDifferentObjects {
    private final List<Object> list;

    public ArrayListDifferentObjects() {
        this.list = new ArrayList<>();
    }

    public List<Object> getList() {
        return list;
    }

    public void addObjects(Object... objects) {
        for (Object object : objects) {
            list.add(object);
        }
    }
}
