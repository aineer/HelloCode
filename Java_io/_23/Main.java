package Java_io._23;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
        FileW fileW = new FileW();
        fileW.file();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FileW {
    private static final File myFile = new File("D:\\java_01\\java_txt\\_11.txt");

    public void file() throws IOException {
        BufferedWriter buw = null;

        buw = new BufferedWriter(new FileWriter(myFile));
        buw.write("Linus");
        buw.newLine();
        buw.flush();
        buw.close();

    }
}