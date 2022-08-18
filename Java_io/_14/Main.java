package Java_io._14;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("D://java_01/java_txt/06.txt");

        BufferedWriter bufferedReader = null;

        try {
            try {
                bufferedReader = new BufferedWriter(new FileWriter(myFile));
                bufferedReader.write("我是顶针\n");
                bufferedReader.newLine();
                bufferedReader.write("wcNmm\n");
            } finally {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
