package com.ssu.aleksandr_epifanov.java.lesson7.task7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.runApp();
    }

    public void runApp(){
        smallTest();
        largeTest();
    }

    public void smallTest(){

        Integer[] values = {1, 4, 3, 2};

        Integer[] valuesCopy = new Integer[values.length];

        System.arraycopy(values, 0, valuesCopy, 0, values.length);

        System.out.println("Initial Array");

        for (Integer i: values
        ) {
            System.out.print(i + " ");
        }

        QuickSort.quicksort(values, 0);

        System.out.println("\nSorted Array");

        for (Integer i: values
        ) {
            System.out.print(i + " ");
        }

        QuickSort.quicksort(valuesCopy, 1);

        System.out.println("\nSorted Array");

        for (Integer i: values
        ) {
            System.out.print(i + " ");
        }
    }

    public void largeTest(){
        Random random = new Random(System.currentTimeMillis());

        Integer[] values = new Integer[10000000];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt();
        }

        Integer[] valuesCopy = new Integer[values.length];

        System.arraycopy(values, 0, valuesCopy, 0, values.length);
        long multiStart = System.currentTimeMillis();

        QuickSort.quicksort(values, 0);

        long multiEnd = System.currentTimeMillis();

        System.out.println("\nMultithreading time : " + (multiEnd - multiStart));

        long singleStart = System.currentTimeMillis();

        QuickSort.quicksort(valuesCopy, 1);

        long singleEnd = System.currentTimeMillis();

        System.out.println("\nSingle time : " + (singleEnd - singleStart));
    }
}
