package java_set.Storageroom_01;

public class java_method_01 {
    public static void print(String a) {
        System.out.println(a);
    //有参数无返回值的方法
    }

public static int print_(int z, int c) {
        return z + c;
    //有参数有返回值的java方法
    }

public static void main(String[] args) {
        print("String方法");
        System.out.println(print_(100, 200));
    }
}
