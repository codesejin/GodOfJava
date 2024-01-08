package lang.thegodofjava.Chapter22.study;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
    }

    private void checkPeek() {
        Stack<Integer> intStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            intStack.push(i);
            System.out.println(intStack.pop());
        }
        System.out.println("size="+intStack.size());
    }
}
