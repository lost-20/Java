package com.ssu.aleksandr_epifanov.java.lesson2.task2;

import com.ssu.aleksandr_epifanov.java.lesson2.task2.lunch.Lunch;

//Епифанов Александр 2-2
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
