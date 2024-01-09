package lang.thegodofjava.Chapter24.study;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkRemove();
    }

    private void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        map.put("A", "1");
        System.out.println(map.get("A"));

    }

    private void checkKeySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");
        Set<String> keySet = map.keySet();
        for (String tempKey : keySet) {
            System.out.println(tempKey + "=" + map.get(tempKey));
        }
    }

    private void checkValues() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");
        Collection<String> values = map.values();
        for (String tempValue : values) {
            System.out.println(tempValue);
        }
    }

    private void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() +"="+tempEntry.getValue());
        }
    }

    private void checkContain() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }

    private void checkRemove() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.remove("A");
        System.out.println(map.size());
    }
}
