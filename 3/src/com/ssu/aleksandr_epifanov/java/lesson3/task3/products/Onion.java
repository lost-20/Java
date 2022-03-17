package com.ssu.aleksandr_epifanov.java.lesson3.task3.products;

public class Onion extends Product {
    public Onion() {
        price = 6;
        calories = 40;
        name = "Onion";
    }
    public Onion(int newCalories){
        calories = newCalories;
        price = 6;
        name = "Onion";
    }
}
