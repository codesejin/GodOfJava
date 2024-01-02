package lang.thegodofjava.Chapter10.study.inheritance;

public class ChildCasting extends ParentCasting {
    public ChildCasting() {
    }

    public ChildCasting(String name) {
    }
    public void printName() {
        System.out.println("printName() - Parent");
    }
    public void printAge() {
        System.out.println("printAge() - 18 month");
    }

    public static void main(String[] args) {
        ParentCasting parent = new ParentCasting();
        ParentCasting obj = new ChildCasting();
    }
}
