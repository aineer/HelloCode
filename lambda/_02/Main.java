package lambda._02;

public class Main {
    public static void main(String[] args) {
        B s = System.out::println;
        s.a("Hello");

        C c = A::new;
        c.a(12, 12);

        A a = new A();
        c.a(12, 12);
    }
}

class A {
    private int one;
    private int two;

    A() {   }

    A(int one) {
        this.one = one;
    }

    A (int one, int two) {
        this.one = one;
        this.two = two;
    }

    public void a() {
        System.out.println("Hello");
    }
}

@FunctionalInterface
interface B {

    public void a(String a);
}

@FunctionalInterface
interface C {

    public void a(int a, int b);
}