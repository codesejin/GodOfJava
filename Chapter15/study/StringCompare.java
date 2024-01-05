package lang.thegodofjava.Chapter15.study;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        sample.checkCompareTo();
    }

    private void checkString() {
        String text = "한글도 공백 포함됨";
        System.out.println("text.length()="+ text.length());
        System.out.println("text.isEmpty()="+ text.isEmpty());
    }

    private void checkCompare() {
        String text1 = "Check value";
//        String text2 = "Check value";
        String text3 = "check value";
        String text2 = new String("Check value");
        if (text1==text2) {
            System.out.println("text1==text2 result is same.");
        } else {
            System.out.println("text1==text2 result is different");
        }
        if (text1.equals("Check value")) {
            System.out.println("text.equals(text2) result is same");
        }
        if (text1.equalsIgnoreCase(text3)) {
            System.out.println("text1.equalsIgnoreCase(text3) result is same");
        }
    }

    private void checkCompareTo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" world");
        String text1 = "b";
        String text2 = "c";
        String text3 = "a";
        System.out.println(text2.compareTo(text1)); //1, 2, 1
        System.out.println(text2.compareTo(text3));
        System.out.println(text1.compareTo(text3));
    }
}
