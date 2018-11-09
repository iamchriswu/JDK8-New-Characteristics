package com.chris.java8.study.day1;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest( () -> System.out.println("myText"));

        TextInterface textInterface = () -> System.out.println("new Test");
        textInterface.test();

        new Thread(() -> System.out.println("========thread start=======")).start();
    }

    public void myTest(TextInterface textInterface) {
        System.out.println("============start===============");
        textInterface.test();
        System.out.println("==============end================");
    }
}
