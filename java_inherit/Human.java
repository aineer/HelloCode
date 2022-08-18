package java_inherit;

import java.util.HashMap;

public class Human {
    /**
     * 定义了人类的一些基本属性，
     * 名字（name），年龄（arg），性别（gender），
     * 爱好（like），国籍（nationality）
     *
     * 用来继承
     * 人类（基类） -> 男人（子类），女人（子类）...
     */
    private String human_name;
    private int human_arg;
    private char human_gender;
    private String human_like;
    private String nationality;

    Human() {
        //无参构造器
    }

    public void setHumaName(String human_name) {
        this.human_name = human_name;
    }
    public void setHumanArg(int human_arg) {
        this.human_arg = human_arg;
    }
    public void setHumanGender(char human_gender) {
        this.human_gender = human_gender;
    }
    public void setHumanLike(String human_like) {
        this.human_like = human_like;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getHumanName() {
        return this.human_name;
    }
    public int getHumanArg() {
        return this.human_arg;
    }
    public char getHumanGender() {
        return human_gender;
    }
    public String getHumanLike() {
        return human_like;
    }
    public String getNationality() {
        return nationality;
    }
}


class Man extends Human {
    //男人类，继承基类human
    private String ability;
    //定义字段ability（能力）

    Man() {

    }

    Man(String ability) {
        this.ability = ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void getAbility() {
        System.out.println("我的特长是" + this.ability);
    }

    void man_attribute() {
        System.out.println("我的名字是" + super.getHumanName());
        System.out.println("我的年龄是" + super.getHumanArg());
        System.out.println("我的性别是" + super.getHumanGender() + "性");
        System.out.println("我喜欢" + super.getHumanLike());
        System.out.println("我的祖国是" + super.getNationality());
    }
}


class Woman extends Human {
    //女人类，继承基类human
    private String ability;
    //定义字段ability（能力）

    Woman() {

    }

    Woman(String ability) {
        this.ability = ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void getAbility() {
        System.out.println("我的特长是" + this.ability);
    }

    void man_attribute() {
        System.out.println("我的名字是" + super.getHumanName());
        System.out.println("我的年龄是" + super.getHumanArg());
        System.out.println("我的性别是" + super.getHumanGender() + "性");
        System.out.println("我喜欢" + super.getHumanLike());
        System.out.println("我的祖国是" + super.getNationality());
    }
}


class Main {
    public static void main(String[] args) {
        /* main方法
         * java的一个继承小实验，
         * 不支持多继承反而保护了代码的安全性，可读性和可维护性
         * 减少了不必要的麻烦
         * 感叹java的封装性和安全性，
         * 我真是越来越喜欢java这门语言了
         * 2022.6.22
         */
        Man Amy = new Man();
        //创建男人类对象
        Amy.setHumaName("李孔庆");
        Amy.setHumanArg(16);
        Amy.setHumanGender('男');
        Amy.setHumanLike("写代码");
        Amy.setNationality("中国");
        Amy.setAbility("null");
        Amy.getAbility();
        Amy.man_attribute();

        System.out.println();

        Woman mik = new Woman();
        //创建女性对象
        mik.setHumaName("孙萌");
        mik.setHumanArg(15);
        mik.setHumanGender('女');
        mik.setHumanLike("null");
        mik.setNationality("中国");
        mik.setAbility("null");
        mik.getAbility();
        mik.man_attribute();
    }
}
