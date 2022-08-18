package Java_io._07;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        /*main方法*/

        File myFile = new File("D://java_01/");
        System.out.println(myFile.isFile());
        System.out.println(myFile.getName());
        System.out.println(myFile.length());
        System.out.println(myFile.isDirectory());
        System.out.println(myFile);

    }
}
