package com.chris.java8.study.day2;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        PredicateTest predicateTest = new PredicateTest();
        predicateTest.numSelector(list, item -> item % 2 == 0).forEach(System.out::println);
        System.out.println("------------------------");
        predicateTest.numSelector(list, item -> item % 2 != 0).forEach(System.out::println);
        System.out.println("------------------------");
        predicateTest.numSelector(list, item -> true).forEach(System.out::println);
        System.out.println("------------------------");
        predicateTest.numSelector2(list, item -> item % 2 == 0, item -> item > 5).forEach(System.out::println);
        System.out.println("------------------------");
        list.stream().filter(((Predicate<Integer>)item -> item % 2 ==0).or(item -> item > 5)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public List<Integer> numSelector(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<Integer> numSelector2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        return list.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList());
    }
}
