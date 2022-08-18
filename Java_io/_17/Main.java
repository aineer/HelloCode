package Java_io._17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 李孔庆
 * time:2022/8/5
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        FileCopy fileCopy = new FileCopy();
        fileCopy.copyFile();
    }
}

class FileCopy {
    //原有的图片地址
    private static final File originalJpg = new File("C:\\Users\\Venus\\Downloads\\1146917.jpg");

    //Copy后的图片地址
    private static final File copyFile = new File("D:\\java_01\\java_jpg\\anime_01.jpg");

    public void copyFile() {
        BufferedInputStream inputJpg = null;
        BufferedOutputStream outputJpg = null;
        byte[] bytes = new byte[1024];
        int bl = 0;

        try {
            try {
                //将原有的图片放入
                inputJpg = new BufferedInputStream(new FileInputStream(originalJpg));
                //将将要copy的图片
                outputJpg = new BufferedOutputStream(new FileOutputStream(copyFile));

                while ((bl = inputJpg.read(bytes)) != -1) {
                    outputJpg.write(bytes, 0, bl);
                }
            } finally {
                inputJpg.close();
                outputJpg.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}