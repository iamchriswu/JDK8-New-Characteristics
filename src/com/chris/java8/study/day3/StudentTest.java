package com.chris.java8.study.day3;

import java.util.function.Supplier;

public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> supplier1 = () -> new Student();
        System.out.println(supplier1.get());

        Supplier supplier2 = Student::new;
        System.out.println(supplier2.get().getClass());
    }
}
