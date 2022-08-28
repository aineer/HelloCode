package Java_io._24;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileCopy fileCopy = new FileCopy();
        fileCopy.setMyFile();
    }
}

class FileCopy {
    private static File myFile = new File("C:\\Users\\Venus\\Downloads\\607699.png");
    private static File copyFile = new File("D:\\java_01\\java_jpg\\anime_03.png");

    public void setMyFile() {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        int bl = 0;
        byte[] bytes = new byte[1024];

        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(myFile));
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(copyFile));
                while ((bl = bufferedInputStream.read(bytes)) != -1) {
                    bufferedOutputStream.write(bytes, 0, bl);
                }
            } finally {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
