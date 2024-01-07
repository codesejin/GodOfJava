package lang.thegodofjava.Chapter21.study;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBusBoundedWildcardMethod();
    }

    private void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(wildcard);
    }

    private void boundedWildcardMethod(WildcardGeneric<? extends Car> c) { // 중요!!
        Car value = c.getWildCard();
        System.out.println(value);
    }

    private void callBusBoundedWildcardMethod() {
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);
    }
}
