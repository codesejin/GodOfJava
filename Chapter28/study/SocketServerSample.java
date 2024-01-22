package lang.thegodofjava.Chapter28.study;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {

    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }

    private void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            // 9999 포트번호를 이용해서 ServerSocket 객체 생성
            server = new ServerSocket(9999); // 다른 프로그램에서 이 프로그램에 띄운 서버로 접근하려면 9999포트 사용하면된다
            while (true) {
                System.out.println("Server:Waiting for request.");
                client=server.accept(); // 다른 원격 호출을 대기하는 상태가 된다 -> 만약 연결이 완료되면 Socket객체를 리턴해서 Client변수에 할당
                System.out.println("Server:Accepted.");
                InputStream stream = client.getInputStream(); // 데이터를 받기 위해 InputStream객체 사용
                // 만약 접속한 상대방에게 데이터를 전송하려면 OutputStream객체 받은 후 이 stream에 데이터 전달하면된다.
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(stream)
                );
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while((data=in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Received data:"+receivedData);
                in.close();
                stream.close();
                client.close(); // 모든 데이터 처리가 끝난 후 Socekt사용이 종료되었다는 것을 알리기 위해 호출
                if (receivedData!=null & "EXIT".equals(receivedData.toString())) {
                    System.out.println("Stop SocektServer");
                    break;
                }
                System.out.println("----------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close(); // 더이상 소켓 수신할 필요가 없을때, ServerSocket 닫음
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
