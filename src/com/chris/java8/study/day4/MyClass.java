package com.chris.java8.study.day4;

public class MyClass extends MyInterface1Impl implements MyInterface2 {
//    @Override
//    public void myMethod() {
//        MyInterface2.super.myMethod();
//    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
