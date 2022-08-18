package InnerClasses_001.practice_05;

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.C();
    }
}

interface Z {
    void print();
}

abstract class X {
    abstract String print(String a);
}

class A {
    /*匿名内部类的使用*/
     final void ma() {
         new Z() {
             @Override
             public void print() {
                System.out.println("aa");
             }
         };
     }
    final void C() {
         X x = new X() {
            @Override
            String print(String a) {
                return a;
            }
         };
         x.print("");
         System.out.println(x.print("l"));
    }
}

