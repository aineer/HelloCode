package thread.thread_05;

import java.util.TreeSet;

/**
 * @author 李孔庆
 * time 2022/8/8
 */
public class Main {
    public static void main(String[] args) {
        A<Integer> a = new A<>();
        Thread thread = new Thread(a);
        thread.start();
    }
}

class A<T> implements Runnable {
    private T x;
    private T b;

    A() {   };

    @Override
    public void run() {
        class A1 {
            public void a1() {
            }
        }
    A1 a1 = new A1();
        a1.a1();
    }
}
