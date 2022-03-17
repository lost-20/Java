package com.ssu.aleksandr_epifanov.java.lesson3.task3.lunch;

import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.*;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.*;

public class Borstch {
    Product[] products = new Product[5];
    public Borstch(){
        products[0] = new Onion();
        products[1] = new Meat();
        products[2] = new Beet();
        products[3] = new Cabbage();
        products[4] = new Potato();
    }
}
