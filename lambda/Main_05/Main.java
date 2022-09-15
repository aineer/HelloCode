package lambda.Main_05;

public class Main {
    public static void main(String[] args) {
        A a = System.out::println;
    }
}


@FunctionalInterface
interface A {
    public void a();
}