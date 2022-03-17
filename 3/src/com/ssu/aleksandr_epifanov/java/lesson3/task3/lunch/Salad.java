package com.ssu.aleksandr_epifanov.java.lesson3.task3.lunch;

import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.Cucumber;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.Onion;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.Product;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.Tomato;

public class Salad {
    Product[] products = new Product[3];
    public Salad(){
        products[0] = new Onion();
        products[1] = new Cucumber();
        products[2] = new Tomato();
    }
    public Salad(Product[] products) throws InstantiationException {
        for (Product element: products) {
            if (!(element instanceof Onion) && !(element instanceof Cucumber) && !(element instanceof Tomato)){
                throw new InstantiationException("Неправильные ингредиенты в салате");
            }
        }
        this.products = products;
    }
}
