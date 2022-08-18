package Java_io._10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author 李孔庆
 * time:2022/8/2
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        //创建文件对象
        File file = new File("D://java_01/java_txt/04.txt");
        Writer fileWriter = null;
        try {
            try {
                //多态调用
                fileWriter = new FileWriter(file, true);
                fileWriter.write("Zero");
                //刷新
                fileWriter.flush();
                //添加
                fileWriter.append(null);

            } finally {
                fileWriter.close();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
