package InnerClasses_001.practice_02;



public class InnerClass {
    static class A {
         void a() {
            System.out.println("内部类");
        }
    }
    public void b() {
        class B {
            void b() {
            System.out.println("a");
            }
        }
        B z = new B();
        z.b();
    }
}

class Main {
    public static void main(String[] args) {
        InnerClass.A b = new InnerClass.A();
        b.a();

        InnerClass a = new InnerClass();
        a.b();
    }
}