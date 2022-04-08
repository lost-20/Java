package com.ssu.aleksandr_epifanov.java.lesson6.task6;

import com.ssu.aleksandr_epifanov.java.lesson6.task6.lunch.Lunch;

public class Chef {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.startApp();
    }
    public void startApp() {
        Lunch lunch = new Lunch();
        System.out.println("Total Calories: " + lunch.SumCallories());
        lunch.getSortedSalad();
        System.out.println("Products in Borstch");
        lunch.getProductInBorstch(0, 10, 0, 50);
    }

}
