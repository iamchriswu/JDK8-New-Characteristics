package com.chris.java8.study.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Chris", "World", "Welcome");

//        list.sort(Comparator.naturalOrder());
//
//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
//        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());

//        list.sort(Comparator.comparingInt(String::length).reversed());

//        list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
        list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));



        System.out.println(list);
    }
}
