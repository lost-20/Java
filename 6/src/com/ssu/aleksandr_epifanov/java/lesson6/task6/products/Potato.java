package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

public class Potato extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public Potato(){
        calories = 77;
        name = "Potato";
        price = 20;
    }
}
