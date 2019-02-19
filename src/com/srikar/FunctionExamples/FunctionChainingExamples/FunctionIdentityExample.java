package com.srikar.FunctionExamples.FunctionChainingExamples;

/**
 * Created by srikar on Feb, 2019
 */

import java.util.function.Function;

/**
 *  Problem:
 *  Using Function static method identity()
 */

public class FunctionIdentityExample {

    public static void main(String[] args) {
         Function<String,String> function= Function.identity();
         System.out.println(function.apply("Hello World"));     // Hello World
         }

}
