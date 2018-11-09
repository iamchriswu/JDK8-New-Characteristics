package com.chris.java8.study.day3;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {

        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();

        System.out.println(binaryOperatorTest.count(1, 2, (a, b) -> a + b));
        System.out.println("--------");
        System.out.println(binaryOperatorTest.count(1, 2, (a, b) -> a - b));
        System.out.println("--------");
        System.out.println(binaryOperatorTest.count(1, 2, (a, b) -> a * b));
        System.out.println("--------");
        System.out.println(binaryOperatorTest.count(1, 2, (a, b) -> a / b));
        System.out.println("--------");

        System.out.println(binaryOperatorTest.getShout("hello123", "world", (a, b) -> a.length() - b.length()));
        System.out.println("--------");
        System.out.println(binaryOperatorTest.getShout("hello123", "world", (a, b) -> a.charAt(0) - b.charAt(0)));


    }

    public Integer count(Integer num1, Integer num2, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(num1, num2);
    }

    public String getShout(String str1, String str2, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(str1, str2);
    }
}
