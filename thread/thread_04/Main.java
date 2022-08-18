package thread.thread_04;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread thread = new Thread(a);
        Thread thread1 = new Thread(b);

        thread.start();
        thread1.start();
    }
}

class A implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("zero");
        System.out.println(Thread.currentThread().getName());
    }
}

class B implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("zero_02");
        System.out.println(Thread.currentThread().getName());
    }
}