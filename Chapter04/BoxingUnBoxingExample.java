package lang.thegodofjava.Chapter04;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
//        Byte objByte1 = Byte.valueOf((byte) 10);
//    Byte objByte2 = Byte.valueOf(String.valueOf(10));
//    byte b1 = objByte1.byteValue();
//    byte b2 = objByte2.byteValue();
//
//
//    Short obj2 = Short.valueOf((short) 12);
//    Integer obj3 = new Integer(1000);
//    Long obj4 = new Long(”10000”);
//    Float obj5 = new Float(”2.5F”);
//    Double obj6 = new Double(”3.5”);
//    Boolean obj7 = new Boolean(”true”);

//        // 박싱
//        Integer obj1 = new Integer(100);
//        Integer obj2 = new Integer("200");
//        Integer obj3 = Integer.valueOf("100");
//
//        // 언박싱
//        int value1 = obj1.intValue();
//        int value2 = obj2.intValue();
//        int value3 = obj3.intValue();
//
//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(value3);

        Integer obj = 100; // 자동박싱

        Integer objUnBoxing = Integer.valueOf(200);
        int value1 = objUnBoxing; // 자동 언박싱
        int value2 = objUnBoxing + 100; // 자동 언박싱
    }
}
