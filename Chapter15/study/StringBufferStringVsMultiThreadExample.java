package lang.thegodofjava.Chapter15.study;

public class StringBufferStringVsMultiThreadExample {
    public static void main(String[] args) {
        int iterations = 1000000;
        int numThreads = 10;

        // StringBuffer with synchronization in a multi-threaded environment
        long startTime = System.currentTimeMillis();
        StringBuffer synchronizedBuffer = new StringBuffer();

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < iterations; j++) {
                    synchronized (synchronizedBuffer) {
                        synchronizedBuffer.append("hello");
                    }
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer with synchronization in multi-threaded environment time: " + (endTime - startTime) + " ms");

        // StringBuffer without synchronization in a multi-threaded environment
        startTime = System.currentTimeMillis();
        StringBuffer unsynchronizedBuffer = new StringBuffer();

        threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < iterations; j++) {
                    unsynchronizedBuffer.append("hello");
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer without synchronization in multi-threaded environment time: " + (endTime - startTime) + " ms");
    }
}
