package java_set.Storageroom_02.Main_08;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        b.a1();

    }
}

class A {
    public void a() {
        System.out.println(getClass().getName());
    }
}

class B extends A {
    @Override public void a() {
        System.out.println(getClass().getName());
    }

    public void a1() {
        System.out.println(getClass().getName());
    }
}