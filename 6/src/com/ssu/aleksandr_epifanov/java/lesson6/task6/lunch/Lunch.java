package com.ssu.aleksandr_epifanov.java.lesson6.task6.lunch;

import com.ssu.aleksandr_epifanov.java.lesson6.task6.products.Product;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Lunch implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Salad salad;
    private Borstch borstch;

    public Lunch() {
        salad = new Salad();
        borstch = new Borstch();
    }

    public int SumCallories() {
        int sum = 0;
        // полиморфизм
        for (Product product : salad.products) {
            sum += product.getCalories();
        }
        for (Product product : borstch.products) {
            sum += product.getCalories();
        }
        return sum;
    }

    public void getSortedSalad(){
        System.out.println("Initial array of vegetables");
        for (Product product : salad.products) {
            System.out.println(product.toString());
        }
        // сортировка по калориям
        Arrays.sort(salad.products, Comparator.comparing(Product::getCalories));
        System.out.println("Sorted array by calories");
        for (Product product : salad.products) {
            System.out.println(product);
        }
    }
    public void getProductInBorstch(int minPrice, int maxPrice, int minCalories, int maxCalories){
        for (Product product : borstch.products) {
            if (minPrice <= product.getPrice()
                    && maxPrice >= product.getPrice()
                    && minCalories <= product.getCalories()
                    && maxCalories >= product.getCalories()){
                System.out.println(product);
            }
        }
    }
}
