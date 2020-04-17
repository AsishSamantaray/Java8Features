package com.asish.java8.predicate;

import java.util.function.Predicate;

/**
 * @author Asish Samantaray on 18-04-2020
 */
public class GreaterThenTwenty {
    public static void main(String[] args) {

        // Create the predicate.
        Predicate<Integer> predicate = i -> (i > 20);

        // Test the predicate by calling test().
        System.out.println(predicate.test(34));     // true
        System.out.println(predicate.test(12));     // false
        System.out.println(predicate.test(78));     // true
    }
}
