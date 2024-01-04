package lang.thegodofjava.Chapter13.study;

public class FinalFieldPersonPrint {
    public static void main(String[] args) {
        FinalFieldPerson person = new FinalFieldPerson("1234567-1234556", "홍길동");

        System.out.println(person.name);
        System.out.println(person.ssn);
        System.out.println(person.nation);

//        person.nation="America";
//        person.ssn="123-123";
        person.name="길동이";
    }
}
