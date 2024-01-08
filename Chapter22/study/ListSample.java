package lang.thegodofjava.Chapter22.study;

import java.util.ArrayList;
import java.util.HashSet;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList8();

    }

    private void checkArrayList() {
        ArrayList<String> list1 = new ArrayList<>();
//        list1.add(new Object());
        list1.add("ArrayListSample");
//        list1.add(Double.valueOf(1));
        System.out.println(list1);
    }

    private void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);
        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
        }
    }

    private void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list;
        list.add("Oooops"); // list 추가
        for (String tempData : list2) { // list2 출력
            System.out.println("List2 " + tempData);
        }
    }

    private void checkArrayList5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        int listSize = list.size();
        for (int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get(" + loop + ")=" + list.get(loop));

        }
    }

    private void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);

    }

    private void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[2]; // 5에서 2로 변경
        String[] strList = list.toArray(tempArray);
        for (String tempData : strList) {
            System.out.println("tempData " + tempData);
        }
    }

    private void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
//        System.out.println("Removed "+list.remove(0));
//        System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);
        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println("list.get(" + loop + ")=" + list.get(loop));
        }
    }
}