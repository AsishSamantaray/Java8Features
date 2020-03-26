package com.asish.java8.defaultmethods;

public class Main implements Moveable {
    public static void main(String[] args) {
        Main main = new Main();
        main.move();

        /* If we want to override the default method we can do that also. */
        new Moveable(){
            @Override
            public void move() {
                System.out.println("I am Running..");
            }
        }.move();
    }
}
