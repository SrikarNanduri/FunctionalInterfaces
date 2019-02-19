package com.srikar.BiFunctionalInterfaces.BiPredicateExamples;

import java.util.function.BiPredicate;

/**
 * Created by Srikar on Feb, 2019
 */
public class BiPredicateChaining {

    public static void main(String[] args){
        BiPredicate<Integer, Integer> biPredicate1 = (int1, int2) -> (int1 + int2) > 100;
        BiPredicate<Integer, Integer> biPredicate2 = (int1, int2) -> (int1 + int2) % 2 != 0;

        System.out.println(biPredicate1.test(10, 20));                      // false
        System.out.println(biPredicate2.test(10, 20));                      // false

        //negate()
        System.out.println(biPredicate1.negate().test(10, 20));             // true

        //and()
        System.out.println(biPredicate1.and(biPredicate2).test(10, 20));    // false

        //or()
        System.out.println(biPredicate1.or(biPredicate2).test(10, 20));     // false

    }
}
