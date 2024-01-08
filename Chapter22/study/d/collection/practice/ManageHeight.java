package lang.thegodofjava.Chapter22.study.d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    private ArrayList<ArrayList<Integer>> gradeHeight;

    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();
        for (int i = 0; i < 5; i++) {
//            sample.printHeight(i);
            sample.printAverage(i);
        }
    }

    public void setData() {
        ArrayList<Integer> class1 = new ArrayList<>(5);
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);
        ArrayList<Integer> class2 = new ArrayList<>(4);
        class2.add(160);
        class2.add(165);
        class2.add(167);
        class2.add(186);
        ArrayList<Integer> class3 = new ArrayList<>(4);
        class3.add(158);
        class3.add(177);
        class3.add(187);
        class3.add(176);
        ArrayList<Integer> class4 = new ArrayList<>(3);
        class4.add(173);
        class4.add(182);
        class4.add(181);
        ArrayList<Integer> class5 = new ArrayList<>(5);
        class5.add(170);
        class5.add(180);
        class5.add(165);
        class5.add(177);
        class5.add(172);

        gradeHeight = new ArrayList<>();
        gradeHeight.add(class1);
        gradeHeight.add(class2);
        gradeHeight.add(class3);
        gradeHeight.add(class4);
        gradeHeight.add(class5);
    }

    public void printHeight(int classNo) {
        ArrayList<Integer> classHeight = gradeHeight.get(classNo);
        System.out.println("Class No.:" + (classNo + 1));
        for (int tempData : classHeight) {
            System.out.println(tempData);
        }
    }

    public void printAverage(int classNo) {
        ArrayList<Integer> classHeight = gradeHeight.get(classNo);
        System.out.println("Class No.:" + (classNo + 1));
        double sum = 0;
        for (int tempData : classHeight) {
            sum += tempData;
        }
        System.out.println("Height average:"+sum/classHeight.size());
    }
}
