package generics.generics_09;

public class Main {
    public static void main(String[] args) {
        A<Number> a = new A<Number>();
        a.run2("");
    }
}

final class A<T> {
    public void run(T zero) {
        System.out.println(zero);
    }

    public<T> void run2(T zero) {
        System.out.println(zero);
    }
}