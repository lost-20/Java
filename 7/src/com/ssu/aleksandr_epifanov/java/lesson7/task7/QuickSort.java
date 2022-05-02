package com.ssu.aleksandr_epifanov.java.lesson7.task7;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class QuickSort {

    private static int N_THREADS = Runtime.getRuntime().availableProcessors();

    private static int FALLBACK = 2;

    private static Executor pool = Executors.newFixedThreadPool(N_THREADS);

    public static <T extends Comparable<T>> void quicksort(T[] input, int mode) {
        if (mode == 1){
            N_THREADS = 1;
            FALLBACK = 1;
            pool =  Executors.newFixedThreadPool(1);
        }
        final AtomicInteger count = new AtomicInteger(1);
        pool.execute(new QuicksortRunnable<T>(input, 0, input.length - 1, count, mode));
        try {
            synchronized (count) {
                count.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private record QuicksortRunnable<T extends Comparable<T>>(T[] values, int left, int right,
                                                              AtomicInteger count, int mode) implements Runnable {


        @Override
        public void run() {
            quicksort(left, right);
            synchronized (count) {
                if (count.getAndDecrement() == 1)
                    count.notify();
            }
        }


        private void quicksort(int subLeft, int subRight) {
            if (subLeft < subRight) {
                int storeIndex = partition(subLeft, subRight);
                if (count.get() >= FALLBACK * N_THREADS || mode == 1) {
                    quicksort(subLeft, storeIndex - 1);
                    quicksort(storeIndex + 1, subRight);
                } else {
                    count.getAndAdd(2);
                    pool.execute(new QuicksortRunnable<T>(values, subLeft, storeIndex - 1, count, mode));
                    pool.execute(new QuicksortRunnable<T>(values, storeIndex + 1, subRight, count, mode));
                }
            }
        }

        private int partition(int pLeft, int pRight) {
            T pivotValue = values[pRight];
            int storeIndex = pLeft;
            for (int i = pLeft; i < pRight; i++) {
                if (values[i].compareTo(pivotValue) < 0) {
                    swap(i, storeIndex);
                    storeIndex++;
                }
            }
            swap(storeIndex, pRight);
            return storeIndex;
        }

        private void swap(int left, int right) {
            T temp = values[left];
            values[left] = values[right];
            values[right] = temp;
        }
    }
}
