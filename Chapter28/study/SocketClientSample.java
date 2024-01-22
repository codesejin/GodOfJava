package lang.thegodofjava.Chapter28.study;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    private void sendSocketSample() {
        for (int i = 0; i < 3; i++) {
            sendSocketData("I liked java at "+new Date());
        }
        sendSocketData("EXIT");
    }

    private void sendSocketData(String data) {
        Socket socket = null;
        try {
            System.out.println("Client:Connecting");
            socket=new Socket("127.0.0.1",9999); // "127.0.0.1" IP는 같은 장비라는 것을 의미. 포트번호도 서버쪽에서 지정한 포트랑 동일해야 한다
            System.out.println("Client:Connect status="+socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream(); // 데이터를 서버에 전달하기 위해 getOutputStream메소드 사용
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client:Sent data=" + data);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close(); // 데이터 전달 후 소켓연결닫음
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
