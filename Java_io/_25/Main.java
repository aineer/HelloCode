package Java_io._25;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        myFile myFile = new myFile();
        myFile.a();
    }
}

class myFile implements Serializable {
    private final transient int port = 9999;
    private static final File file = new File("D://java_01//java_txt//_12.txt");

    public void a() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        objectOutputStream.writeObject(file);
        objectOutputStream.writeInt(port);
        objectOutputStream.flush();
        objectOutputStream.close();

        System.out.println(objectInputStream.getObjectInputFilter());

    }
}