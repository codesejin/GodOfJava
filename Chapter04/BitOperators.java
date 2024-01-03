package lang.thegodofjava.Chapter04;

public class BitOperators {
    public static void main(String[] args) {
        BitOperators sample = new BitOperators();
//        sample.andOrXorSample();
//        sample.notSample();
//        sample.shiftSample();
        sample.shiftRight(10,1);

    }
    // int값을 받아서 2진수로 출력
    public void printValue(String variableName, int a) {
        System.out.print(variableName+"=");
        int aZeroCount=Integer.numberOfLeadingZeros(a);
        for (int loop=0; loop<aZeroCount;loop++) {
            System.out.print("0");
        }
        if (Integer.SIZE==aZeroCount) {
            System.out.println("\t["+a+"]");
        } else {
            System.out.println(Integer.toBinaryString(a)+"\t["+a+"]");
        }
    }

    private void andOrXorSample() {
        int a =1, b=7;
        andOperation(a,b);
        orOperation(a,b);
        xorOperation(a,b);
        //a=1;
        //b=3;
        //andOperation(a,b);
        //orOperation(a,b);
        //xorOperation(a,b);
        //a=-10;
        //b=10;
        //andOperation(a,b);
        //orOperation(a,b);
        //xorOperation(a,b);
    }

    private void andOperation(int a, int b) {
        int result =a&b;
        printValue(" a",a);
        printValue(" b",b);
        printValue("a&b",result);
        System.out.println();
    }

    private void orOperation(int a, int b) {
        int result =a|b;
        printValue(" a",a);
        printValue(" b",b);
        printValue("a|b",result);
        System.out.println();
    }

    private void xorOperation(int a, int b) {
        int result =a^b;
        printValue(" a",a);
        printValue(" b",b);
        printValue("a^b",result);
        System.out.println();
    }

    private void notSample() {
        int a = 1;
        notOperation(a);
        a = 255;
        notOperation(a);
        a=-10;
        notOperation(a);
        a=0;
        notOperation(a);
    }

    private void notOperation(int a) {
        int result=~a;
        printValue(" a",a);
        printValue(" ~a",result);
        System.out.println();
    }

    private void shiftSample() {
        int a = 1;
        for(int loop=1; loop<34;loop++) {
            a=shiftLeft(a,1);
        }
    }

    private int shiftLeft(int a, int move) {
        int result = a<<move;
        printValue("   a",a);
        printValue("a<<"+move,result);
        System.out.println();
        return result;
    }

    private int shiftRight(int a, int move) {
        int result = a<<move;
        printValue("   a",a);
        printValue("a<<"+move,result);
        System.out.println();
        return result;
    }
}
