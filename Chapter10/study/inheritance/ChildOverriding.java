package lang.thegodofjava.Chapter10.study.inheritance;

public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }
    public void printName() {
        System.out.println("ChildOverriding printName()");
    }
}
