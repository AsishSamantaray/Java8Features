package com.asish.java8.predicate.joins;

import java.util.function.Predicate;

/**
 * @author Asish Samantaray on 18-04-2020
 */
public class PredicateJoins {

    public static void main(String[] args) {

        int arr[] = {3, 6, 10, 17, 20, 24, 30, 37};

        // Predicate for greater then 10.
        Predicate<Integer> p1 = i -> i > 10;

        // Predicate for Even number.
        Predicate<Integer> p2 = i -> i % 2 == 0;

        // Call the Predicates.
        System.out.println("Number Nreater then 10");
        parseNumber(p1, arr);

        System.out.println("Even Number");
        parseNumber(p2,arr);

        System.out.println("Numbers not Greater then 10");
        parseNumber(p1.negate(),arr);

        System.out.println("Numbers greater then 10 AND Even");
        parseNumber(p1.and(p2),arr);

        System.out.println("Numbers greater then 10 OR Even");
        parseNumber(p1.or(p2),arr);
    }

    // Method for parsing array and pass Predicate as an argument.
    private static void parseNumber(Predicate<Integer> predicate, int arr[]) {
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }


}


