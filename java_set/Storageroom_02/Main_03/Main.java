package java_set.Storageroom_02.Main_03;

/**
 * @author 李孔庆
 * time: 2022/7/24
 */
public class Main {
    public static void main(String[] args) {
        /*方法*/
        C<?> c = new C<>();

        c.a();
        c.b();
        c.c();
        c.e();
        c.d();
    }
}
/**
 * 定义泛型抽象基类A
 *
 * 由子类实现定义的抽象方法
 * @param <T>
 */
abstract class A<T> {

    abstract T a();

    abstract T b();
}

/**
 * 定义泛型接口B
 *
 * 由实现类实现具体方法
 * @param <S>
 */
interface B<S> {
    abstract S c();

    abstract S d();
}

/**
 * 定义类B继承抽象类A，实现泛型接口B的所有方法
 */
final class C<S> extends A<String> implements B<Integer> {

    @Override
    String a() {
        return "code";
    }

    @Override
    String b() {
        return "encoding";
    }

    @Override
    public Integer c() {
        return 114;
    }

    @Override
    public Integer d() {
        return 114;
    }

    public S e() {
        return (S)"zero";
    }
}