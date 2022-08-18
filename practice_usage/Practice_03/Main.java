package practice_usage.Practice_03;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.a(100);
    }
}

class A {
    public void a(int j) {
        if (j > 10) {
            a(j - 1);
        } System.out.println(j);
        //return j;
    }
}