package lang.thegodofjava.Chapter25.study.e.thread.support;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkJoin();
    }

    private void checkThreadState1() {
        SleepThread thread = new SleepThread(2000); // 쓰레드 생성자 매개변수에 2000 넘겨줌으로써 2초간 대기하도록 선언
        try {
            System.out.println("thread state="+thread.getState());
            thread.start();
            System.out.println("thread state(after start)="+thread.getState());

            Thread.sleep(1000); // 쓰레드가 시작하고 1초동안 대기 후 상태 출력
            System.out.println("thread state(after 1 sec)="+thread.getState());

            thread.join(); // 메소드가 끝날때까지 기다리도록
            thread.interrupt(); // 쓰레드가 종료된 이후에 interrupt() 호출
            System.out.println("thread state(after join)="+thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void checkJoin() {
        SleepThread thread = new SleepThread(2000);
        try {
            thread.start();
            thread.join(2016);
            thread.interrupt();
            System.out.println("thread state(after join)="+thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
