package lang.thegodofjava.Chapter10.study.inheritance;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }

    private void callPrintNames() {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new ChildOther();

        parent1.printName();
        parent2.printName();
        parent3.printName();
    }
}
