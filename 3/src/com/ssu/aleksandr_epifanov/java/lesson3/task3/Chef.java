package com.ssu.aleksandr_epifanov.java.lesson3.task3;

import com.ssu.aleksandr_epifanov.java.lesson3.task3.exception.InvalidCaloriesNumberException;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.exception.TooLittleCaloriesException;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.exception.TooManyCaloriesException;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.lunch.Lunch;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.lunch.Salad;
import com.ssu.aleksandr_epifanov.java.lesson3.task3.products.*;

import java.util.Scanner;

public class Chef {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.startApp();
    }

    public void startApp() {
        Lunch lunch = new Lunch();
        try {
            Product[] products1 = new Product[]{
                    new Onion(), new Tomato(), new Cucumber()
            };
            Product[] products2 = new Product[]{
                    new Onion(), new Tomato(), new Meat()
            };
            Salad salad1 = new Salad(products1);
            System.out.println("Салат 1 собран");
            Salad salad2 = new Salad(products2);
            System.out.println("Салат 2 собран");
        } catch (InstantiationException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Сборка салатов окончена");
        }
        try {
            System.out.println("Total Calories: " + lunch.SumCallories());
        } catch (InvalidCaloriesNumberException exception) {
            System.out.println(exception.getMessage());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите калории салата(Лук, Огурцы, Помидоры)");
            Onion onion = new Onion(scanner.nextInt());
            Cucumber cucumber = new Cucumber(scanner.nextInt());
            Tomato tomato = new Tomato(scanner.nextInt());
            try {
                Salad salad = new Salad(new Product[]{onion, cucumber, tomato});
                lunch.setSalad(salad);
                System.out.println("Total Calories: " + lunch.SumCallories());
            } catch (InstantiationException | InvalidCaloriesNumberException exception1) {
                System.out.println(exception1.getMessage());
            }
        }

        //lunch.getSortedSalad();
        //ystem.out.println("Products in Borstch");
        //lunch.getProductInBorstch(0, 10, 0, 50);
    }

}
