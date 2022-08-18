package generics.generics_03;

/**
 * 主类
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/
        A<Integer, Double> a = new A<>();
        a.setFieldA(12);
        a.setFieldB(1.3);
        System.out.println(a.getFieldA());
        System.out.println(a.getFieldB());

    }
}

/**
 * 定义泛型类A
 *
 * @param <T>
 * @param <S>
 */
final class A<T, S extends Number> {
    //使用Number来限制类型为数值
    /*泛型类型T, S*/
    private T fieldA;
    private S fieldB;

    public void setFieldA(T fieldA) {
        this.fieldA = fieldA;
    }
    public void setFieldB(S fieldB) {
        this.fieldB = fieldB;
    }

    public T getFieldA() {
        return fieldA;
    }
    public S getFieldB() {
        return fieldB;
    }
}

