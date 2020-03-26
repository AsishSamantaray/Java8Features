package com.asish.java8.lambda.parameters;

public class Main {
    public static void main(String[] args) {
        CalculateSum calculateSum = (x,y)->System.out.println("Sum: "+(x+y));
        calculateSum.sum(10,20);
    }
}
