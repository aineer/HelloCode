package thread.thread_10;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        thread.start();
    }
}

class A implements Runnable {
    @Override
    public void run() {
        class Run {
            public void run1() {
                for (int x = 0; x <= 10; x++) {
                    System.out.println("zero" + x);
                }
            }
            public void run2() {
                for (int x = 0; x <= 10; x++) {
                    System.out.println("one" + x);
                }
            }
            public void run3() {
                for (int x = 0; x <= 10; x++) {
                    System.out.println("two" + x);
                }
            }
        }
    Run run = new Run();
        run.run1();
        run.run2();
        run.run3();
    }
}