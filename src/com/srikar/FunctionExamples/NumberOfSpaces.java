package com.srikar.FunctionExamples;


/**
 * Created by srikar on Feb, 2019
 */


import java.util.function.Function;

/**
 *  Problem:
 *  Program to find Number of spaces present in the given String
 */

public class NumberOfSpaces {
    public static void main(String[] args) {

         Function<String,Integer> f= s1->s1.length() - s1.replaceAll(" ","").length();

         System.out.println(f.apply("Hello World"));                            // 1
         System.out.println(f.apply("This is an example sentence"));            // 4
         System.out.println(f.apply("Another example sentence"));               // 2
         }
}
