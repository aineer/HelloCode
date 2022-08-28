package print_input.main_03;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.link();
    }
}

class Server {
    private static ServerSocket serverSocket = null;
    private static Socket socket = null;

    static {
        try {
            //处理异常
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        try {
            //处理异常
            System.out.println("服务端开始监听...");
            socket = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void link() {
        String bl;

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bl = bufferedReader.readLine();

            switch (bl) {
                case "zero":
                    receptionZeroRequest();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void receptionZeroRequest() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write
                (
                  "1.四大名著的介绍\n"
                + "2.查看四大民间爱情故事的介绍\n"
                + "3.查看《浮生六记》的介绍\n"
                + "4.查看宋词收录\n"
                + "5.查看古诗收录\n"
                + "6.查看今日日期\n"
                + "7.查看今日时间\n"
                + "8.退出\n"
                );
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
