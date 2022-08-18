package Java_io._02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File file = new File("java_txt/01.txt");

        try {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStream = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8) {
            };
        outputStream.append("一个IO这么麻烦。。不愧是我大Java");

        outputStream.append("\n");

        outputStream.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}

