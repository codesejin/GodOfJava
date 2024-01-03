package lang.thegodofjava.Chapter12.study;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
//        thisObject.equalMethod();
        thisObject.equalMethod2();
    }

    private void equalMethod() {
        MemberDTO obj1 = new MemberDTO("gildong");
        MemberDTO obj2 = new MemberDTO("gildong");
        if (obj1==obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }

    private void equalMethod2() {
        MemberDTO obj1 = new MemberDTO("gildong");
        MemberDTO obj2 = new MemberDTO("gildong");
        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
}
