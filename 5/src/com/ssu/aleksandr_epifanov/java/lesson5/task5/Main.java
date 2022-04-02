package com.ssu.aleksandr_epifanov.java.lesson5.task5;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.StartApp();
    }
    public void StartApp(){
        Instant start = Instant.now();
        double n = new Random()
                .ints(1_000_000, 0, 1_000_001)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .reduce(0, Integer::sum);
        Instant end = Instant.now();
        Duration time = Duration.between(start, end);
        System.out.println((double)time.toMillis() / 1000);
        Instant start2 = Instant.now();
        double m = new Random()
                .ints(1_000_000, 0, 1_000_001)
                .boxed().toList()
                .parallelStream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .reduce(0, Integer::sum);
        Instant end2 = Instant.now();
        Duration time2 = Duration.between(start2, end2);
        System.out.println((double)time2.toMillis() / 1000);

        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        List<Integer> list = array.stream().collect(Collectors.toList());
        list = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
    }
}
