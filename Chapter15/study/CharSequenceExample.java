package lang.thegodofjava.Chapter15.study;

public class CharSequenceExample {
    // CharSequence 타입을 매개변수로 받는 메소드
    public static void printLength(CharSequence charSequence) {
        System.out.println("Length: " + charSequence.length());
    }

    public static void main(String[] args) {
        // String 사용 예시
        String str = "Hello, World!";
        printLength(str);

        // StringBuffer 사용 예시
        StringBuffer stringBuffer = new StringBuffer("Java");
        printLength(stringBuffer);

        // StringBuilder 사용 예시
        StringBuilder stringBuilder = new StringBuilder("GPT");
        printLength(stringBuilder);
    }
}
