package level2_exercises;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringMap {
    private final Map<String,String> map;

    public StringMap() {
        this.map = new HashMap<>();
    }

    public Map<String, String> getMap() {
        return Collections.unmodifiableMap(map);
    }

    public void addElement(String key, String value) {
        map.put(key, value);
    }
}
