package Java_io._06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream input = new FileOutputStream("D:/java_01/java_txt/02.txt", true);
        try {
            input.write("AI".getBytes());
            input.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        System.out.println("OK");
    }
}
