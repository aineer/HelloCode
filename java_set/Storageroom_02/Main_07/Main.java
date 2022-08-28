package java_set.Storageroom_02.Main_07;

public class Main {
    public static void main(String[] args) {
        //发生向下转型的前提是先发生向上转型(只有向上转型之后才可以向下转型)
        A b1 = new B();
        A c1 = new C();
        B b2 = (B) b1;
        C c2 = (C) c1;

        b2.b();
        c2.c();
    }
}

interface A {
    public abstract void print();
}

class B implements A {
    @Override public void print() {
        System.out.println(getClass().getName());
    }
    public void b() {
        System.out.println("B");
    }
}

class C implements A {
    @Override public void print() {
        System.out.println(getClass().getName());
    }
    public void c() {
        System.out.println("C");
    }
}