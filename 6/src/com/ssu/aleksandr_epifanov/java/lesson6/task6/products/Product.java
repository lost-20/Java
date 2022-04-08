package com.ssu.aleksandr_epifanov.java.lesson6.task6.products;

import java.io.Serial;
import java.io.Serializable;

public abstract class Product implements Serializable {
    // инкапсуляция
    transient protected int price;
    protected String name;
    transient protected int calories;
    @Serial
    private static final long serialVersionUID = 1L;

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
