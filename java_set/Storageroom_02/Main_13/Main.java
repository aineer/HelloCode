package java_set.Storageroom_02.Main_13;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.a();
    }
}

class A {

    private static final File file = new File("D://java_01//pyFile_01//Hello.py");

    public void a() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            while (true) bufferedWriter.write("Hello,Would!\n");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}