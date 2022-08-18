package Mankind;

/**
 * 目标: 利用代码抽象人类
 *
 * @author 李孔庆
 * time: 2022.7.7（开始） -> 2022.7.10（完工）
 * Java面向对象抽象的学习
 * 人类有如下功能：
 * 吃饭，喝水，睡觉，学习能力，天赋等等
 *
 * 类结构如下：
 * 1.Main（主类，调用其他类）
 * 2.AbstracHuman（抽象类）
 * 3.Traversal（接口）
 * 4.Ingenious（接口）
 * 5.WellBehaved（接口）
 * 6.Man（继承AbstracHuman的抽象类）
 * 7.Woman（继承AbstracHuman的抽象类）
 * 8.Ming（继承Man的普通类）
 * 9.LiLi（继承Woman的普通类）
 */
public class Main {
    /*主类*/
    public static void main(String[] args) {
        //main方法，调用方法

        /*创建Ming对象*/
        Ming ming = new Ming();
        /*调用方法前调用访问器先设置属性*/
        ming.setHumanName("ming");
        ming.setHumanAge(16);
        ming.setHumanGender('男');
        /*
         *调用ming.commonProperties()方法打印名对象基本信息
         *调用ming.dine()方法打印吃饭信息
         *调用ming.drink()方法打印喝水的信息
         *调用ming.goToBed()方法打印睡觉的信息
         *调用ming.traversal()方法打印自己的能力信息
         */
        ming.commonProperties();
        ming.dine();
        ming.drink();
        ming.goToBed();
        ming.traversal();

        System.out.println();
        /*华丽的分割线*/

        /*创建LiLi对象*/
        LiLi lili = new LiLi();
        /*调用方法前调用访问器先设置属性*/
        lili.setHumanName("LiLi");
        ming.setHumanAge(18);
        ming.setHumanGender('女');
        /*
         *调用ming.commonProperties()方法打印名对象基本信息
         *调用ming.dine()方法打印吃饭信息
         *调用ming.drink()方法打印喝水的信息
         *调用ming.goToBed()方法打印睡觉的信息
         *调用ming.traversal()方法打印自己的能力信息
         */
        ming.commonProperties();
        ming.dine();
        ming.drink();
        ming.goToBed();
        ming.traversal();
    }
}

/**
 *定义一个抽象基类: AbstractHumans，定义一些人类基本的，通用的方法
 *
 * 子类继承该父类实现父类中定义方法
 */
abstract class AbstractHumans {
    /*定义通用的字段属性比如人的名字，年龄，性别 */
    private String humanName;
    private int humanAge;
    private char humanGender;

    AbstractHumans() {
        /*定义无参构造器*/
    }

    public void setHumanName(String humanName) {
        /*设置字段humanName*/
        this.humanName = humanName;
    }

    public void setHumanAge(int humanAge) {
        /*设置字段humanAge*/
        this.humanAge = humanAge;
    }

    public void setHumanGender(char humanGender) {
        /*设置字段humanGender*/
        this.humanGender = humanGender;
    }

    public String getHumanName() {
        /*设置humanName访问器，用来被子类重写*/
        return humanName;
    }

    public int getHumanAge() {
        /*设置humanAge访问器，用来被子类重写*/
        return humanAge;
    }

    public char getHumanGender() {
        /*设置humanGender的访问器，用来被子类重写*/
        return humanGender;
    }
    /*
      下面定义抽象方法dine, drink, goToBed,用来被子类重写
    */
    //人都有吃饭的方法
    abstract void dine();

    //人都有喝水的方法
    abstract void drink();

    //人都有睡觉的方法
    abstract void goToBed();
}

/**
 * 定义穿越能力接口Traversal，继承并实现该接口的方法
 *
 * 人类的扩展能力 -> 穿越时空
 */
interface Traversal {
    /*通过继承实现的方法*/
    void traversal();
}

/**
 * 定义聪明的人类接口Ingenious，继承并实现该接口的方法
 *
 * 人类的扩展能力 -> 聪明的
 */
interface Ingenious {
    /*通过继承实现的方法*/
    void ingenious();
}

/**
 * 定义乖巧的接口Well-behaved，继承并实现该接口的方法
 *
 * 人类的扩展能力 -> 乖巧的
 */
interface WellBehaved{
    /*通过继承实现的方法*/
    void wellBehaved();
}

/**
 * 创建抽象子类Man继承父类AbstractHumans的方法
 *
 * 创建男人类，男人子类都继承该类
 */
abstract class Man extends AbstractHumans {
    @Override
    public String getHumanName() {
        //调用父类 AbstractHumans的getHumanName访问器方法
        return super.getHumanName();
    }

    @Override
    public int getHumanAge() {
        //调用父类AbstractHumans的getHumanAge访问器方法
        return super.getHumanAge();
    }

    @Override
    public char getHumanGender() {
        //调用父类AbstractHumans的getHumanGender访问器方法
        return super.getHumanGender();
    }
}

/**
 * 创建抽象子类Woman继承父类AbstractHumans的方法
 *
 * 创建女人类，女人子类都继承该类
 */
abstract class Woman extends AbstractHumans {
    @Override
    public String getHumanName() {
        //调用父类AbstractHumans的getHumanName访问器方法
        return super.getHumanName();
    }

    @Override
    public int getHumanAge() {
        //调用父类AbstractHumans的getHumanAge访问器方法
        return super.getHumanAge();
    }

    @Override
    public char getHumanGender() {
        //调用父类AbstractHumans的getHumanGender访问器方法
        return super.getHumanGender();
    }
}

/**
 * 创建一个男人ming继承男人类Man
 *
 * 该类将实现父类所有声明为抽象的方法
 */
class Ming extends Man implements Traversal, Ingenious {
    Ming() {
        //定义无参构造器
        super();
    }
    public void commonProperties() {
        /*调用父类的访问器方法*/
        System.out.println("我的名字是" + super.getHumanName());
        System.out.println("我的年龄是" + super.getHumanAge());
        System.out.println("我的性别是" + super.getHumanGender());
    }

    @Override
    public void dine() {
        //重写父类AbstractHumans的抽象方法dine，赋予吃饭的能力
        System.out.println("我有吃饭的能力");
    }

    @Override
    public void drink() {
        //重写父类AbstractHumans的抽象方法drink，赋予喝水的能力
        System.out.println("我有喝水的能力");
    }

    @Override
    public void goToBed() {
        //重写父类AbstractHumans的抽象方法goToBed，赋予睡觉的能力
        System.out.println("我有睡觉的能力");
    }

    @Override
    public void traversal() {
        //重写Traversal接口并实现Traversal接口的方法
        System.out.println("我拥有穿越时空的能力");
    }

    @Override
    public void ingenious() {
        //重写Ingenious接口并实现Ingenious接口的方法
        System.out.println("我很聪明");
    }
}

/**
 * 创建一个LiLi类，继承女人Woman类
 *
 * 该类将实现父类所有声明为抽象的方法
 */
class LiLi extends Woman implements Ingenious, Traversal, WellBehaved {
    LiLi() {
        //定义无参构造器
        super();
    }
    public void commonProperties() {
        /*调用父类的访问器方法*/
        System.out.println("我的名字是" + super.getHumanName());
        System.out.println("我的年龄是" + super.getHumanAge());
        System.out.println("我的性别是" + super.getHumanGender());
    }

    @Override
    public void dine() {
        //重写父类AbstractHumans的抽象方法dine，赋予吃饭的能力
        System.out.println("我有吃饭的能力");
    }

    @Override
    public void drink() {
        //重写父类AbstractHumans的抽象方法drink，赋予喝水的能力
        System.out.println("我有喝水的能力");
    }

    @Override
    public void goToBed() {
        //重写父类AbstractHumans的抽象方法goToBed，赋予睡觉的能力
        System.out.println("我有睡觉的能力");
    }

    @Override
    public void ingenious() {
        //重写Ingenious接口并实现Ingenious接口的方法
        System.out.println("我很聪明");
    }

    @Override
    public void traversal() {
        //重写Traversal接口并实现Traversal接口的方法
        System.out.println("我拥有穿越时空的能力");;
    }

    @Override
    public void wellBehaved() {
        //重写WellBehaved接口并实现WellBehaved接口的方法
        System.out.println("我很乖巧");
    }
}
