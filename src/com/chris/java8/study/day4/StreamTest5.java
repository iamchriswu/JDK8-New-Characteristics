package com.chris.java8.study.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(5000000);
        for (int i = 0; i < 5000000; i++) {
            list1.add(UUID.randomUUID().toString());
        }

        List<String> list2 = list1;

        System.out.println("Stream Begin");

        long startTime1 = System.nanoTime();
        list1.stream().sorted().count();
        long endedTime1 = System.nanoTime();

        System.out.println("Stream Use : " + TimeUnit.NANOSECONDS.toMillis(endedTime1 - startTime1));

        System.out.println("--------------------");

        System.out.println("ParallelStream Begin");

        long startTime2 = System.nanoTime();
        list2.parallelStream().sorted().count();
        long endedTime2 = System.nanoTime();

        System.out.println("ParallelStream Use : " + TimeUnit.NANOSECONDS.toMillis(endedTime2 - startTime2));

    }
}
