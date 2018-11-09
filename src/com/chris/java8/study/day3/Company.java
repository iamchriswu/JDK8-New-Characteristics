package com.chris.java8.study.day3;

import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company() {
    }

    public Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
