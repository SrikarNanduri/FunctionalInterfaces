package com.srikar.BiFunctionalInterfaces.BiPredicateExamples;

import java.util.function.BiPredicate;

/**
 * Created by Srikar on Feb, 2019
 */
public class EvenOrNot {
    public  static void main(String[] args){

        BiPredicate<Integer, Integer> biPredicate = (i1,i2) -> (i1 + i2) % 2 == 0;

        System.out.println(biPredicate.test(10,20));        // true
        System.out.println(biPredicate.test(25,50));        // false
        System.out.println(biPredicate.test(11,63));        // true
        System.out.println(biPredicate.test(27,26));        // false
    }
}
