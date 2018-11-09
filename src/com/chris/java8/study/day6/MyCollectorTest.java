package com.chris.java8.study.day6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollectorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "hi", "apple", "list", "netty");

//        Set<String> set = list.stream().collect(new MySetCollector<>());
//        System.out.println(set);

        Map<String, String> map = list.stream().collect(new MyMapCollector<>());
        System.out.println(map);
    }
}
