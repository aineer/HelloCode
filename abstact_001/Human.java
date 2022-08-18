package abstact_001;


abstract class Human {
    //定义抽象类Human，抽象类不可被实例化，
    //必须由子类继承后才可以调用
    public abstract void eat();

    public abstract void sleep();
}

class human extends Human {

    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }
}

class Main {
    public static void main(String[] args) {
        Human a = new human();
        a.eat();
        a.sleep();
    }
}


