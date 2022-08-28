package thread.thread_11;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        thread.setName("zero");
        thread.start();
    }
}

class A implements Runnable {
    @Override public synchronized void run() {
        for(int x = 0; x <= 10; x++) {
            System.out.println(x);
        }
    }
}