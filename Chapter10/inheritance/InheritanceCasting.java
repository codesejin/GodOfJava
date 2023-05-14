package lang.thegodofjava.Chapter10.inheritance;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        inheritance.objectCast();
    }
    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        // 자식 타입의 객체를 부모 타입으로 형변환하는 것은 자동
        ParentCasting parent2 = child;
        // 부모 타입의 객체를 자식 타입으로 형 변환 할 때에는 명시적으로 타입을 지정해야함
        ChildCasting child2 = (ChildCasting)parent;
    }
}
