package lang.thegodofjava.Chapter08.study;

import lang.thegodofjava.Chapter12.study.MemberDTO;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5});
        varargs.calculateNumbers(1, 2, 3, 4, 5);
        MemberDTO member = new MemberDTO("Sejin", "010-8580-1234","seijin0722@naver.com");
        System.out.printf("Name:%s Phone:%s E-mail:%s\n",member.name,member.phone,member.email);
    }

    private void calculateNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total+= number;
        }
        System.out.println("Total="+total);
    }

    private void calculateNumbersWithArray(int[] numbers) {
    }
}
