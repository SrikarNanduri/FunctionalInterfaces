package com.srikar.PredicateExamples;

import java.util.function.Predicate;

/**
 * Created by srikar on Feb, 2019
 */

    /*Problem:
    Write a predicate to check whether the given integer is greater than 10 or not.*/

public class GreaterThan10 {

    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i > 10;
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(15));
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(-5));
        System.out.println(predicate.test(-15));
    }

}
