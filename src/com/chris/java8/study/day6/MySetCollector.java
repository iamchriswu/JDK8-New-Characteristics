package com.chris.java8.study.day6;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MySetCollector<T> implements Collector<T, List<T>, Set<T>> {
    @Override
    public Supplier<List<T>> supplier() {
        System.out.println("supplier invoked!");
        return ArrayList<T>::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return List<T>::add;
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        System.out.println("combiner invoked!");
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<T>, Set<T>> finisher() {
        System.out.println("finisher invoked!");
        return l -> {
            Set<T> set = new HashSet<>();
            set.addAll(l);
            return set;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }
}
