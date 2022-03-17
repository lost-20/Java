package com.ssu.aleksandr_epifanov.java.lesson3.task3.exception;

public final class TooManyCaloriesException extends InvalidCaloriesNumberException {
    public TooManyCaloriesException(String message) {
        super(message);
    }
}
