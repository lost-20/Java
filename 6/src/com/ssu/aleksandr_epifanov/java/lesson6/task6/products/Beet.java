package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

public class Beet extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public Beet(){
        price = 10;
        name = "Beet";
        calories = 43;
    }
}
