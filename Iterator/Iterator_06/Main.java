package Iterator.Iterator_06;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int x = 0; x <= 9; x++) {
            System.out.printf("%d", x);
            list.add(x);

        }
    }
}
