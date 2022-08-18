package thread.thread_02;

import java.util.LinkedList;

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
        int x = 0;
        while (x <= 10) {
            System.out.println("zero" + (Thread.currentThread().getName()));
            x++;
        }
    }
}