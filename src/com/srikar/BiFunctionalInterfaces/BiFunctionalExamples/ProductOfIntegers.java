package com.srikar.BiFunctionalInterfaces.BiFunctionalExamples;

import java.util.function.BiFunction;

/**
 * Created by Srikar on Feb, 2019
 */
public class ProductOfIntegers {

    public static void main(String [] args){
        BiFunction<Integer, Integer, Integer> biFunction = (n1, n2) -> n1 * n2;

        System.out.println(biFunction.apply(20, 50));
        System.out.println(biFunction.apply(10, 20));
        System.out.println(biFunction.apply(2, 5));
    }
}
