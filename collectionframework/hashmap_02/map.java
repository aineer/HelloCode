package collectionframework.hashmap_02;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        /*实例化HashMap对象*/
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"李孔庆");
        //向HashMap添加数据
        System.out.println(hashMap);
    }
}
