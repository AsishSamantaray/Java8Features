package com.asish.java8.predicate;

import java.util.function.Predicate;

/**
 * @author Asish Samantaray on 18-04-2020
 */
public class LengthOfString {

    public static void main(String[] args) {
        // Declare the Predicate.
        Predicate<String> predicate = s -> (s.length() >= 5);

        //  Test the Predicate.
        System.out.println(predicate.test("Asish"));    // true
        System.out.println(predicate.test("Raj"));      // false
        System.out.println(predicate.test("Abhisekh")); // true


    }
}
