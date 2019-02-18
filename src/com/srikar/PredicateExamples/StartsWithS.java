package com.srikar.PredicateExamples;

/**
 * Created by Srikar on Feb, 2019
 */

import java.util.function.Predicate;

/**
 * Problem:
 * Program to display string starts with 'S' by using Predicate:
 */
public class StartsWithS {
    public static void main(String [] args){
        Predicate<String> predicate = string -> string.toLowerCase().charAt(0) == 's';

        System.out.println(predicate.test("Srikar"));   // true
        System.out.println(predicate.test("Rahul"));    // false
        System.out.println(predicate.test("John"));     // false
        System.out.println(predicate.test("Ray"));      // false
        System.out.println(predicate.test("Solomon"));  // true
    }
}
