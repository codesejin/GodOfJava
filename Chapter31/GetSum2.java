package lang.thegodofjava.Chapter31;

import java.util.concurrent.RecursiveTask;

public class GetSum2 extends RecursiveTask<Long> {
    long from, to;

    public GetSum2(long from, long to) { // 1)
        this.from = from;
        this.to = to;
    }

    public Long compute() {
        long gap = to - from; // 2)
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        log("From=" + from + " To=" + to);
        if (gap <= 3) { // 3)
            long tempSum = 0;
            for (long loop = from; loop <= to; loop++) {
                tempSum += loop;
            }
            log("Return !! " + from + " ~ " + to + " = " + tempSum);
            return tempSum; // 4)
        }

        long middle = (from + to) / 2; // 5)
        GetSum2 sumPre = new GetSum2(from, middle); // 6)
        log("Pre     From=" + from + " To=" + middle);
        sumPre.fork(); // 7)
        GetSum2 sumPost = new GetSum2(middle + 1, to); // 8)
        log("Post     From=" + (middle + 1) + " To=" + to);

        return sumPost.compute() + sumPre.join(); // 9)
    }

    public void log(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "]" + message);
    }
}
