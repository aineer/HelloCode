package java_set.Storageroom_01;


import java.util.Scanner;


public class java_method_03 {
    static int[] array = new int[]{};
    /**学生管理系统，该系统由4大结构组成
     * 1.外部系统
     * 2.登陆管理系统
     * 3.学生管理系统内部
     * 4.退出结构
     * 2022.6.13
     */
    public static void Welcome() {
        //外部系统，用来欢迎和接受用户
        System.out.println("你好，欢迎你使用本校学生管理系统");
        System.out.println("1.进入\n2.退出");
        Scanner a = new Scanner(System.in);
        //实例化Scanner类
        System.out.println("请输入（数字）: ");
        int x = a.nextInt();
        switch (x) {
            case 1:
                return;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("输入无效");
                System.exit(0);
        }
    }
    public static int LanDing() {
        //登陆，注册系统

        while (true) {
            Scanner x = new Scanner(System.in);
            System.out.println("1.登陆\n2.注册\n请输入（数字）: ");
            int j = x.nextInt();

            if (j == 1) {
                Scanner input_ = new Scanner(System.in);
                System.out.println("请输入你的密码: ");
                int l = input_.nextInt();
                for (int i = 0; i< array.length; i++) {
                    if (j == array[i]) {
                        return i;
                    }
                }
            }
        }
    }
}