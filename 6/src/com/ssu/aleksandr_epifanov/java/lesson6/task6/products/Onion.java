package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

public class Onion extends Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public Onion() {
        price = 6;
        calories = 40;
        name = "Onion";
    }
}
