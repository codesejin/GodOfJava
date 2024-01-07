package lang.thegodofjava.Chapter20.study.d.lnag.pratice;

public class NumberObject {
    public static void main(String[] args) {
        NumberObject sample = new NumberObject();
        sample.parseLong("123f");
        sample.parseLong("123");
        sample.printOtherBase(1024);
    }

    private void parseLong(String data) {
        try {
            long l = Long.parseLong(data);
            System.out.println(l);
        } catch (NumberFormatException e) {
            System.err.println(data + " is not a number");
        } catch (Exception e) {
            System.err.println("Exception");
        }
    }

    public void printOtherBase(long value) {
        System.out.println("Original :" + value);
        System.out.println("Binary :" + Long.toBinaryString(value));
        System.out.println("Hex :" + Long.toHexString(value));
        System.out.println("Ocatal :" + Long.toOctalString(value));

    }
}
