package com.ssu.aleksandr_epifanov.java.lesson6.task6.lunch;

import com.ssu.aleksandr_epifanov.java.lesson6.task6.products.Cucumber;
import com.ssu.aleksandr_epifanov.java.lesson6.task6.products.Onion;
import com.ssu.aleksandr_epifanov.java.lesson6.task6.products.Product;
import com.ssu.aleksandr_epifanov.java.lesson6.task6.products.Tomato;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Salad implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    Product[] products = new Product[3];
    public Salad(){
        products[0] = new Onion();
        products[1] = new Cucumber();
        products[2] = new Tomato();
    }

    @Override
    public String toString() {
        return "Salad{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
