package Network._02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException, UnknownHostException {
        /*main方法*/
        String host = "localhost";

        Socket socket = new Socket(host, 8081);
    }
}
