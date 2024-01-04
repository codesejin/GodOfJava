package lang.thegodofjava.Chapter14.c.study;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable sample = new ExceptionVariable();
        sample.checkVariable();
    }

    private void checkVariable() {
        int[] intArray = null;
        try {
            intArray = new int[5]; // intArray 변수
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run");
    }
}
