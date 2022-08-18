package Iterator.Iterator_05;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /*main方法*/

        List<String> list = new ArrayList<>();

        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<String> iterator = list.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next());


        }
    }
}
