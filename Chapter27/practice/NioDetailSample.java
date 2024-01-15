package lang.thegodofjava.Chapter27.practice;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample sample = new NioDetailSample();
        sample.checkBufferStatus();
    }

    private void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for (int loop = 0; loop < 100; loop++) {
                buffer.put(loop);
            }
            System.out.println("Buffer capacity="+buffer.capacity());
            // limit의 position을 별도로 지정하지 않았으므로, 이 값의 기본 크기는 1024
            System.out.println("Buffer limit="+buffer.limit());
            System.out.println("Buffer position="+buffer.position()); // 데이터를 추가한 후 버퍼의 position은 100이다.
            buffer.flip(); // flip 호출한 다음 limit값은 100이 되고, position값은 0이다. CD되감기하듯 맨 앞으로 이동한다.
            System.out.println("Buffer flipped!!!");
            System.out.println("Buffer limit="+buffer.limit());
            System.out.println("Buffer position="+buffer.position());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printBufferStatus(String job, IntBuffer buffer) {
        System.out.println("Buffer "+ job + "!!!");
        System.out.format("Buffer position=%d remaining=%d limit=%d\n",
                buffer.position(),buffer.remaining(),buffer.limit());
    }

    public void checkBufferStatus() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            buffer.get(); // 하나의 데이터 읽고
            printBufferStatus("get", buffer);
            buffer.mark();  // 위치 표시하고
            printBufferStatus("mark", buffer);
            buffer.get(); // 다시 읽고
            printBufferStatus("get", buffer);
            buffer.reset(); //표시한 position으로 이동 후
            printBufferStatus("reset", buffer);
            buffer.rewind(); // 처음으로 이동하고
            printBufferStatus("rewind", buffer);
            buffer.clear(); // 데이터를 지우고
            printBufferStatus("clear", buffer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
