package com.ssu.aleksandr_epifanov.java.lesson1.task2;

import java.util.Scanner;

// Епифанов Александр 2
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator.startApp(calculator);
    }

    public static void startApp(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 2 numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Enter operation(+, -, *, /)");
            String operation = scanner.next();
            System.out.println("Answer");
            switch (operation) {
                case "+" -> System.out.println(calculator.add(a, b));
                case "-" -> System.out.println(calculator.subtract(a, b));
                case "*" -> System.out.println(calculator.multiply(a, b));
                case "/" -> System.out.println(calculator.divide(a, b));
                default -> System.out.println("Unknown operation");
            }
            System.out.println("Continue? (yes, no)");
            if (scanner.next().equals("no")) {
                break;
            }
        }
        scanner.close();
    }

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
}
