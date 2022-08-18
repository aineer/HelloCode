package java_set.Storageroom_01;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入1进入，输入2退出：");
        int a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println("进入了，成功");
                break;

            case 2:
                System.out.println("退出成功");
                System.exit(0);
                break;

            case 3:
                System.out.println("输入无效");
                break;

            default:
                System.out.println("无效");
                break;
        }

        System.out.println("你好");
        System.out.println("1.点餐\n2.菜单\n3.退出");

        String[] cd = new String[] {"米饭", "鱼", "菜", "水果"};
        //定义一个string数组，存储菜单

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("请选择你的服务（输入数字）");
            System.out.println("请选择");
            int i = input.nextInt();


            if (i == 1) {
                Scanner z = new Scanner(System.in);
                String y = z.next();
                System.out.println("请选择(菜名)：（不知道请输入a退出看菜单）：");

                switch (y) {
                    case "米饭":
                        System.out.println("好的");
                        break;
                    case "鱼":
                        System.out.println("请等待");
                        break;
                    case "菜":
                        System.out.println("来了来了");
                        break;
                    case "水果":
                        System.out.println("请等等");
                        break;
                    case "a":
                        System.out.println("退出成功");
                        continue;
                    default:
                        System.out.println("无效");
                        break;
                }

                System.out.println("你的饭菜好了，请享用");
                dl: while (true) {
                    System.out.println("1.看时间\n2.结账");
                    //if判断

                    Scanner v = new Scanner(System.in);
                    System.out.println("请选择(数字)：");
                    int m = v.nextInt();

                    if(m == 1) {
                        Date date = new Date();
                        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
                        System.out.print("时间是" + dateFormat.format(date));
                        break dl;

                    } else if (m == 2) {
                        System.out.println("花费5$");
                        System.out.println("成功");
                        System.exit(0);
                    }
                }
            } else if (i == 2) {
                System.out.println("菜单有：");
                for (int x = 0; x < cd.length; x++) {
                    System.out.println(cd[x]);
                    if (x > cd.length) {
                        break;
                    }
                }
            } else if (i == 3) {
                System.out.println("退出成功");
                System.exit(0);
            } else {
                System.out.println("无效的输入");
                break;
            }
        }
    }
}
