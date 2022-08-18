package Java_io._05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        //实例化FileInputStream对象
        InputStream input = new FileInputStream("D:/java_01/java_txt/_03.txt");

        //实例化BufferedInputStream对象
        InputStream _input = new BufferedInputStream(input);

    }
}
