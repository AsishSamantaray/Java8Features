package com.asish.java8.lambda.functionalinterface;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        /* With lambda function..*/
        Drawable drawable = ()-> System.out.println("Drawing Rectangle using lambda..");
        drawable.draw();
    }
}
