package lang.thegodofjava.Chapter13.impl.list;

public abstract class AbstractList implements List {
    abstract void clear();

    public void add() {
        System.out.println("AbstractList - add()");
    }
}
