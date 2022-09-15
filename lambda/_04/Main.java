package lambda._04;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.append(Main.class.getName());
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
