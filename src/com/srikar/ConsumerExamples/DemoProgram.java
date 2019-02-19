package com.srikar.ConsumerExamples;

import java.util.function.Consumer;

/**
 * Created by Srikar on Feb, 2019
 */
public class DemoProgram {
    public static void main(String [] args){
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello");
        consumer.accept("World");
    }
}
