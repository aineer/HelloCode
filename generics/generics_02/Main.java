package generics.generics_02;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Generics<String, Integer> generics = new Generics<>(12, "ead");
        //参数化类型
        generics.z();
    }
}

class Generics<T, K> {
    private K zero;
    private T you;

    Generics(K zero, T you) {
        this.zero = zero;
        this.you = you;
    }

    public void z() {
        System.out.println(you);
        System.out.println(zero);
    }
}