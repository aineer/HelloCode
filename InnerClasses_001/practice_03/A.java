package InnerClasses_001.practice_03;

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.b();
    }
}

public class A {
    private final int z = 10;
    void b() {
        final class AA {
            private final int z = 10;
            void b() {
                System.out.println(A.this.z);
            }
        }
    /*调用成员内部类AA*/
    AA aa = new AA();
    aa.b();
    }
}
