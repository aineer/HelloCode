package Java_io._03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author 李孔庆
 * time:2022/7/30
 */
public class Main {
    public static void main(String[] args) throws IOException {
        /*main方法*/
        try {
            //实例化FileOutputStream对象,true表示追加写入
            FileOutputStream fos = new FileOutputStream("d:/java_01/zero.txt",true);
            fos.write(("").getBytes());
            fos.close();
            //关闭文件对象
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}

