package Java_io._13;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 李孔庆
 * time:2022/8/3
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        File myFile = new File("D://java_01/java_txt/05.txt");
        BufferedReader bufferedReader = null;
        String bc;

        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(myFile));
                while ((bc = bufferedReader.readLine()) != null) {
                    System.out.println(bc);
                }
            } finally {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
