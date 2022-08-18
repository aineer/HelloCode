package collectionframework.ArrayList_01;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //ArrayList.set方法，第一个是索引，第二个是新值
        list.set(0, 5);
        list.remove(0);
        //size()方法获取元素数量
        //clear()方法删除arraylist中的所有元素
        //sort()方法等arraylist排序
        System.out.println(list.isEmpty());


    }
}