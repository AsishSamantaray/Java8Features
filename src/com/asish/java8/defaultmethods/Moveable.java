package com.asish.java8.defaultmethods;

public interface Moveable {
    /*
        We can have multiple default method in @FunctionalInterface Interface..
     */
    default void move() {
        System.out.println("I am moving..");
    }
}
