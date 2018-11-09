package com.chris.java8.study.day4;

import java.util.Arrays;
import java.util.List;

public class StreamTest8 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("Mary", "Kris", "Lion", "Jack");

        list1.stream().flatMap(item -> list2.stream().map(name -> item + " " + name)).forEach(System.out::println);
    }
}
