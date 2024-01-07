package lang.thegodofjava.Chapter21.study;

public class Bus extends Car {

    public Bus(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                '}';
    }
}
