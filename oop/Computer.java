package oop;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Computer {
    /**计算机类
     * 定义了一台计算机的组成，分别由
     * 计算机名字（型号），计算机生产日期，操作系统，
     * 计算机显卡，计算机cpu（中央处理器），
     * 计算机主板，购买日期
     */
    private String COMPUTER_NAME;
    private int computer_Date_of_manufacture;
    private String computer_os;
    private String computer_graphics;
    private String computer_cpu;

    Computer() {
        //无参构造器默认初始化
        }

    Computer(String COMPUTER_NAME, int computer_Date_of_manufacture,
              String computer_os, String computer_graphics, String computer_cpu) {
        this.COMPUTER_NAME = COMPUTER_NAME;
        this.computer_Date_of_manufacture = computer_Date_of_manufacture;
        this.computer_os = computer_os;
        this.computer_graphics = computer_graphics;
        this.computer_cpu = computer_cpu;
        //有参构造器
    }

    String Computer_Name() {
        //计算机名字
        return COMPUTER_NAME;
    }

    int Computer_Date_of_manufacture() {
        //计算机生产日期
        return computer_Date_of_manufacture;
    }

    String Computer_os() {
        //计算机操作系统
        switch (computer_os) {
            case "windows":
                break;
            case "linux":
                break;
            case "unix":
                break;
            case "mac os":
                break;
            default:
                System.out.println("无法解析参数");
                System.exit(0);
        }
        return computer_os;
    }

    String Computer_graphics() {
        //计算机显卡
        return computer_graphics;
    }

    String Computer_cpu() {
        //计算机cpu
        switch (computer_cpu) {
            /*
            jdk8和jdk17的switch比起来，真是太落后了（
            等学集合框架就用jdk17（
            2022.6.20
             */
            case "i5":
                break;
            case "i7":
                break;
            case "i9":
                break;
            case "i12":
                break;
            case "R5":
                break;
            case "R7":
                break;
            case "R9":
                break;
            default:
                System.out.println("无法识别参数");
                System.exit(0);
        }
        return computer_cpu;
    }

    int[] Computer_Motherboard() {
        //计算机购买日期
        int[] user_input_array = new int[3];

        Scanner user_input_year = new Scanner(System.in);
        System.out.println("请输入你的计算机购买日期: ");
        int year = user_input_year.nextInt();
        //添加year进入数组
        user_input_array[0] = year;

        return user_input_array;
    }

    //主函数
    public static void main(String[] args) {
        Computer computer = new Computer("my_computer", 2020,
                "windows", "3090", "i12");

        System.out.println("我的计算机的名字是" + computer.Computer_Name());
        System.out.println("生产日期是" + computer.computer_Date_of_manufacture + "年");
        System.out.println("系统是" + computer.Computer_os());
        System.out.println("显卡是" + computer.computer_graphics);
        System.out.println("cpu是" + computer.computer_cpu);
        System.out.println("购买日期是" + computer.Computer_Motherboard()[0]);
    }
}