package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

public class Tomato extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public Tomato(){
        calories = 18;
        name = "Tomato";
        price = 12;
    }
}
