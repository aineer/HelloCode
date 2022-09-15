package lambda._01;

public class Main {
    public static void main(String[] args) {
        A c = (a, b) -> {
            System.out.println("Hello,Would!");
            System.out.println(a * b);
        };
    c.a(12, 12);
    }
}

/**
 * 定义一个函数式接口
 */
@FunctionalInterface
interface A {

    void a(int a, int b);
}