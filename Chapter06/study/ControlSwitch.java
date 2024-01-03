package lang.thegodofjava.Chapter06.study;

public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch control = new ControlSwitch();
        control.switchStatement(6);
    }

    private void switchStatement(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel + " : It is one foot bicycle.");
                break;
            case 2:
                System.out.println(numberOfWheel + " : It is a motor cycle or bicycle.");
                break;
            case 3:
                System.out.println(numberOfWheel + " : It is a three wheel bicycle.");
                break;
            case 4:
                System.out.println(numberOfWheel + " : It is a car.");
                break;
            default:
                System.out.println(numberOfWheel+ " : It is an expensive car.");
        }
    }
}
