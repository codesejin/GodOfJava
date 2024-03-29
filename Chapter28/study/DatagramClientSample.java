package lang.thegodofjava.Chapter28.study;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class DatagramClientSample {

    public static void main(String[] args) {
        DatagramClientSample sample = new DatagramClientSample();
        sample.sendDatagramSample();
    }

    private void sendDatagramSample() {
        for (int loop = 0; loop < 3; loop++) {
            sendDatagramData("I liked UDP " + new Date());
        }
        sendDatagramData("EXIT");
    }

    private void sendDatagramData(String data) {
        try {
            DatagramSocket client = new DatagramSocket();
            InetAddress address = InetAddress.getByName("127.0.0.1"); // 데이터를 받을 서버의 IP설정
            byte[] buffer = data.getBytes();
            DatagramPacket packet
                    = new DatagramPacket(buffer, 0, buffer.length, address, 9999); // 데이터 전송을 위해 DatagramPacket객체 생성
            client.send(packet);
            System.out.println("Client:Sent data");
            client.close();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
