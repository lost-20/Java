package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

// наследование
public class Cabbage extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public Cabbage(){
        price = 14;
        name = "Cabbage";
        calories = 25;
    }
}
