package Java_io._26;

import java.io.File;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author likongqing
 * @version 1.0
 * time：2022/9/15
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        myFile.fileCopy();
    }
}

/**
 * 复制文件路径
 */
class MyFile {
    private static final File myFile = new File("E:\\nnn\\3792237191.mp3");
    private static  final File myFile1 = new File("D:\\java_01\\java_mp3\\水底游歩道.mp3");

    public void fileCopy() throws IOException {
        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        int x = 0;
        byte[] bytes = new byte[1024];

        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(myFile));
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(myFile1));

                while((x = bufferedInputStream.read(bytes)) != -1) {
                    bufferedOutputStream.write(bytes, 0, x);
                    bufferedOutputStream.flush();
                }

            } catch(IOException e) {
                e.printStackTrace();
            }
        } finally {
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }
    }
}