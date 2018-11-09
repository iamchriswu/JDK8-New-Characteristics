package com.chris.java8.study.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest1 {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 100).forEach(System.out::println);
//        System.out.println("---");
//        System.out.println(IntStream.rangeClosed(1, 100).sum());
        System.out.println(IntStream.rangeClosed(1, 100).map(item -> item * 2).sum());

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list.stream().map(i -> 2 * i).reduce(0, Integer::sum));

    }
}
