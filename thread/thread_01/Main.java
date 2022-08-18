package thread.thread_01;

/**
 * @author 李孔庆
 * time:2022/8/7
 */
public class Main {
    public static void main(String[] args) {

        thread thread = new thread();
        thread.start();
    }
}

@SuppressWarnings("BusyWait")
class thread extends Thread {
    static int x = 0;
    @Override
    public void run() {
        while (x != 10) {
            System.out.println("zero");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x++;
        }
    }
}
