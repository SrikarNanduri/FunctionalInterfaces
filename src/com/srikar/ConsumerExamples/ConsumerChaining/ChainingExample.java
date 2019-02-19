package com.srikar.ConsumerExamples.ConsumerChaining;

import java.util.function.Consumer;

/**
 * Created by Srikar on Feb, 2019
 */
public class ChainingExample {
    public static void main(String[] args){
        Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
        Consumer<String> consumer2 = s -> System.out.println(s.substring(0,1).toLowerCase() + s.substring(1));

        consumer1.andThen(consumer2).accept("Hello World");

        //As you can see it don't pass the result of first consumer to the next, both are executed one after the other on the same data.
    }
}
