package com.chris.java8.study.day3;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        optional.ifPresent(System.out::println);

    }
}
