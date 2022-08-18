package lnterfece_practice_003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}

interface AdditionInterFace {
    //实现加法运算的接口
    void addition();
    //数字的相加
}
interface Subtraction {
    //实现减法运算的接口
    void subtraction();
    //数字的相减
}
interface MuItIpIiCation {
    //实现乘法运算的接口
    void multiplication();
    //数字的相乘
}
interface Division {
    //实现除法运算的接口
    void division();
    //数字的相除
}

class Operation {
    /**实现加减乘除运算，
     * 是的，我太菜了，
     * 功能十分不完善，
     * 十分垃圾的四则运算计算器
     * 2022.6.25 4.08
     */
    public int operation() {
        while (true) {
            Scanner x = new Scanner(System.in);
            int bl = x.nextInt();
            System.out.println("请输入你的选择(数字): ");
            System.out.println("1.加法2.减法\n3.乘法4.除法");

            switch (bl) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                default:
                    System.out.println("你的输入无效，请重新输入");
                    continue;
            }
        }
    }
}

