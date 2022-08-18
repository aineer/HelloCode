package Java_io._16;

import java.io.*;

/**
 * @author 李孔庆
 * time:2022/8/4
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        //文件Copy
        File myJpg = new File("C:\\Users\\Venus\\Downloads\\910139.jpg");
        File fileCopy = new File("D://java_01/java_jpg/lmAge.jpg");

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;

        try {
            try {
                inputStream = new BufferedInputStream(new FileInputStream(myJpg));
                outputStream = new BufferedOutputStream(new FileOutputStream(fileCopy));
                int bl = 0;

                byte[] bytes = new byte[1024];

                while ((bl = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, bl);
                }

            } finally {
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
