package lang.thegodofjava.Chapter24.study;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.checkVariousKeyMethod();
    }

    private void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "a");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

    private void checkVariousKeyMethod() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "a");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");

        String firstKey = map.firstKey();
        System.out.println(firstKey);
        String lastKey = map.lastKey();
        System.out.println(lastKey);
        String higherKeyThenA = map.higherKey("A");
        System.out.println(higherKeyThenA);
        String lowerKeyThenF = map.lowerKey("a");
        System.out.println(lowerKeyThenF);
    }

}
