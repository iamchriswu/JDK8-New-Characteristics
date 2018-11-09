package com.chris.java8.study.day3;

public class StudentComparator {
    public int compareStudentById(Student student1, Student student2) {
        return student1.getId() - student2.getId();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
