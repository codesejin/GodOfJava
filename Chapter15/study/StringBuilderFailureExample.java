package lang.thegodofjava.Chapter15.study;

public class StringBuilderFailureExample {

    public static String concatenateStrings(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        // 여러 쓰레드에서 동시에 접근하는 경우
        Thread thread1 = new Thread(() -> {
            for (String str : strings) {
                stringBuilder.append(str);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (String str : strings) {
                stringBuilder.append(str.toUpperCase()); // 다른 연산 수행
            }
        });

        thread1.start();
        thread2.start();

        // 모든 쓰레드가 작업을 완료할 때까지 대기
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", ", ", "World", "!"};

        String result = concatenateStrings(words);
        System.out.println(result);
    }
}

