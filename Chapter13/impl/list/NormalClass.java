package lang.thegodofjava.Chapter13.impl.list;

public class NormalClass extends AbstractList {

    @Override
    void clear() {
        System.out.println("NormalClass - clear()");
    }

//    @Override
//    public void add() {
//        System.out.println("NormalClass - add()");
//    }

    @Override
    public void update(int index, Object value) {
        System.out.println("NormalClass - update()");
    }

    @Override
    public void remove(int index) {
        System.out.println("NormalClass - remove()");
    }
}
