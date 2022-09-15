package lambda._03;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = a::a;
        b.b(100);
    }
}

class A {
    public int a(int a) {
        return a;
    }
}

@FunctionalInterface
interface B {
    public void b(int a);
}