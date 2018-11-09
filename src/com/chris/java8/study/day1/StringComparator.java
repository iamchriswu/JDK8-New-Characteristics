package com.chris.java8.study.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhang", "li", "wang", "zhao");

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        list.forEach(item -> System.out.println(item));

        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        list.forEach(System.out::println);


    }
}
