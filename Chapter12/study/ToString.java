package lang.thegodofjava.Chapter12.study;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
    }

    private void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus "+obj);
    }

    private void toStringMethod2() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus "+this);
    }

    @Override
    public String toString() {
        return "ToString Class";
    }
}
