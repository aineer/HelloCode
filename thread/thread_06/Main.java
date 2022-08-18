package thread.thread_06;

public class Main {
    public static void main(String[] args) {
        /*main方法*/

        A1 a = new A1();
        A2 a2 = new A2();
        Thread thread = new Thread(a2);
        Thread thread2 = new Thread(a);
        thread.start();
        thread2.start();
    }
}

/**
 * 定义类A1，实现Runnable接口
 */
class A1 implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("t1");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
    }
}

class A2 implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("t2");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    }
}