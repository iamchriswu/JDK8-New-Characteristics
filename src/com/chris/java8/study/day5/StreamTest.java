package com.chris.java8.study.day5;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        Student student1 = new Student("Chris", 65, 20);
        Student student2 = new Student("Kris", 45, 45);
        Student student3 = new Student("Jack", 90, 18);
        Student student4 = new Student("Chris", 65, 30);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        Map<String, List<Student>> nameMap =  students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(nameMap);

        Map<Integer, List<Student>> ageMap = students.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println(ageMap);

        Map<String, Long> countMap = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(countMap);


        Map<String, Double> scoreMap = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(scoreMap);

        Map<Boolean, List<Student>> partitionByAgeMap = students.stream().collect(Collectors.partitioningBy(student -> student.getAge() > 20));
        System.out.println(partitionByAgeMap);

    }
}
