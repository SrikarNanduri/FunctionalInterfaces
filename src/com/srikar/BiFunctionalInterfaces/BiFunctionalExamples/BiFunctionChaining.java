package com.srikar.BiFunctionalInterfaces.BiFunctionalExamples;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Srikar on Feb, 2019
 */
public class BiFunctionChaining {
    public static void main(String [] args){
        BiFunction<String, String , Integer> biFunction = (s, s2) -> s.length() + s2.length();
        Function<Integer,Integer> function = integer -> integer * integer;

        System.out.println(biFunction.andThen(function).apply("Hello", "World"));       // 100

    }
}
