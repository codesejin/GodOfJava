package lang.thegodofjava.Chapter15.study;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convertUTF16();
//        String koreanString = "한"; // 한글 문자열
//        byte[] utf8Bytes = koreanString.getBytes(StandardCharsets.UTF_16);
//
//        System.out.println("UTF-8 Bytes for each character:");
//        for (byte b : utf8Bytes) {
//            System.out.print(b + " ");
//        }
    }

    private void convert() {
        try {
            // 예제 코드가 위치할 부분
            String korean = "한글ㄱ";
            byte[] array1 = korean.getBytes();
            printByArray(array1);
            String korean2=new String(array1);
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printByArray(byte[] array1) {
        for (byte data : array1) {
            System.out.print(data+" ");
        }
        System.out.println();
    }

    private void convertUTF16() {
        try {
            String korean = "한글ㄱ";
            byte[] array1 = korean.getBytes("UTF-16");
            printByArray(array1);
            String korean2=new String(array1,"UTF-16");
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
