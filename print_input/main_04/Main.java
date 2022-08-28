package print_input.main_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.link();
    }
}

class Client {
    private static final int port = 9999;
    private static final String ip = "192.168.31.98";
    private static Scanner Input = new Scanner(System.in);
    public void link() {
        BufferedWriter bufferedWriter = null;

        try {
            try {
                Socket socket = new Socket(ip, port);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                System.out.print("输入zero，查看help和使用: ");
                String userInput = Input.next();
                bufferedWriter.write(userInput);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } finally {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}