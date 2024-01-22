package lang.thegodofjava.Chapter24.study;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Person> firstList = new ArrayList<>();
        int hashCode = 0;
        for (int i = 20; i <= 30; i++) {
            Person person = new Person("Tina", i);
            int hash = hash(person.hashCode());
            if (hashCode != hash) {
                firstList.add(person);
                hashCode = hash;
            }
        }

        for (Person person : firstList) {
            int hash = hash(person.hashCode());
            //HashMap's initial bucket array size i.e. 16
            int n = 1 << 4;
            //HashMap's hash to bucket index formula
            int index = (n - 1) & hash;
            System.out.printf("index: %s, hash: %s%n", index, hash);
        }
    }

    //internally used by HashMap
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
