package java_set.Storageroom_02.Main_06;

public class Main {
    public static void main(String[] args) {
        //向上转型
        A a = new B();

        //向下转型
        B b = (B) a;
        b.b();
        b.a();
    }
}

class A {
    public void a() {
        System.out.println(getClass());
    }
}

class B extends A {
    public void b() {
        System.out.println(getClass());
    }
}