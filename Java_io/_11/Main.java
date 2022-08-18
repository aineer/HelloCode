package Java_io._11;

import java.io.File;
import java.io.Writer;
import java.io.Reader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 李孔庆
 * time: 2022/8/2
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        MyFile myFile = new MyFile();
        myFile.fileWrite();
        myFile.fileRead();
    }
}

/**
 * 打印MyFile类，创建两个方法，
 *
 * void fileWrite();
 * 实现文件写入
 * void fileRead();
 * 实现文件读取
 */
final class MyFile {
    /*静态的属性fileAddress*/
    private static final String fileAddress = "D://java_01/java_txt/05.txt";

    /*文件写入*/
    public void fileWrite() {
        //创建文件对象
        File myFile = new File(fileAddress);
        //初始化Writer,扩大对象作用域
        Writer myWriter = null;
        try {
            try {
                myWriter = new FileWriter(myFile);
                myWriter.write("大江东去，浪淘尽，千古风流人物。\n" +
                        "故垒西边，人道是，三国周郎赤壁。\n" +
                        "乱石穿空，惊涛拍岸，卷起千堆雪。\n" +
                        "江山如画，一时多少豪杰。\n" +
                        "\n" +
                        "遥想公瑾当年，小乔初嫁了，雄姿英发。\n" +
                        "羽扇纶巾，谈笑间，樯橹灰飞烟灭。\n" +
                        "故国神游，多情应笑我，早生华发。\n" +
                        "人生如梦，一尊还酹江月");
                //刷新
                myWriter.flush();
            } finally {
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*文件读取*/
    public void fileRead() {
        //创建文件对象
        File myFile = new File(fileAddress);
        //初始化Reader对象
        Reader myReader = null;
        int text = 0;
        try {
            try {
                myReader = new FileReader(myFile);
                while ((text = myReader.read()) != -1) {
                    //显示读取的内容
                    System.out.print((char) text);
                }
            } finally {
                myReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}