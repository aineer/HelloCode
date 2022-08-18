package Java_io._15;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * @author 李孔庆
 * time:2022/8/3
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        IOInterface myFile = new FileOperations();
        myFile.writeToAFile();
        myFile.readTheFile();
    }
}

/**
 * 定义IOInterface接口
 *
 * 定义方法，由实现类实现
 */
interface IOInterface {
    /*抽象方法，由实现类实现文件写入操作*/
    public abstract void writeToAFile();

    /*抽象方法，由实现类实现文件读取操作*/
    public abstract void readTheFile();
}

/**
 * 定义类FileOperations，实现IOInterface接口
 */
final class FileOperations implements IOInterface {

    /*定义静态字段filePath，保存文件路径*/
    private static final File filePath = new File("D://java_01/java_txt/07.txt");

    @Override
    public void writeToAFile() {
        /*重写接口writeToAFile方法*/
        BufferedWriter writeFile = null;
        //要添加的文本
        String myText =
                "梦绕神州路。怅秋风、连营画角，故宫离黍。底事昆仑倾砥柱。" +
                "九地黄流乱注。聚万落、千村狐兔。天意从来高难问，况人情、老易悲如许。更南浦，送君去。\n" +
                "凉生岸柳催残暑。耿斜河、疏星淡月，断云微度。万里江山知何处。" +
                "回首对床夜语。雁不到、书成谁与。目尽青天怀今古，肯儿曹、恩怨相尔汝。举大白，听金缕。";
        try {
            try {
                writeFile = new BufferedWriter(new FileWriter(filePath, true));
                //添加
                writeFile.write(myText);
                //刷新
                writeFile.flush();
            } finally {
                //关闭文件对象
                writeFile.close();
            }
        } catch (IOException e) {
            //处理异常
            e.printStackTrace();
        }
    }

    @Override
    public void readTheFile() {
        /*重写接口readTheFile方法*/
        BufferedReader readerFile = null;
        String I;
        try {
            try {
                readerFile = new BufferedReader(new FileReader(filePath));
                while ((I = readerFile.readLine()) != null) {
                    System.out.println(I);
                }
        } finally {
                //关闭文件对象
                readerFile.close();
            }
        } catch (IOException e) {
            //异常处理
            e.printStackTrace();
        }
    }
}