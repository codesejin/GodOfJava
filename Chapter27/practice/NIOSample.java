package lang.thegodofjava.Chapter27.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOSample {
    public static void main(String[] args) {
        NIOSample sample = new NIOSample();
        sample.basicWriteAndRead();
    }

    private void basicWriteAndRead() {
        String fileName = "Chapter27" + File.separator + "practice" + File.separator + "nio.txt";
        try {
            writeFile(fileName, "My first NIO sample.");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeFile(String fileName, String data) throws Exception {
        FileChannel channel = new FileOutputStream(fileName).getChannel(); // 파일을 쓰기 위한 FileChannel 객체 생성
        byte[] byteData = data.getBytes(); // 저장할 byte배열
        ByteBuffer buffer = ByteBuffer.wrap(byteData); // ByteBuffer 클래스에 static으로 선언된 wrap() 메소드 호출로 ByteBuffer 객체 생성
        channel.write(buffer); // FileChannel 클래스의 write 메소드에 buffer 객체 넘겨주면 파일에 쓰게 된다
        channel.close();
    }

    private void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel(); // 파일을 읽기 위한 FileChannel 객체 생성
        // 1024 매개변수는 기본적으로 저장되는 크기 의미
        ByteBuffer buffer = ByteBuffer.allocate(1024); // ByteBuffer 클래스에 static으로 선언된 allocate() 메소드 호출로 ByteBuffer 객체 생성
        channel.read(buffer);// 채널의 read()에 buffer를 넘겨주면서 데이터를 이 버퍼에다 담으라고 알려준다. buffer에 데이터가 담긴다
        buffer.flip(); // 버퍼에 담겨잇는 데이터의 가장 앞으로 이동
        while (buffer.hasRemaining()) { // hasRemaining()로 데이터가 남아있는지 확인하면서 반복작업 수행
            System.out.print((char)buffer.get()); // get()로 한 바이트씩 데이터를 읽는다
        }
        channel.close();
    }
}
