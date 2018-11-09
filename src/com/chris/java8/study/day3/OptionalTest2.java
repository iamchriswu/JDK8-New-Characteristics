package com.chris.java8.study.day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("chris");
        Employee employee2 = new Employee("mary");
        List<Employee> employees = Arrays.asList(employee1, employee2);
//        Company company = new Company("Martin", employees);
        Company company = new Company();
        Optional<Company> optional = Optional.ofNullable(company);

        optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()).forEach(System.out::println);


    }
}
