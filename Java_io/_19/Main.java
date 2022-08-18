package Java_io._19;

import java.io.*;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        /*main方法*/

        FileCopy file = new FileCopy();
        file.fileCopy();
    }
}

class FileCopy {
    private final static File originalJpg = new File("C:\\Users\\Venus\\Downloads\\774251.png");

    private final static File copyFile = new File("D:\\java_01\\java_jpg\\liuZi.png");

    public void fileCopy() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int bl = 0;
        byte[] bytes = new byte[1024];

        try {
            try {
                bis = new BufferedInputStream(new FileInputStream(originalJpg));
                bos = new BufferedOutputStream(new FileOutputStream(copyFile));

                while ((bl = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, bl);
                }
            } finally {
                bis.close();
                bos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}