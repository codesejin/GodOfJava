package lang.thegodofjava.Chapter21.study;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    private void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        WildcardGeneric<Integer> wildcard2 = new WildcardGeneric<>();
        wildcard2.setWildcard(1);
        wildcardStringMethod(wildcard2);
    }

    private void wildcardStringMethod(WildcardGeneric<?> c) {
        Object value = c.getWildCard();
        if (value instanceof  String) {
            System.out.println(value);
        } if (value instanceof Integer) {
            System.out.println("Integer");
        }
    }
}
