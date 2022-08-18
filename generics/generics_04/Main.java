package generics.generics_04;

public class Main {
    public static void main(String[] args) {
        /*Main方法*/
        A<String, ?> a = new A<>("sv", 1);
        System.out.println(a.getZ());
        System.out.println(a.getD());
    }
}

/**
 * 定义泛型类A
 *
 * @param <T>
 * @param <S>
 */
class A<T extends String, S> {
    private T d;
    private S z;

    A(T d, S z) {
        this.d = d;
        this.z = z;
    }

    T getD() {
        return d;
    }

    S getZ() {
        return z;
    }
}