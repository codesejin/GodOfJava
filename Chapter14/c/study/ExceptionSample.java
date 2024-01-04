package lang.thegodofjava.Chapter14.c.study;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }

    private void arrayOutOFBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }

    private void arrayOutOfBoundsTryCatch() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
            System.out.println("This code should run");
        } catch (Exception e) {
            System.err.println("Exception occured");
        }
        System.out.println("This code must run");
    }
}
