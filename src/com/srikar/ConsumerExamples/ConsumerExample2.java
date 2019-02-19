package com.srikar.ConsumerExamples;

import java.util.function.Consumer;

/**
 * Created by Srikar on Feb, 2019
 */
public class ConsumerExample2 {
    public static void main(String[] args){

        Consumer<String> consumer = s ->
            System.out.println(s.toLowerCase().substring(0, 5));

                consumer.accept("Hello World");
                consumer.accept("Jane Doe");

    }
}
