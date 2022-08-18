package thread.thread_07;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        thread.setDaemon(true);
        thread.start();


    }
}

class A implements Runnable {
    @Override
    public void run() {
        System.out.println("ss");
    }
}