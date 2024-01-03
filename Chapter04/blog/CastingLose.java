package lang.thegodofjava.Chapter04.blog;

public class CastingLose {
    private int type;
    private double input;

    public CastingLose(int type, double input) {
        this.type = type;
        this.input = input;
    }

    // 캐스팅 데이터 손실 여부 전달 메소드
    public int castingLoseResult() {
        switch (type) {
            case 1:
                if (isByteLose() == 0) printLose();
                else return 1;
            break;
            case 2:
                if (isShortLose() == 0) printLose();
                else return 1;
            break;
            case 3:
                if (isIntLose() == 0) printLose();
                else return 1;
            break;
            case 4:
                if (isLongLose() == 0) printLose();
                else return 1;
            break;
            case 5:
                if (isFloatLose() == 0) printLose();
                else return 1;
            break;
            case 6:
                if (isDoubleLose() == 0) printLose();
                else return 1;
            break;
            default: return 0;
        }
        return 0;
    }


    // 타입별 캐스팅 손실 판단 메소드

    private int isByteLose() {
        if (input > Byte.MAX_VALUE || input < Byte.MIN_VALUE) return 0;
        return 1;
    }
    private int isShortLose() {
        if (input > Short.MAX_VALUE || input < Short.MIN_VALUE) return 0;
        return 1;
    }

    private int isIntLose() {
        if (input > Integer.MAX_VALUE || input < Integer.MIN_VALUE) return 0;
        return 1;
    }
    private int isLongLose() {
        if (input > Long.MAX_VALUE || input < Long.MIN_VALUE) return 0;
        return 1;
    }

    private int isFloatLose() {
        if (input > Float.MAX_VALUE || input < Float.MIN_VALUE) return 0;
        return 1;
    }
    private int isDoubleLose() {
        if (input > Double.MAX_VALUE || input < Double.MIN_VALUE) return 0;
        return 1;
    }

    private void printLose() {
        System.out.println("캐스팅 되기에는 값이 크거나 너무 작아 데이터 손실이 발생한다.");
    }
}
