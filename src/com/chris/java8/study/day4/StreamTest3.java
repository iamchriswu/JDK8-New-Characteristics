package com.chris.java8.study.day4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "Jack", "test");
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------");

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, -3), Arrays.asList(4, 5, 6));
        stream.flatMap(Collection::stream).map(Math::abs).forEach(System.out::println);
    }
}
