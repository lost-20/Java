package com.ssu.aleksandr_epifanov.java.lesson6.task6.lunch;

import com.ssu.aleksandr_epifanov.java.lesson6.task6.products.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Borstch implements Serializable {
    Product[] products = new Product[5];
    @Serial
    private static final long serialVersionUID = 1L;
    public Borstch(){
        products[0] = new Onion();
        products[1] = new Meat();
        products[2] = new Beet();
        products[3] = new Cabbage();
        products[4] = new Potato();
    }

    @Override
    public String toString() {
        return "Borstch{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
