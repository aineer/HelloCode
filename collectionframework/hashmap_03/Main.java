package collectionframework.hashmap_03;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "zero");
        map.put(1, "one");
        for (var i: map.keySet()) System.out.println(i + i);
    }
}
