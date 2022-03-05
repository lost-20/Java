package com.ssu.aleksandr_epifanov.java.lesson1.task1;

// Епифанов Александр 1-3
public class ArrayOperations {

    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.startApp();
    }

    public void startApp() {
        int[] array = new int[20];
        System.out.println("Initial Array");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (11 + 11)) - 11);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nModified Array");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
