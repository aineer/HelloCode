package practice_usage.Practice_05;

public class Main {
    public static void main(String[] args) {
        Class a = A.class;
        System.out.println(a.getClasses());
        System.out.println(a.getName().getClass());
        a.getDeclaredAnnotations();
    }
}

class A {
    void a() {
        System.out.println("JVM");
    }
}