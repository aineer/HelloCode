package generics.generics_07;

/**
 * @author 李孔庆
 * time：2022/7/22
 */
public class Main {
    public static void main(String[] args) {
        /*Main方法*/
        A<String, Integer> a = new B();
        A<Double, String> b = new C();

        a.a("Hello, Would!");
        a.b(114514);

        b.a(114.514);
        b.b("Hello, Java");
    }
}

/**
 * 定义泛型接口A
 *
 * @param <T>
 */
interface A<T, S> {
    T a(T t);

    S b(S s);
}

/**
 * 定义类B，实现接口A的泛型方法
 */
class B implements A<String, Integer> {

    @Override
    public String a(String t) {
        return t;
     }

    @Override
    public Integer b(Integer s) {
        return s;
    }
}

/**
 * 定义类C，实现泛型接口A的泛型方法
 */
class C implements A<Double, String> {

    @Override
    public Double a(Double t) {
        return t;
    }

    @Override
    public String b(String s) {
        return s;
    }
}