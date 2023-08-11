package lang.thegodofjava.Chapter15.d.string.practice;

public class UseStringMethods {

    public void printWords(String str){
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }

    public void findString(String str, String findStr) {
        int idx = str.indexOf(findStr);
        // indexOf()의 null 체크
        if (idx != -1) {
            System.out.printf("%s is appeared at %d\n", findStr, idx);
        }
    }

    public void findAnyCaseString(String str, String findStr) {
        String lowerStr = str.toLowerCase();
        String lowerFindStr = findStr.toLowerCase();
        int idx = lowerStr.indexOf(lowerFindStr);
        // indexOf()의 null 체크
        if (idx != -1) {
            System.out.printf("%s is appeared at %d\n", findStr, idx);
        }
    }

    public void countChar(String str, char c) {
        char[] charArray = str.toCharArray();
        int idx = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                idx ++;
            }
        }
        System.out.printf("char '%s' count is %d\n2", c, idx);
    }

    public void printContainWords(String str, String findStr) {
        String[] split = str.split(" ");
        String word = "";
        for (int i = 0; i < split.length; i++) {
            if (split[i].contains(findStr)) {
                word = split[i];
            }
        }
        System.out.printf("%s contains %s", word, findStr);
    }
    public static void main(String[] args) {
        UseStringMethods useStringMethods = new UseStringMethods();
        String str = "The String class represents character strings";
        String findStr = "string";
        useStringMethods.printWords(str);
        useStringMethods.findString(str, findStr);
        useStringMethods.findAnyCaseString(str, findStr);
        useStringMethods.countChar(str,'s');
        useStringMethods.printContainWords(str, "ss");
    }
}
