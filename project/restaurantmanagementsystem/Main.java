package project.restaurantmanagementsystem;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Main方法，程序的入口
 *
 * 目标：用Java语言编写一个餐厅管理系统，有如下功能：
 * 1.欢迎用户/送别用户
 * 2.管理登陆/注册功能
 * 3.点餐功能
 * 4.发布活动通知功能
 * 5.结账功能
 * 6.退出功能
 *
 * 类结构如下：
 * 1.Main（主类）-> 程序的入口，调用其他类
 * 2.UserWelcomeOrFarewell（抽象类） -> 定义基本方法，由子类实现
 * 3.LandingOrEnroll（接口） -> 定义登陆/注册基本方法，由子类实现
 * 4.LoginOrRegister（普通类） -> 实现LandingOrEnroll接口的方法
 * 5.OrderFood（普通类） -> 定义点餐功能，实现Menu（菜单）接口
 * 6.Menu（接口） -> 定义菜单功能
 * 7.WelcomeOrFarewell（普通类） -> 继承UserWelcomeOrFarewell类，实现父类的方法
 * 8.EventNotifications（普通类） -> 定义活动通知类
 * 9.Checkout（普通类） -> 定义结账功能
 * 10.Exit（普通类） -> 定义退出功能
 * 11.Skeleton（普通类） -> 程序的骨架
 *
 * 项目创建时间：2022/7/14
 * 项目最后一次修改时间：2022/7/16
 * @author 李孔庆
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/
        //实例化Skeleton对象
        Skeleton skeleton = new Skeleton();
        skeleton.welcome();
        skeleton.loginOrRegister();
        skeleton.orderFood();
        skeleton.function();
        skeleton.exit();
    }
}

/**
 * 定义一个抽象类UserWelcomeOrFarewell，定义基本方法，由子类继承
 *
 * 定义抽象方法userWelcome和farewell
 * 由子类实现
 */
abstract class UserWelcomeOrFarewell {

    /*定义欢迎用户的方法，声明为抽象*/
    abstract void userWelcome();

    /*定义送别用户的方法，声明为抽象*/
    abstract void farewell();
}

/**
 * 定义用户登陆/注册的接口，由其他类实现
 *
 * 接口中的定义的方法由其他类实现：
 * 定义方法landing -> 由实现类实现用户登陆
 * 定义方法enroll -> 由实现类实现用户注册
 */
interface LandingOrEnroll {

    /*定义用户登陆的方法，声明为抽象*/
    int landing();

    /*定义用户注册的方法，声明为抽象*/
    void enroll();
}

/**
 * 定义Menu（菜单）接口，由实现类类实现
 *
 * 定义menu方法 -> 由实现类实现菜单
 */
interface Menu {

    /*定义菜单方法，声明为抽象*/
    void menu();
}

/**
 * 定义WelcomeOrFarewell类，继承抽象类UserWelcomeOrFarewell，实现父类所有功能
 */
final class WelcomeOrFarewell extends UserWelcomeOrFarewell {

    void userWelcome() {
        /*重写父类userWelcome方法*/
        Date dNow = new Date();
        //实例化Date对象
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));

        System.out.println("\n欢迎光临本餐厅，我是本店的餐厅管理系统");
    }

    void farewell() {
        /*重写父类farewell方法*/
        Date dNow = new Date();
        //实例化Date对象
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));

        System.out.println("\n再见，欢迎下次光临");
    }
}

/**
 * 定义普通类LoginOrRegister实现LandingOrEnroll接口中的所有方法
 * 实现程序登陆or注册逻辑
 */
final class LoginOrRegister implements LandingOrEnroll {

    static ArrayList<Integer> userAccountSystem = new ArrayList<>();

    /*定义ArrayList来保存用户的账号*/
    public int landing() {
        //定义一个计数器变量counter来判断用户是否超时
        int counter = 0;
        /*无限循环*/
        while (true) {
            /*实现接口中的登陆（landing）方法*/
            Scanner userInputObject = new Scanner(System.in);
            //实例化Scanner对象
            System.out.println("输入你的账号（数字）: ");
            int userInput = userInputObject.nextInt();
            //从键盘读取数据
            if (userInput > 0) {
                return 1;
            }

            if (counter > 3) {
                //counter超过3后退出
                System.out.println("输入次数过多，强行退出");
                System.exit(1);
            }

            {
                System.out.println("无效");
                counter += 1;
                //计数器+1
                continue;
            }
        }
    }

    public void enroll() {
        /*实现接口中的注册（enroll）方法*/
        Scanner userInputAccountName = new Scanner(System.in);
        //实例化Scanner对象
        while(true) {

            System.out.println("请输入新的的账户名（数字）: ");
            Integer userInput = userInputAccountName.nextInt();
            //从键盘读取数据
            userAccountSystem.add(userInput);
            //使用add方法将数据添加进ArrayList
            System.out.println("保存成功");
            return;
            }
        }
    }

/**
 * 定义EventNotifications类，通知用户活动
 *
 * EventNotifications类中定义的方法有：
 * notice()方法
 */
final class EventNotifications {
    void notice() {
        /*告知用户新的活动*/
        System.out.println("走过路过不要错过，明天本餐厅打114514折");
    }
}

/**
 * 定义OrderFood类，实现Menu接口
 * 该类负责点餐
 */
final class OrderFood implements Menu {
    @Override
    public void menu() {
        /*重写menu方法*/
        System.out.println("菜单有。。");
    }

    void orderFood() {
        byte counter = 0;
        //定义一个计数器变量counter来判断用户是否超时

        /*定义order food方法，实现点餐*/
        Scanner userInputObject = new Scanner(System.in);
        //实例化Scanner对象
        while(true) {
            System.out.println("请输入你要的菜: ");
            String userInput = userInputObject.next();

            if(userInput != null) {
                return;
                } else if(userInput == null) {
                System.out.println("不可为空");
                counter += 1;
                //counter+1
                continue;
            }
            if(counter > 3) {
                //大于3强行退出
                System.exit(1);
            }
        }
    }
}

/**
 * 定义结账类Checkout实现结账功能
 */
final class Checkout {
    void checkout() {
        System.out.println("你消费了xx");
    }
}

/**
 * 定义Exit类，实现用户退出功能
 */
final class Exit {
     void exit() {
         System.out.println("请稍等...");
         try {
             /*处理异常*/
             Thread.sleep(2000);
             //调用Thread.sleep()让线程暂停2秒
         } catch (InterruptedException e) {
             //处理InterruptedException异常
             System.out.println("程序错误，强行退出");
             System.exit(1);
         }
         System.out.println("退出成功");
         System.exit(0);
         //正常退出
    }
}

/**
 * Skeleton类，程序的骨架，类和类功能的聚合
 */
final class Skeleton {
    /*实例化WelcomeOrFarewell对象*/
    private WelcomeOrFarewell welcomeOrFarewell = new WelcomeOrFarewell();
    /*实例化LoginOrRegister对象*/
    private LandingOrEnroll landingOrEnroll = new LoginOrRegister();
    /*实例化Exit对象*/
    private Exit procedureExit = new Exit();
    /*实例化OrderFood对象*/
    private OrderFood orderFood = new OrderFood();
    /*实例化EventNotifications对象*/
    private EventNotifications activity = new EventNotifications();
    /*实例化Checkout对象*/
    private Checkout checkout = new Checkout();

    void welcome() {
        //调用userWelcome方法来欢迎客人
        welcomeOrFarewell.userWelcome();
    }

    void loginOrRegister() {
        /*登陆or注册or退出*/
        Scanner userInputObject = new Scanner(System.in);
        //创建Scanner对象
        while(true) {
            //无限循环
            System.out.println("1.登陆2.注册3.退出（数字）：");
            int userInput = userInputObject.nextInt();

            switch(userInput) {
                case 1:
                    //登陆
                    landingOrEnroll.landing();
                    return;
                case 2:
                    //注册
                    landingOrEnroll.enroll();
                    continue;
                case 3:
                    //退出
                    procedureExit.exit();
            }
        }
    }

    void orderFood() {
        /*点餐or菜单*/
        Scanner userInputObject = new Scanner(System.in);
        //创建Scanner对象

        while(true) {
            //无限循环
            System.out.println("请输入(1.点餐2.菜单3.退出(数字)): ");
            int userInput = userInputObject.nextInt();
            if(userInput == 1) {
                //调用orderFood方法，实现点餐
                orderFood.orderFood();
                return;
            } else if(userInput == 2) {
                //调用menu方法，实现菜单
                orderFood.menu();
                continue;
            }
        }
    }

    void function() {
        /*实现一系列功能的方法*/
        Scanner userInputObject = new Scanner(System.in);
        //实例化Scanner对象
        while (true) {
            System.out.println("请输入选择(1.看活动2.结账(数字)): ");
            int userInput = userInputObject.nextInt();

            if (userInput == 1) {
                //调用activity.notice()方法
                activity.notice();
                continue;
            } else if (userInput == 2) {
                //调用 checkout.checkout()方法
                checkout.checkout();
                return;
            }
        }
    }

    void exit() {
        /*退出方法*/
        //调用welcomeOrFarewell.farewell()方法输出问候语
        welcomeOrFarewell.farewell();

        //调用 procedureExit.exit()方法退出代码
        procedureExit.exit();
    }
}