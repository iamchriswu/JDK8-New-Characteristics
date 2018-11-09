package com.chris.java8.study.day3;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mary", 10);
        Student student2 = new Student("Jack", 120);
        Student student3 = new Student("Netty", 90);
        Student student4 = new Student("Chris", 35);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        students.sort((studentParam1, studentParam2) -> Student.compareStudentById(studentParam1, studentParam2));
        students.forEach(item -> System.out.println(item));

        System.out.println("----------------");

        students.sort(Student::compareStudentByName);
        students.forEach(System.out::println);

        System.out.println("----------------");

        StudentComparator studentComparator = new StudentComparator();

        students.sort((studentParam1, studentParam2) -> studentComparator.compareStudentById(studentParam1, studentParam2));
        students.forEach(item -> System.out.println(item));

        System.out.println("----------------");

        students.sort(studentComparator::compareStudentByName);
        students.forEach(System.out::println);

        System.out.println("----------------");

        students.sort(Student::compareById);
        students.forEach(System.out::println);

        System.out.println("----------------");

        students.sort(Student::compareByName);
        students.forEach(System.out::println);

        System.out.println("----------------");

        List<String> cities = Arrays.asList("New York", "Paris");
        cities.sort(String::compareToIgnoreCase);
        cities.forEach(System.out::println);

    }

}
