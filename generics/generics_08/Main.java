package generics.generics_08;

/**
 * @author 李孔庆
 * time: 2022/7/29
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/
        A<String> a = new A<>();
        a.setA("z");
        System.out.println(a.getA());
    }
}

class A<T> {
    private T a;

    A() {   }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }
}