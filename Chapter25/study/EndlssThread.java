package lang.thegodofjava.Chapter25.study;

public class EndlssThread extends Thread {
    @Override
    public void run() {
        while(true) {
            try {
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
