package collectionframework.TreeSet_01;

import java.util.TreeSet;
import java.util.HashMap;

//TreeSet是有序集合
public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        HashMap<String, String> Map = new HashMap<>();

        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("ef");
        System.out.println(treeSet);
    }
}
