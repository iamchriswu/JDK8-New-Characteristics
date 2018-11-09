package com.chris.java8.study.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Text1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //lambda表达式实现函数式接口
        list.forEach(integer -> System.out.println(integer));

        //方法引用实现函数式接口
        list.forEach(System.out::println);

    }
}
