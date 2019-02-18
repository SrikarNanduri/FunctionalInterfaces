package com.srikar.PredicateExamples;

/**
 * Created by srikar on Feb, 2019
 */

import java.util.function.Predicate;

/**
 * Problem:
 * Write a predicate to check the length of given string is greater than 3 or not
 **/
public class StringLenGreaterThan3 {
    public static void main(String [] args){
        Predicate<String> predicate = i -> i.length() > 3;
        System.out.println(predicate.test("Hello")); // true
        System.out.println(predicate.test("World")); // true
        System.out.println(predicate.test("The"));   // false
    }
}
