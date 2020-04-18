package com.asish.java8.functions;

import java.util.function.Function;

/**
 * @author Asish Samantaray on 19-04-2020
 */
public class FunctionTest {
    public static void main(String[] args) {

        // Create a Function for checking a Student PASS or FAIL.
        Function<Integer, String> f = mark -> mark > 40 ? "PASS" : "FAIL";

        // Call the apply() method to get result.
        System.out.println(f.apply(75));
        System.out.println(f.apply(23));
        System.out.println(f.apply(89));
    }
}
