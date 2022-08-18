package Network._03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
    public static void main(String[] args) throws IOException {
        A a = new A();
        a.a();
    }
}

class A {
    private int port;
    private ServerSocket socket = null;
    private Socket socket1 = null;

    A () {
        //端口号
        port = 8081;
    }

    A (int port) {
        this.port = port;
    }

    public void a() throws IOException {
        try {
            try {
                //建立服务器套接字，端口号为8081
                socket = new ServerSocket(this.port);
                //accept方法监听客户端的链接
                socket1 = new ServerSocket().accept();
            } finally {

             }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            var dataInputStream = new DataInputStream(new BufferedInputStream(socket1.getInputStream()));
            var dataOut = new DataOutputStream(new BufferedOutputStream(socket1.getOutputStream()));

            do {
                double length = dataInputStream.readDouble();
                System.out.println("服务器端收到的边长数据为：" + length);
                double result = length * length;
                dataOut.writeDouble(result);
                dataOut.flush();
            } while (dataInputStream.read() != 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            socket.close();
            socket1.close();
        }
    }
}