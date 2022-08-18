package lnterface_practice_004;

import java.util.Locale;
import java.util.Scanner;

/**
 * 计算机程序的构造
 * 主体是一台计算机（有功能和模块）
 * 要隐藏细节，提供可扩展的接口
 */
public class Main {
    public static void main(String[] args) {
        /*入口函数*/
        ComputerOs computer_os = new ComputerOs();
        computer_os.getUserManager();
        computer_os.getExplorer();
        computer_os.getTaskManager();
    }
}

/**
 * 定义异常
 * 用户点击错误会抛出该异常
 */
class UserException extends RuntimeException {
    UserException() {
        //无参构造器，super将重写父类方法
        super();
    }
    UserException(String message) {
        //super重写父类方法，自定义异常类
        super(message);
    }
}

/**
 * 计算机os（操作系统）类
 * 属于软件
 */
class ComputerOs {
    /*资源管理器，任务管理器，用户管理器*/
    String Explorer;
    String TaskManager;
    String UserManager;
    ComputerOs() {

    }
    public void setExplorer(String Explorer) {
        /*设置 Explorer*/
        this.Explorer = Explorer;
    }
    public final String getExplorer() {
        /*访问Explorer*/
        if (Explorer == null) {
            System.out.println("错误，不可为空");
            System.exit(0);
        }

        return this.Explorer;
    }
    public void setTaskManager(String TaskManger) {
        this.TaskManager = TaskManger;
    }
    public final String getTaskManager() {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("请输入你要添加的任务名（不可为空）：");
        String input = UserInput.next();
        if (input == null) {
            System.out.println("错误，不可为空");
            System.exit(0);
        }
        System.out.println("成功");
        return this.TaskManager;
    }
    public void setUserManager(String UserManager) {
        this.UserManager = UserManager;
    }
    public final String getUserManager() {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("请输入你要添加的用户名（不可为空）：");
        String input = UserInput.next();
        if (input == null) {
            System.out.println("错误，不可为空");
            System.exit(0);
        }
        System.out.println("成功");
        return this.TaskManager;
    }
}

