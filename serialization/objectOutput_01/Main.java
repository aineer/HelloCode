package serialization.objectOutput_01;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File mySerialization = new File("D://java_01/java_dat/serialization_01.dat");

        ObjectOutputStream serialization = null;

        try {
            try {
                serialization = new ObjectOutputStream(new FileOutputStream(mySerialization));
                serialization.write(1);
                serialization.writeChar('q');
                serialization.writeChars("sssssssssss");
                serialization.writeBoolean(true);
                serialization.writeUTF("sssssssss");
                serialization.writeObject(new Dog("zero", 19));
            } finally {
                serialization.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Dog implements Serializable {
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void a() {
        System.out.println("Wc");
    }
}