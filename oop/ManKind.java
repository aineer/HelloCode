package oop;

public class ManKind {
    private String name;
    private int age;
    private String like;

    ManKind(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }
    String mankind_name() {
        //人类的名字
        return "我的名字是" + this.name;
    }
    String mankind_age() {
        //人类的年龄
        return "我的年龄是" + this.age + "岁";
    }
    String mankind_like() {
        //人类的爱好
        return "我喜欢" + this.like;
    }

    public static void main(String[] args) {
        //人类对象
        ManKind mankind = new ManKind("李孔庆", 16, "java和python");
        System.out.println(mankind.mankind_name());
        System.out.println(mankind.mankind_age());
        System.out.println(mankind.mankind_like());
    }
}
