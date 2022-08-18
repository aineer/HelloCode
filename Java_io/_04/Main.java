package Java_io._04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream("d:/java_01/Java_txt/00.txt"));

        bos.write("Original Alice in Wonderland".getBytes());
        bos.close();
        System.out.println("OK");
    }
}
