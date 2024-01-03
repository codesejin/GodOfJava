package lang.thegodofjava.Chapter04;

class User {
    public int age;

    public User(int age) {
        this.age = age;
    }
}

public class Test {

    public static void main(String[] args) {
//        User a = new User(20);
//        User b = new User(20);
//        Test test = new Test();
//        test.modify(a, b);
//
//        System.out.println("a 의 age : " + a.age);
//        System.out.println("b 의 age : " + b.age);

        String a1 = "1";
        String b1 = "1";
        boolean r1 = a1== b1;
        System.out.println(r1);

        Object a2 = new Object();
        Object b2 = new Object();
        boolean r2 = a2 == b2;
        System.out.println(r2);

        boolean r3 = a2.equals(b2);
        System.out.println(r3);


    }
    private void modify(User a, User b) {

        a.age++;

        // b 에 새로운 객체를 할당하면 가리키는 객체가 달라지고 원본에는 영향 없음
        b = new User(30);
        b.age++;
    }
}
