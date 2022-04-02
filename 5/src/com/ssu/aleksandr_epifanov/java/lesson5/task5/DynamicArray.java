package com.ssu.aleksandr_epifanov.java.lesson5.task5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class DynamicArray<T> implements Iterable<T>{

    private T[] array;

    public DynamicArray() {
        array = (T[])new Object[0];
    }

    public DynamicArray(int size){
        array = (T[])new Object[size];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    public void add(T element){
        T[] newArray = (T[])new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        array = newArray;
    }

    public T get(int index){
        return (T) array[index];
    }

    public void set(T element, int index){
        array[index] = element;
    }

    public void remove(int index){
        array[index] = null;
    }

    public Stream<T> stream(){
        return Arrays.stream(array);
    }
}
