package Java_io._18;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*main方法*/
        try {
        file file = new file();
        file.a();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class file {
    private final static File file = new File("D://java_01/java_txt/08.txt");

    public void a() throws IOException {

       OutputStreamWriter bs = new OutputStreamWriter(new FileOutputStream(file), "gbk");
       bs.write("利空爱情你的");
       bs.close();
    }
}