package Java_io._12;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String myFile = "D://java_01/python_file/pythonPrint.py";
        File file = new File(myFile);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.append("print('Hello,Python!')");
            } finally {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
