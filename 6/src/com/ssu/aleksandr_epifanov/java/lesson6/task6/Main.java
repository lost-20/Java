package com.ssu.aleksandr_epifanov.java.lesson6.task6;

import com.ssu.aleksandr_epifanov.java.lesson6.task6.lunch.Borstch;
import com.ssu.aleksandr_epifanov.java.lesson6.task6.lunch.Salad;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.write();
        main.read();
    }
    public void write(){
        Salad salad = new Salad();
        Borstch borstch = new Borstch();
        System.out.println(salad);
        System.out.println(borstch);
        try (
                ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("salad.txt"));
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("borstch.txt"));
                ) {
            objectOutputStream1.writeObject(salad);
            objectOutputStream2.writeObject(borstch);
            objectOutputStream1.flush();
            objectOutputStream2.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void read(){
        try (
                ObjectInputStream objectOutputStream1 = new ObjectInputStream(new FileInputStream("salad.txt"));
                ObjectInputStream objectOutputStream2 = new ObjectInputStream(new FileInputStream("borstch.txt"));
        ) {
            Salad salad = (Salad) objectOutputStream1.readObject();
            Borstch borstch = (Borstch) objectOutputStream2.readObject();
            System.out.println(salad);
            System.out.println(borstch);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
