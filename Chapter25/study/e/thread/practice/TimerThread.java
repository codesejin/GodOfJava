package lang.thegodofjava.Chapter25.study.e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {

    public void run() {
        printCurrentTimeFirst();
        printCurrentTime();
    }

    private void printCurrentTimeFirst() {
    }

    private void printCurrentTime() {
//        for (int loop = 0; loop < 10; loop++) {
//            Date date = new Date();
//            System.out.println(date.toString());
//            System.out.println(System.currentTimeMillis());
//        }


        try {
            int count=0;
            while(count<10) {
                Thread.sleep(1000);
                long currentTime=System.currentTimeMillis();
                System.out.println(new Date(currentTime)+" "+currentTime);
                count++;
            }
        } catch(Exception e) {

        }
    }
}
