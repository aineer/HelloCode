package Iterator.Iterator_01;

import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int[] a = {1,2,3,4,5,6};
        for (int i = 0; i <= a.length; i++) {
            list.add(i);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        }
    }

