package com.asish.java8.lambda.functionalinterface;

public class Rectangle implements Drawable {

    /* Without using lambda function..*/
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle..");
    }
}
