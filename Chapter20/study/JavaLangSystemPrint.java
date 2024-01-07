package lang.thegodofjava.Chapter20.study;

import java.lang.invoke.StringConcatFactory;

public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint sample = new JavaLangSystemPrint();
        sample.printNull();
    }

    private void printStreamCheck() {
        byte b = 127;
        short s = 32767;
        System.out.println(b);
        System.out.println(s);
        printInt(b);
        printInt(s);
    }
    public void printInt(int value) {
        System.out.println(value);
    }

    public void printNull() {
        Object obj = new int[]{0};
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(String.valueOf(obj));
        System.out.println(obj + " is object's value");
    }
}
