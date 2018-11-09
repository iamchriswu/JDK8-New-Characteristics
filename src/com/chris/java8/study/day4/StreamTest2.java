package com.chris.java8.study.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "Jack");

//        String[] strings = stream.toArray(String[]::new);
//
//        Arrays.asList(strings).forEach(System.out::println);

//        List<String> list = stream.collect(() -> new ArrayList<>(), (resultList, item) -> resultList.add(item), (finalList, resultList) -> finalList.addAll(resultList));
//        List<String> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        list.forEach(System.out::println);
//        System.out.println(stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
//        Set<String> set =  stream.collect(Collectors.toCollection(TreeSet::new));
//        set.forEach(System.out::println);
        System.out.println(stream.collect(Collectors.joining(" ")));

    }
}
