package lang.thegodofjava.Chapter25.study;

public class RunnableSample implements Runnable {

    @Override
    public void run() {
        // 쓰레드가 시작되면 한 줄 출력하고, 그 쓰레드는 종료된다
        System.out.println("This is RunnableSample's run() method.");
    }
}
