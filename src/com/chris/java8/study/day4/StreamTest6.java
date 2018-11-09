package com.chris.java8.study.day4;

import java.util.Arrays;
import java.util.List;

public class StreamTest6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "city");

//        list.stream().filter(i -> i.length() == 5).limit(1).forEach(System.out::println);
        list.stream().mapToInt(item -> {
            System.out.println(item);
            return item.length();
        }).findFirst().ifPresent(System.out::println);
    }
}
