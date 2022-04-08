package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

public class Cucumber extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public Cucumber(){
        calories = 16;
        name = "Cucumber";
        price = 10;
    }
}
