package com.chris.java8.study.day2;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        System.out.println(new StringBuilder(str).reverse().toString());
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute1(2, value -> value * 4, value -> value * value)); //16
        System.out.println(functionTest.compute2(2, value -> value * 4, value -> value * value)); //64
    }

    public int compute1(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

}

