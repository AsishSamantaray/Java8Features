package com.asish.java8.stream_assignment;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author Asish Samantaray on 19-04-2020
 */
public class StreamAssignments {

    public static void main(String[] args) {

//        TestData testData = new TestData();

        // 1.	Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
        System.out.println("Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.");
        TestData.getAllFruits()
                .stream()
                .filter(c -> c.getCalories() < 100)
                .sorted(Comparator.comparing(Fruit::getCalories, Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // 2.	Display color wise list of fruits.
        System.out.println("\nDisplay color wise list of fruits.");
        TestData.getAllFruits()
                .stream()
                .collect(Collectors.groupingBy(Fruit::getColor))
                .entrySet()
                .forEach(System.out::println);

        // 3.	Display only RED color fruits sorted as per their price in ascending order.
        System.out.println("\nDisplay only RED color fruits sorted as per their price in ascending order.");
        TestData.getAllFruits()
                .stream()
                .filter(f -> f.getColor().equals("Red"))
                .sorted(Comparator.comparing(Fruit::getPrice))
                .forEach(System.out::println);

        // 4.	Find out the newsId which has received maximum comments.
//        System.out.println(TestData.getAllNews()
//                .stream()
//                .max(Comparator.comparing(News::getComment))
//                .get());

        //
    }


}
