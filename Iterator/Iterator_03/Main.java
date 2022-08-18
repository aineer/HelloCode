package Iterator.Iterator_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * @author 李孔庆
 * time: 2022/7/30
 */
public class Main {
    public static void main(String[] args) {
        /*main方法*/
        int[] arr = new int[5];
        /*创建数组arr*/

        List<Integer> myList = new ArrayList<>();
        for (int x: arr) {
            myList.add(x);
            //把数组arr元素添加到myList
            System.out.println(myList);
            Iterator<Integer> iterator = myList.iterator();
            //创建myList迭代器对象

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}

