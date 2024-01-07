package lang.thegodofjava.Chapter13.study;

import lang.thegodofjava.Chapter13.study.Person;

public class Student implements Person {
    @Override
    public void walk() {
        System.out.println("학생이 걸어갑니다");
    }

    @Override
    public void gainedWeight(int weight) {
        System.out.println("학생은 "+ weight+"kg 살이 찝니다");
    }


    @Override
    public void losingWeight(int weight) {

    }
}
