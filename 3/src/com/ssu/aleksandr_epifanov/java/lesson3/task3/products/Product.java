package com.ssu.aleksandr_epifanov.java.lesson3.task3.products;

public abstract class Product {
    // инкапсуляция
    protected int price;
    protected String name;
    protected int calories;

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
