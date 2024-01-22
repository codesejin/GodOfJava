package lang.thegodofjava.Chapter24.study;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("관희", 30);
        System.out.println("person1의 hashCode : " + person1.hashCode());
        System.out.println("                    " + person1);
        Person person2 = new Person("관희", 30);// 동등한 객체 추가
        System.out.println("person2의 hashCode : " + person2.hashCode());
        System.out.println("                    " + person2);
        Person person3 = new Person("관희", 28); // 이름만 동등한 객체 추가
        System.out.println("person3의 hashCode : " + person3.hashCode());
        System.out.println("                    " + person3);
        Person person4 = new Person("민우", 24);
        System.out.println("person4의 hashCode : " + person4.hashCode());
        System.out.println("                    " + person4);

        System.out.println("----------Hash 자료구조 비교----------");
        System.out.println("\n---> HashSet");
//        HashSet<Person> set = new HashSet<>();
//        set.add(person1);
//        set.add(person4);
//
//        System.out.println("동등객체(person2) : " + person3 + " , hashCode : " + person3.hashCode());
//        System.out.println("동등성 검사 시작");
//        for (Person person : set) {
//            if (person.hashCode() == person3.hashCode()) {
//                if (person.equals(person3)) {
//                    System.out.println("해쉬코드도 같고, 동등한 객체입니다" + " : 비교 객체 " + person);
//                } else {
//                    System.out.println(person + "은 해쉬코드는 " + person.hashCode() + "로 person2와 같지만, 동등한 객체가 아닙니다");
//                }
//            }
//            System.out.println("해시코드가 다릅니다");
//        }


        System.out.println("\n---> HashMap");

        HashMap<Person, String> map = new HashMap<>();
        map.put(person1, "person1");
        map.put(person4, "person4");

        System.out.println("동등객체(person2) : " + person3 + " , hashCode : " + person3.hashCode());
        System.out.println("동등성 검사 시작");
        for (Person person : map.keySet()) {
            if (person.hashCode() == person3.hashCode()) {
                if (person.equals(person3)) {
                    System.out.println("해쉬코드도 같고, 동등한 객체입니다" + " : 비교 객체 " + person);
                } else {
                    System.out.println(person + "은 해쉬코드는 " + person.hashCode() + "로 person2와 같지만, 동등한 객체가 아닙니다");
                }
            }
            System.out.println("해시코드가 다릅니다");

        }

        if (map.containsKey(person3)) {
            System.out.println("동등한 객체입니다.");
        } else {
            System.out.println("동등하지 않은 객체입니다.");
        }
    }
}
