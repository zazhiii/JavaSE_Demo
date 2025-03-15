package com.zazhiii.ArrayList;

import java.util.*;

/**
 * @author zazhi
 * @date 2025/3/8
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) {
//        Integer[] a = {1, 2, 3, 4, 5};
//        List<Integer> list = Arrays.asList(a);
//        System.out.println(list); // [1, 2, 3, 4, 5]
//        a[0] = 100;
//        System.out.println(list); // [100, 2, 3, 4, 5]

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        Integer[] a = list.toArray(new Integer[list.size()]);
//
//        System.out.println(Arrays.toString(a)); // [1, 2, 3]
//        list.set(0, 100);
//        System.out.println(Arrays.toString(a)); // [1, 2, 3]

//        LinkedList<Integer> list = new LinkedList<>();

        List<Integer> list1 = Collections.synchronizedList(new ArrayList<>());
        List<Integer> list2 = Collections.synchronizedList(new LinkedList<>());

    }
}
