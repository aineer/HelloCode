package java_set.Storageroom_02.Main_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();

        list.add("zero");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

