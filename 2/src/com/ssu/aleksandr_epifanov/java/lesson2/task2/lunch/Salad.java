package com.ssu.aleksandr_epifanov.java.lesson2.task2.lunch;

import com.ssu.aleksandr_epifanov.java.lesson2.task2.products.Cucumber;
import com.ssu.aleksandr_epifanov.java.lesson2.task2.products.Onion;
import com.ssu.aleksandr_epifanov.java.lesson2.task2.products.Product;
import com.ssu.aleksandr_epifanov.java.lesson2.task2.products.Tomato;

public class Salad {
    Product[] products = new Product[3];
    public Salad(){
        products[0] = new Onion();
        products[1] = new Cucumber();
        products[2] = new Tomato();
    }
}
