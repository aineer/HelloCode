package java_set.Storageroom_02.Main_09;

/**
 * @author likongqing
 * time：2022/8/29
 */
public class Main {
    public static void main(String[] args) {
        Zero zero = new A();
        Zero zero1 = new B();
        Zero zero2 = new C();

        A a = (A) zero;
        B b = (B) zero1;
        C c = (C) zero2;

        a.a();
        a.zero();
        b.b();
        a.zero();
        c.c();
        c.zero();
    }
}

abstract class Zero {
    public abstract void zero();
}

class A extends Zero {
    @Override public void zero() {

    }

    public void a() {
        System.out.println("A");
    }
}

class B extends Zero {
    @Override public void zero() {

    }

    public void b() {
        System.out.println("B");
    }
}

class C extends Zero {
    @Override public void zero() {

    }

    public void c() {
        System.out.println("C");
    }
}