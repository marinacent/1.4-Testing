package level2_exercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDifferentObjects {
    private final List<Object> objectList;

    public ArrayListDifferentObjects() {
        this.objectList = new ArrayList<>();
    }

    public List<Object> getObjectList() {
        return new ArrayList<>(objectList);
    }

    public void addObjects(Object... objects) {
        for (Object object : objects) {
            objectList.add(object);
        }
    }
}
