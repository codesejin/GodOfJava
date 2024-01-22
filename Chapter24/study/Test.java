package lang.thegodofjava.Chapter24.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, List<Person>> bucketMap = new HashMap<>();

        for (int i = 20; i <= 30; i++) {
            Person person = new Person("Tina", i);
            int hashCode = person.hashCode();
            List<Person> persons = bucketMap.get(hashCode);
            if (persons == null) {
                persons = new ArrayList<>();
                bucketMap.put(hashCode, persons);
            }
            persons.add(person);
        }
        bucketMap.forEach((k, v) -> {
            System.out.println("hashcode: " + k);
            v.forEach(x -> System.out.println("        " + x));
        });
    }
}
