package practice_usage.Practice_01;

public class A {
    //练习重写
    public int a() {
        return 1;
    }
}

class B extends A {
    @Override
    public int a() {
        return 1;
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a());
        A a = new A();
        a.a();
    }
}