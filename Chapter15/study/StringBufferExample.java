package lang.thegodofjava.Chapter15.study;

public class StringBufferExample {

    private StringBuffer buffer = new StringBuffer();

    public void appendString(String str) {
        buffer.append(str);
    }

    public String getResult() {
        return buffer.toString();
    }

    public static void main(String[] args) {
        StringBufferExample example = new StringBufferExample();

        // 여러 쓰레드에서 인스턴스 변수(buffer)에 동시 접근
        Thread thread1 = new Thread(() -> {
            example.appendString("Hello");
        });

        Thread thread2 = new Thread(() -> {
            example.appendString(", ");
        });

        Thread thread3 = new Thread(() -> {
            example.appendString("World!");
        });

        thread1.start();
        thread2.start();
        thread3.start();

        // 모든 쓰레드가 작업을 완료할 때까지 대기
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 여러 쓰레드에서 동시에 더해진 결과를 출력
        System.out.println(example.getResult());
    }
}

