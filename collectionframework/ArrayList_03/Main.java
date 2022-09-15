package collectionframework.ArrayList_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(12);
        ArrayList<Integer> arrayList;
        arrayList = new ArrayList<>(arrayList1);
        System.out.println(arrayList);
        }
    }

