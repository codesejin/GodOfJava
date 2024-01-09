package lang.thegodofjava.Chapter25.study.e.thread.sync;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for (int loop = 0; loop < 5; loop++) {
            runSync.runCommonCalculate();
        }
    }

    private void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start(); // 쓰레드 시작
        thread2.start();

        try {
            thread1.join(); // 쓰레드가 종료될때 까지 기다리는 메소드
            thread2.join();
            System.out.println("Final value is "+calc.getAmount());
            // getAmount() 호출 결과는 join()메소드 수행 이후이므로, 모든 쓰레드가 종료된 이후의 결과다
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
