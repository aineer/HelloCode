package Java_io._08;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 李孔庆
 * time:2022/7/31
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/
        //文件位置
        String file = "D:/java_01/java_txt/00.txt";
        int text = 0;

        FileInputStream fileObj = null;
        try {
            try {
               fileObj = new FileInputStream(file);

                while ((text = fileObj.read()) != -1) {
                    System.out.print((char) text);

                }
            } finally {
                fileObj.close();
            }
        } catch (IOException e) {
            //处理IOException异常
            System.out.println(e.toString());
        }
    }
}

