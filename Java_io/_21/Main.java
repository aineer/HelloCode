package Java_io._21;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 一个简单的代码机器人
 *
 * 提供简单的功能，玩法，类结构如下:
 * 1.Main ->主类
 * 2.PictureCopy ->图片copy
 * 3.FileWriteOrRead ->写入txt文件or读取txt文件
 * 4.Time ->看时间，日期等等功能
 * 5.Exit -> 退出
 * 6.ClassBody ->类主体
 * 7.DoNotOpen ->不要打开
 *
 * @author 李孔庆
 * time:2022/8/9
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/

        FileWriteOrRead fileWriteOrRead = new FileWriteOrRead();
        PictureCopy copy = new PictureCopy();
        Time myTime = new Time();
        DoNotOpen myChat = new DoNotOpen();
        PictureCopy pictureCopy = new PictureCopy();
        Exit exit = new Exit();

        int counter = 0;
            //用来计数的变量初始化为0，输入错误超过3次就抛出异常
            /*功能调用*/
        while (true) {
            Scanner Input = new Scanner(System.in);
            //实例化Scanner对象，根据输入来执行相应的代码
            System.out.print("(1.写入文件2.读取文件3.复制图片文件4.日期和时间5.不要打开6.退出)\n请输入（数字）：");
            int userInput = Input.nextInt();

            switch (userInput) {
                case 1:
                    fileWriteOrRead.write();
                    continue;
                case 2:
                    fileWriteOrRead.read();
                    continue;
                case 3:
                    copy.enterTheAddress();
                    copy.pictureCopy();
                    continue;
                case 4:
                    myTime.time();
                    continue;
                case 5:
                    myChat.noOpen();
                    continue;
                case 6:
                    exit.exit();
                default:
                    System.out.println("你的输入无效，请重写输入");
                    ++counter;
                    if (counter == 3) {
                        throw new EnterInvalidException("输入次数过多");
                    } continue;
            }
        }
    }
}

/**
 * 定义EnterInvalidException异常类，
 * 输入错误次数过多抛出该异常
 */
class EnterInvalidException extends RuntimeException {
    EnterInvalidException() {
        //无参构造器
        super();
    }
    EnterInvalidException(String message) {
        //调用父类方法
        super(message);
    }
}

/**
 * 图片copy功能实现类
 */
final class PictureCopy {
    //定义静态方法来把user输入的地址存放到StringArray
    private final String[] myStringArray = new String[2];

    /*输入图片地址*/
    public void enterTheAddress() {
        int counter = 0;
        //用来计数的变量初始化为0，输入错误超过3次就抛出异常
        Scanner Input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要复制的图片地址: ");
            String userInput = Input.next();

            System.out.println("请输入复制后的图片地址: ");
            String copyInput = Input.next();

            if (userInput != null && ! userInput.equals("")
                && copyInput != null && !copyInput.equals("")) {
                //return到pictureCopy()方法
                return;
            } else {
                System.out.println("输入的地址不可为空或null");
                ++counter;
                if (counter == 3) {
                    throw new EnterInvalidException("输入次数过多");
                }
            } continue;
        }
    }

    /*图片copy*/
    public void pictureCopy() {
        //要复制的图片地址
        File myFile = new File(myStringArray[0]);
        //复制后的图片地址
        File copyFile = new File(myStringArray[1]);

        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        byte[] bytes = new byte[1024];
        var bl = 0;

        try {
            try {
                bis = new BufferedInputStream(new FileInputStream(myFile));
                bos = new BufferedOutputStream(new FileOutputStream(copyFile));

                while ((bl = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, bl);
                }
            } finally {
                bos.close();
                bis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } System.out.println("复制成功");
    }
}

/**
 * 写入文件or读取文件
 */
final class FileWriteOrRead {
    private final static Scanner input = new Scanner(System.in);
    //写入文件
    public void write() {
        System.out.println("请输入你要写入的文件（地址）：");
        String userInput = input.next();

        File myFile = new File(userInput);
        Writer writer = null;
        try {
            try {
                writer = new BufferedWriter(new FileWriter(myFile));
                System.out.print("请输入内容: ");
                String nextInput = input.next();

                if (nextInput != null && ! nextInput.equals("")) {
                    writer.append(nextInput);
                    System.out.println("写入成功");
                } else {
                    System.out.println("输入的地址不可为空或null");
                }
            } finally {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //读取文件
    public void read() {
        System.out.println("请输入要读取文件的地址: ");
        String userInput = input.next();

        File myFile = new File(userInput);
        BufferedReader reader = null;
        String bl = null;
        try {
            try {
                reader = new BufferedReader(new FileReader(myFile));
                while ((bl = reader.readLine()) != null) {
                    //输出
                    System.out.println(bl);
                }
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 查看日期和时间
 */
final class Time {
    public void time() {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));
    }
}

/**
 * 小彩蛋
 */
final class DoNotOpen {
    public void noOpen() {
        System.out.println("都叫你不要打开了");
        System.exit(114514);
    }
}

/**
 * 退出功能
 */
final class Exit {
    public void exit() {
        System.out.println("退出成功");
        System.exit(0);
    }
}

