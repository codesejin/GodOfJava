package lang.thegodofjava.Chapter06.study;

public class ControlIf {
    public static void main(String[] args) {
        ControlIf control = new ControlIf();
        control.ifStatement();
    }

    public void ifStatement() {
        if(true); // 정상적으로 컴파일/실행은 되지만 의미없음
        if (true) System.out.println("It's true");
        if (true)
            System.out.println("It's also true.");
        if (false) // 조건문이 true일때만 처리됨
            System.out.println("It's false");
    }
}
