package Java_io._01;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("C/:");
            try {
            } finally {
                inputStream.close();
            }
        } catch (IOException e) {
            System.out.println("io异常");
        }
    }
}
