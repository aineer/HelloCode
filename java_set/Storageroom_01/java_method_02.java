package java_set.Storageroom_01;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class java_method_02 {

    public static void Welcome() {
        //欢迎方法，来欢迎客人
        System.out.println("客人，你好，欢迎来到我们餐厅");
        System.out.println("请跟我来");
    }
    public static void _input() {
        System.out.println("1.点餐\n2.菜单\n3.退出");
    }
    public static void serve() {
        //引用input方法
        Scanner user_input = new Scanner(System.in);
        System.out.println("请输入你要的服务(数字): ");
        int x = user_input.nextInt();
        System.out.println(x);
        switch(x) {
            case 1:
            case 2:
                return;
            case 3:
                System.out.println("好的，您慢走");
                System.exit(0);
            default:
                System.out.println("你的输入无效");
                System.exit(114514);
        }
    }
    public static void user_input() {
        System.out.println("1.酒\n2.米饭\n3.菜\n");
    }
    public static void if_input_food() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("输入你要的菜名(数字): ");
        System.out.println(x);
        switch (x) {
            case 1:
                System.out.println("您稍等");
                break;
            case 2:
                System.out.println("请等");
                break;
            case 3:
                System.out.println("请等等");
                break;
            default:
                System.out.println("你的输入无效");
                System.exit(114514);
        }
    }
    public static void serving() {
        //上菜
        System.out.println("你的菜好了，请用");


        b: while (true) {
            System.out.println("1.结账\n2.看时间");
            Scanner i = new Scanner(System.in);
            int j = i.nextInt();
            //初始化i
            System.out.println("请输入你的服务(数字) ");
            if (j == 1) {
                break;
            } else if (j == 2) {
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
                System.out.println("时间是" + dateFormat.format(date));
                break b;
            } else {
                System.out.println("输入无效");
                System.exit(114514);
            }
        }
    }
    public static int Checkout(int x) {
        System.out.println("你一共消费"+ x + "元");
        //返回 x（消费金额）
        return x;
    }
    public static int Good_bye(int telephone) {
        System.out.println("客人bye,bye");
        System.out.println("我们的电话是" + telephone + "欢迎你下次再来");
        //返回电话号码 telephone的值
        return telephone;
    }
    public static void main(String[] args) {
        //main方法
        Welcome();
        _input();
        serve();
        user_input();
        if_input_food();
        serving();
        System.out.println(Checkout(114514));
        System.out.println(Good_bye(114514));
    }
}

