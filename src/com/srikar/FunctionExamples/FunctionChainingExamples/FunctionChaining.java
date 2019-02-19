package com.srikar.FunctionExamples.FunctionChainingExamples;

/**
 * Created by srikar on Feb, 2019
 */

import java.util.function.Function;

/**
 *  Problem:
 *  Function Chaining example( pass a string and convert to uppercase and show substring of that string)
 */

public class FunctionChaining {

    public static void main(String[] args){

        Function<String, String> function1 = String::toUpperCase;
        Function<String, String> function2 = s -> s.substring(0, 5);

        System.out.println(function1.apply("Hello World"));                                 // HELLO WORLD
        System.out.println(function2.apply("Jane Doe"));                                    // Jane

        //andThen()
        System.out.println(function1.andThen(function2).apply("Hello World"));              // HELLO
        System.out.println(function1.andThen(function2).apply("Jane Doe"));                 // JANE

        //compose()
        System.out.println(function1.compose(function2).apply("Hello World"));              // HELLO
        System.out.println(function1.compose(function2).apply("Jane Doe"));                 // JANE
    }

}
