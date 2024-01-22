package lang.thegodofjava.Chapter24.study;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Assignment {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("관희", 30));
        set.add(new Person("관희", 30)); // 동등한 객체 추가
        set.add(new Person("관희", 28));
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("관희", 30), "person1");
        map.put(new Person("진석", 31), "person2");
        map.put(new Person("혜선", 26), "person3");

        Person newPerson = new Person("혜선", 26);

        for (Map.Entry<Person, String> tmpPerson : map.entrySet()) {
            System.out.println("hashCode = " + tmpPerson.hashCode());
            System.out.println("          key = " + tmpPerson.getKey());
            System.out.println("          value = " + tmpPerson.getValue());
            if (map.containsKey(newPerson)) {
                System.out.println("-->  containsKey에 포함되는 경우 : " + map.get(newPerson));
                System.out.println("-->  containsKey에 포함되는 경우 : " + newPerson.hashCode());
            } else {
                System.out.println("-->  containsKey에 포함 안 되는 경우 : " + map.get(newPerson));
                System.out.println("-->  containsKey에 포함 안 되는 경우 : " + newPerson.hashCode());

            }
        }
    }
}
