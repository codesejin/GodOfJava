package lang.thegodofjava.Chapter10.inheritance;

public class ChildOverriding extends ParentOverriding{
    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }

    // 접근 제어자가 더 확대되는것은 문제가 안된다
    // 부모 클래스에서 public 으로 선언한 것을 자식이 private 으로 선언하면 안된다
    public void printName() {
        System.out.println("printName() - ChildOverriding");
    }
}
