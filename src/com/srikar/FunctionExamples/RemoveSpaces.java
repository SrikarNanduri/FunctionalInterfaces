package com.srikar.FunctionExamples;

/**
 * Created by srikar on Feb, 2019
 */


import java.util.function.Function;

/**
 *  Problem:
 *  Program to remove spaces present in the given String by using
 */

public class RemoveSpaces {

    public static void main(String [] args){
        Function<String, String> function = str -> str.replaceAll(" ", ", ");

        System.out.println(function.apply("Hello World"));      // Hello, World
        System.out.println(function.apply("Hello People"));     // Hello, People
        System.out.println(function.apply("Jane Doe"));         // Jane, Doe
        System.out.println(function.apply("Hi All"));           // Hi, All
    }

}
