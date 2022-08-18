package generics.generics_05;

/**
 * @author 李孔庆
 * time 2022/7/22
 */
public class Main {
    public static void main(String[] args) {
        /*Main方法*/
        Human<String, Integer, Character> lili = new Human<>();
        lili.setName("lili");
        lili.setArg(16);
        lili.setGender('女');
        lili.print();
    }
}

/**
 * 定义泛型类Human
 *
 * @param <T>
 * @param <S>
 */
final class Human<T extends String, S extends Number,
        G extends Character> {
    /*定义一些人类的通用子段*/
    private T name;
    private S arg;
    private G gender;

    public void setName(T name) {
        this.name = name;
    }
    public void setArg(S arg) {
        this.arg = arg;
    }
    public void setGender(G gender) {
        this.gender = gender;
    }
    public T getName() {
        return name;
    }
    public S getArg() {
        return arg;
    }
    public G getGender() {
        return gender;
    }

    public void print() {
        System.out.println(this.name.getClass().getName());
        System.out.println(this.arg.getClass().getName());
        System.out.println(this.gender.getClass().getName());
    }
}