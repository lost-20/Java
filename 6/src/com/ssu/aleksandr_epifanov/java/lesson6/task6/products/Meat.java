package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

public class Meat extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public Meat(){
        price = 150;
        name = "Chicken";
        calories = 165;
    }
}
