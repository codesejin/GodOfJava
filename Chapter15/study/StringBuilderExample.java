package lang.thegodofjava.Chapter15.study;

public class StringBuilderExample {
    public static String concatenateStrings(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : strings) {
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", ", ", "World", "!"};

        String result = concatenateStrings(words);
        System.out.println(result);
    }
}
