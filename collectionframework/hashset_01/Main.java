package collectionframework.hashset_01;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //实例化HashSet对象
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet);
    }
}
