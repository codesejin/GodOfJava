package lang.thegodofjava.Chapter13.study;

import lang.thegodofjava.Chapter13.study.Person;

public class Employee implements Person {
    @Override
    public void walk() {
        System.out.println("회사원은 걸어갑니다");
    }

    @Override
    public void gainedWeight(int weight) {
        System.out.println("회사원은 "+ weight+"kg 살이 찝니다");
    }

    @Override
    public void losingWeight(int weight) {

    }
}
