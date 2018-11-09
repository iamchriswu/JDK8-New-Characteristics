package com.chris.java8.study.day2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhao", 25);
        Person person2 = new Person("Mary", 40);
        Person person3 = new Person("Jack", 30);
        List<Person> persons = Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();

        personTest.selectorOfName("Jack", persons).forEach(System.out::println);
        System.out.println("-----------------------------------");

        personTest.selectorOfAge(25, persons).forEach(System.out::println);
        System.out.println("-----------------------------------");

        personTest.selectorOfAge2(20, persons, (age, personList) -> personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList())).forEach(System.out::println);
    }

    public List<Person> selectorOfName(String name, List<Person> persons) {
        return persons.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Person> selectorOfAge(Integer age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (personAge, personList) -> personList.stream().filter(person -> person.getAge() > personAge).collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    public List<Person> selectorOfAge2(Integer age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }
}
