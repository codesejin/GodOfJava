package lang.thegodofjava.Chapter04.study;

public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkByte();
    }

    private void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin=" + byteMin);
        System.out.println("byteMax=" + byteMax);
        byteMin=(byte)(byteMin-1+1);
        byteMax=(byte)(byteMax+1);
        System.out.println("byteMin=" + byteMin);
        System.out.println("byteMax=" + byteMax);
    }

    public void checkOtherType() {
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMAx = Long.MAX_VALUE;
    }
}
