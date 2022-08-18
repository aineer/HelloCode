package practice_usage.Practice_02;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * @author 李孔庆
 * time：2022/7/22
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator iterator = list.iterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
    }
}
