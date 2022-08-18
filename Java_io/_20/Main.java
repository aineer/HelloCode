package Java_io._20;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWrite_ fileWrite = new FileWrite_();
        fileWrite.fileWrite();
    }
}

class FileWrite_ {
    private final static File file = new File("D:/java_01/java_txt/09.txt");

    public void fileWrite() {
        BufferedWriter buw = null;

        try {
            try {
                buw = new BufferedWriter(new FileWriter(file));
                buw.append("gg");
            } finally {
                buw.close();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
