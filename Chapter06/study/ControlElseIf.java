package lang.thegodofjava.Chapter06.study;

public class ControlElseIf {
    public static void main(String[] args) {
        ControlElseIf control = new ControlElseIf();
        control.elseIf(85);
        control.elseIf2(30);
    }

    public void elseIf(int point) {
        if(point > 90) { // 90점 초과일 경우
            System.out.println("A");
        } else if(point > 80) { // 90점 초과는 아니지만 80점 초과일 경우
            System.out.println("B");
        } else if (point > 70) { // 80점 초과는 아니지만 70점 초과일 경우
            System.out.println("C");
        } else if (point > 60) { // 70점 초과는 아니지만 60점 초과일 경우
            System.out.println("D");
        } else { // 60점 초과가 아닌 모든 경우
            System.out.println("F");
        }
    }

    public void ifWithAnd(int point) {
        if(point > 90) { // 90점 초과일 경우
            System.out.println("A");
        }
        if(point <= 90 && point > 80) { // 90점 초과는 아니지만 80점 초과일 경우
            System.out.println("B");
        }
        if (point <= 80 && point > 70) { // 80점 초과는 아니지만 70점 초과일 경우
            System.out.println("C");
        }
        if (point <= 70 && point > 60) { // 70점 초과는 아니지만 60점 초과일 경우
            System.out.println("D");
        }
        if (point <= 60){ // 60점 초과가 아닌 모든 경우
            System.out.println("F");
        }
    }

    public void elseIf2(int point) {
        String result = point>90 ? "A" : point>80 ? "B" : point>70 ? "C" : point> 60 ? "D" : "F";
        System.out.println(result);
    }


}
