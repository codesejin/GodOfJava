package lang.thegodofjava.Chapter23.study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList1();
    }

    private void checkLinkedList1() {
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.addFirst("B");
        System.out.println(link);//B A
        link.offerFirst("C");
        System.out.println(link);// C B A
        link.addLast("D");
        System.out.println(link);// C B A D
        link.offer("E");
        System.out.println(link);// C B A D E
        link.offerLast("F");
        System.out.println(link); // C B A D E F
        link.push("G");
        System.out.println(link); // G C B A D E F
        link.add(0, "H");
        System.out.println(link); // H G C B A D E F
        System.out.println("EX=" + link.set(0, "I")); // H -> 기존에 있던 데이터 리턴
        System.out.println(link); // I G C B A D E F
//        descendingIterator(link);
        listIterator(link);
    }

    private void listIterator(LinkedList<String> link) {
        ListIterator<String> stringListIterator = link.listIterator(2);
        System.out.println("Index 2의 privous="+stringListIterator.previous());
    }

    private void descendingIterator(LinkedList<String> link) {
        Iterator<String> descendingIterator = link.descendingIterator();
        System.out.println(descendingIterator);
        while (descendingIterator.hasNext()) {
            System.out.print("Iterator=" + descendingIterator.next()+ ", ");
        }
    }
}
