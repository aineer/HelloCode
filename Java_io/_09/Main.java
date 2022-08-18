package Java_io._09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 李孔庆
 * time:2022/8/1
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        File myFile = new File("D://java_01/java_txt/03.txt");
        String my = "D://java_01/java_txt/03.txt";
        FileOutputStream fileOutputStream = null;
        //初始化FileOutputStream对象
        String text = "李孔庆";
        //要写入的内容
        try {
            try {
                fileOutputStream = new FileOutputStream(my, true);
                fileOutputStream.write(text.getBytes());
            } finally {
                fileOutputStream.close();
            }
        } catch(IOException e) {
            System.out.println(e.toString());
        }
    }
}
