package lang.thegodofjava.Chapter15.study;

public class StringBuilderVsStringBufferSingleThreadExample {
    public static void main(String[] args) {
        int iterations = 1000000;
        System.out.println("--------StringBuilder--------");
        // StringBuffer with synchronization
        // StringBuilder는 동기화가 필요없으므로 synchronized 블록을 제거하는게 좋다
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder synchronizedBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            synchronized (synchronizedBuilder) {
                synchronizedBuilder.append("hello");
            }
        }
        long endTimeBuilder = System.currentTimeMillis();
        System.out.println("StringBuffer with synchronization time: " + (endTimeBuilder - startTimeBuilder) + " ms");

        // StringBuffer without synchronization
        startTimeBuilder = System.currentTimeMillis();
        StringBuilder unsynchronizedBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            unsynchronizedBuilder.append("hello");
        }
        endTimeBuilder = System.currentTimeMillis();
        System.out.println("StringBuffer without synchronization time: " + (endTimeBuilder - startTimeBuilder) + " ms");


        System.out.println("--------StringBuffer--------");
        // StringBuffer with synchronization
        long startTime = System.currentTimeMillis();
        StringBuffer synchronizedBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            synchronized (synchronizedBuffer) {
                synchronizedBuffer.append("hello");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer with synchronization time: " + (endTime - startTime) + " ms");

        // StringBuffer without synchronization
        startTime = System.currentTimeMillis();
        StringBuffer unsynchronizedBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            unsynchronizedBuffer.append("hello");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer without synchronization time: " + (endTime - startTime) + " ms");
    }
}
