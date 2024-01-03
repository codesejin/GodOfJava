package lang.thegodofjava.Chapter08.study;

import lang.thegodofjava.Chapter12.study.MemberDTO;

public class ReferencePass {
    public static void main(String args[]) {
        ReferencePass reference = new ReferencePass();
//        reference.callPassByValue();
        reference.callPassByReference();
    }

    private void callPassByReference() {
        MemberDTO member = new MemberDTO("Sejin");
        System.out.println("before passByReference");
        System.out.println("member.name="+member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name="+member.name);
    }

    private void passByReference(MemberDTO member) {
        member.name="Kyurim";
        System.out.println("in passByReference");
        System.out.println("member.name="+member.name);
    }

    private void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
        passByValue(a,b);
        System.out.println("after passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    private void passByValue(int a, String b) {
        a=20;
        b="Z";
        System.out.println("in passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }


}
