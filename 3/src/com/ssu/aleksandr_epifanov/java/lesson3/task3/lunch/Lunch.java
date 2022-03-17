package com.ssu.aleksandr_epifanov.java.lesson3.task3.lunch;

import com.ssu.aleksandr_epifanov.java.lesson3.task3.exception.TooLittleCaloriesException;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.exception.TooManyCaloriesException;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.Product;

import java.util.Arrays;
import java.util.Comparator;

public class Lunch {
    private Salad salad;
    private Borstch borstch;

    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    public Lunch() {
        salad = new Salad();
        borstch = new Borstch();
    }

    public int SumCallories() throws TooLittleCaloriesException, TooManyCaloriesException {
        int sum = 0;
        // полиморфизм
        for (Product product : salad.products) {
            sum += product.getCalories();
        }
        for (Product product : borstch.products) {
            sum += product.getCalories();
        }
        if (sum < 500){
            throw new TooLittleCaloriesException("Калорийность ланча меньше 500 калорий.");
        }

        if (sum > 800){
            throw new TooManyCaloriesException("Калорийность ланча больше 800 калорий.");
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
            if (minPrice <= product.getPrice() && maxPrice >= product.getPrice() && minCalories <= product.getCalories() && maxCalories >= product.getCalories()){
                System.out.println(product);
            }
        }
    }
}
