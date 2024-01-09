package lang.thegodofjava.Chapter25.study.e.thread.object;

public class StateThread extends Thread {
    private Object monitor;

    public StateThread(Object monitor) { // monitor 객체를 매개변수로 받아서 인스턴스 변수로 선언
        this.monitor = monitor;
    }

    public void run() {
        try {
            for (int loop = 0; loop < 10000; loop++) {
                String a = "A"; // 쓰레드를 실행중인 상태로 만들기 위해 간단히 루프돌면서 String객체 생성
            }
            synchronized (monitor) {
                monitor.wait(); // monitor객체의 wait메소드를 호출
            }
            System.out.println(getName()+" is notified");
            Thread.sleep(1000); // wait()상황이 끝나면 1초간 대기했다가 이 쓰레드는 종료한다
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
