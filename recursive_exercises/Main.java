package recursive_exercises;

public class Main {
    public static void main(String[] args) {
        System.out.println(Fibonacci.fibonacci(50));
    }
}

class Fibonacci {
    public static int fibonacci(int l) {
        if(l >= 1) {
            if(l == 1 || l == 2) {
                return 1;
            } else {
                return fibonacci(l-1) + fibonacci(l-2);
            }
        } else {
            System.out.println("错误，必须大于等于1");
        } return -1;
    }
}