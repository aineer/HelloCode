package collectionframework.hashmap_01;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        //初始化HashMap

        map.put("w",1);
        for (String i : map.keySet()) {
            System.out.println(i);
        }
    }
}
