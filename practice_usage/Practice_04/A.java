package practice_usage.Practice_04;

import java.util.Iterator;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.a();
    }
}

public class A {
    ArrayList<Integer> list = new ArrayList<>();

    void a() {
        list.add(1);
        list.add(2);
        list.add(3);

        //        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

