package com.srikar.FunctionExamples;

import java.util.function.Function;

/**
 * Created by srikar on Feb, 2019
 */


/**
 *  Problem:
 *  Write a function to find length of given input string
 */


public class FindLengthOfString {
    public static void main(String [] args){
        Function<String, Integer> function = String::length;

        System.out.println("Hello - " + function.apply("Hello"));          // Hello - 5
        System.out.println("World - " + function.apply("World"));          // World - 5
        System.out.println("Reality - " + function.apply("Reality"));      // Reality - 7
    }
}
