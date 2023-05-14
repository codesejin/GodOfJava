package lang.thegodofjava.Chapter10.inheritance;

public class ChildPrint extends Parent{
    public ChildPrint() {
        System.out.println("Child Constructor");
    }

    // extends 확장한 클래스는 추가적인 메소들르 만들어도 전혀 문제 없음
    // 하나의 클래스를 잘 만들어 놓은 게 있으면, 그 클래스를 상속받아 내가 추가적인 기능을 넣을 수 있음
    public void printAge() {
        System.out.println("printAge() - 18 month");
    }
}
