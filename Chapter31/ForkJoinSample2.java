package lang.thegodofjava.Chapter31;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinSample2 {
    static final ForkJoinPool mainPool = new ForkJoinPool();  // ForkJoinPool 클래스 객체를 생성

    public static void main(String[] args) {
        ForkJoinSample2 sample = new ForkJoinSample2();
        sample.calculate();
    }

    private void calculate() {
        long from = 0;
        long to = 10;

        GetSum2 sum = new GetSum2(from, to); // 계산을 수행할 GetSum클래스의 객체를 만듬
        // ForkJoinPool에 선언되어 있는 invoke메소드 호출해서 계산을 수행하는 객체를 넘겨주면 작업이 시작되고 그 결과를 받는다
        Long result = mainPool.invoke(sum);
        System.out.println("Fork Join:Total sum of "+from+" ~ "+to+" = "+result);
    }
}
