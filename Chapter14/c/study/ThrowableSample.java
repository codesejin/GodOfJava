package lang.thegodofjava.Chapter14.c.study;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    private void throwable() {
        int[] intArray = new int[5];
        try {
//            intArray=null;
            System.out.println(intArray[5]);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
