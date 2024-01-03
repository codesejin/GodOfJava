package lang.thegodofjava.Chapter04.blog;

public class Test {
    public static void main(String[] args) {
//        int intValue = 128;
//        byte test = (byte) intValue;
//        System.out.println(test);

//        long testLong = Long.MAX_VALUE;
//        System.out.println("Long의 최댓값 : " + testLong);
//        int testInt = (int) testLong;
//        System.out.println("Long의 최댓값을 int에 담은 것 : " + testInt);

//        int first = 100000;
//        int second = 70000;
//        int multiInt = first * second;
//        long multiLongWithoutCasting = first * second;
//        long multiLongWithCasting = (long)first * second;
//        System.out.println("형변환 안한 것 : " + multiInt);
//        System.out.println("형변환 한 것 : " + multiLongWithoutCasting);
//        System.out.println("강제형변환 한 것 : " + multiLongWithCasting);

        // 실수를 정수로 변경 시 강제 형변환
        float fnum2 = 4.0f;
        long lnum2 = (long)fnum2;
        // float는 4바이트, long은 8바이트 임에도 자동 형변환 불가능
        // 소수점 자리 이하 데이터 손실 가능성)

        // 정수를 실수로 변경 시 자동 형변환
//        int intTest= 4;
//        float floatTest = intTest;
//        System.out.println(floatTest);
//
//        // 문자열 강제 형변환
//        char ch = 'a';
//        byte bnum2 = (byte) ch; // 범위가 더 작음
//        short snum2 = (short) ch; // 같은 2바이트이지만, 부호 비트로 인한 값의 범위가 다르기 때문
//        int inum2 = ch;

        // 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다
        int inum = 10;
        int lnum = 100;
        int isum1 = inum + lnum;
        System.out.println(isum1);
        int isum2 = (int) inum + lnum;
        System.out.println(isum2);
        int isum3 = inum + (int) lnum;
        System.out.println(isum3);
        long lsum = inum + lnum;//????
        System.out.println(lsum);

    }
}
