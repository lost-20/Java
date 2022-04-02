package com.ssu.aleksandr_epifanov.java.lesson4.task4;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.startApp();
    }
    public void startApp(){
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.get(1));
        dynamicArray.set(0, 1);
        System.out.println(dynamicArray);
        dynamicArray.remove(1);
        System.out.println(dynamicArray);
    }
}
