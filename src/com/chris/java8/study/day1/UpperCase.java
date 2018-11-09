package com.chris.java8.study.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCase {


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "friend", "mary", "orange", "nike");
        List<String> strings1 = new ArrayList<>();
        strings.forEach(string -> System.out.println(string.substring(0,1).toUpperCase() + string.substring(1)));
        System.out.println("-----------------------------------");

        strings.forEach(string -> strings1.add(string.toUpperCase()));
        strings1.forEach(item -> System.out.println(item));
        System.out.println("------------------------------------");

        strings.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        System.out.println("------------------------------------");

        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
