package lang.thegodofjava.Chapter24.d.collection.pratice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    private Hashtable<Integer, Integer> hashtable;
    public RandomNumberStatistics() {
        this.hashtable = new Hashtable<>();
    }

    public static void main(String[] args) {
        RandomNumberStatistics statistics = new RandomNumberStatistics();
        statistics.getRandomNumberStatistics();
    }

    public void getRandomNumberStatistics() {
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            int number = random.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(number);
        }
        printStatistics();
    }

    private void putCurrentNumber(int tempNumber) {
        if (!hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, 1);
        } else {
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        }
    }

    private void printStatistics() {
        Set<Integer> keySet = hashtable.keySet();
        for (Integer tempKey : keySet) {
            int count = hashtable.get(tempKey);
            System.out.print(tempKey+"="+count+"\t");
            if (tempKey % 10 - 1 == 0) System.out.println();
        }
    }
}
