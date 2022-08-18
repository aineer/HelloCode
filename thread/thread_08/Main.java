package thread.thread_08;

public class Main {
    public static void main(String[] args) {
        /*main方法*/
        A a = new A();
        Thread thread = new Thread(a);
        thread.setName("zero");
        thread.setDaemon(true);
        System.out.println(thread.getName());
        thread.start();
    }
}

class A implements Runnable {

    private boolean setBool = true;
    private int ar = 0;

    @Override
    public synchronized void run() {
        while (setBool) {
            System.out.println("Hello");
            ++ar;
        }
        if (ar < 50) {
            setBool = false;
            System.out.println("OFF");
        }
    }
}