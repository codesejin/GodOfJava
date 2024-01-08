package lang.thegodofjava.Chapter23.study.d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    Random random = new Random();

    public static void main(String[] args) {
        RandomNumberMaker sample = new RandomNumberMaker();
        sample.makeRandomNumbers(10);
    }

    public void makeRandomNumbers(int count) {
        for (int loop = 0; loop < count; loop++) {
            HashSet<Integer> set = getSixNumber();
            System.out.println(set);
        }
    }


    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
//            int tempNumber = random.nextInt(45); // 0부터 45까지 임의의 숫자 리턴
            int tempNumber = random.nextInt(44) + 1;
            set.add(tempNumber);
            if (set.size() >= 6) break;
        }
        return set;
    }
}
