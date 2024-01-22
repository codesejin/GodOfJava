package lang.thegodofjava.Chapter24.study;

import java.util.HashMap;
import java.util.Stack;

public class Sample {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("세진", 30), "person3");
        map.put(new Person("세진",100),"person4"); // 동등한 객체 추ㄹ
        System.out.println(map);
        Stack<Integer> st = new Stack<>();
    }
}
