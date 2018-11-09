package com.chris.java8.study.day4;

public interface MyInterface1 {
    default void myMethod() {
        System.out.println("myInterface1");
    }
}
