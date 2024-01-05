package lang.thegodofjava.Chapter15.study;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        System.out.println(sample.nullCheck2(null));
    }

    private boolean nullCheck(String text) {
        int textLenth = text.length();
        System.out.println(textLenth);
        if (text == null) return true;
        else return false;
    }

    private boolean nullCheck2(String text) {
        if (text == null) return true;
        else {
            int textLenth = text.length();
            System.out.println(textLenth);
            return false;
        }
    }

}
