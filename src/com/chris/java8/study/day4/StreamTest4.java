package com.chris.java8.study.day4;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        stream.findFirst().ifPresent(System.out::println);
        System.out.println("---------");

        Stream<Integer> stream1 = Stream.iterate(1, i -> i + 2).limit(10);
//        System.out.println(stream1.filter(i -> i >2 ).mapToInt(i -> i * 2).skip(2).limit(2).sum());
//        stream1.filter(i -> i > 2).mapToInt(i -> i * 2).skip(2).limit(2).min().ifPresent(System.out::println);
        IntSummaryStatistics summaryStatistics = stream1.filter(i -> i > 2).mapToInt(i -> i * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getAverage());

        Stream.iterate(1, i -> i + 1).limit(100).map(i -> {
            System.out.println("first");
            i = i * 2;
            return i;
        }).map(i -> {
            System.out.println("second");
            i = i * 3;
            return i;
        }).forEach(System.out::println);
    }
}
