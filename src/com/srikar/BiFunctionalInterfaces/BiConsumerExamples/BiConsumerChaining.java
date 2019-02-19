package com.srikar.BiFunctionalInterfaces.BiConsumerExamples;

import java.util.function.BiConsumer;

/**
 * Created by Srikar on Feb, 2019
 */
public class BiConsumerChaining {
    public static void main(String [] args){
        BiConsumer<String, String> biConsumer1 = (s, s2) -> System.out.println("String 1 length is " + s.length() + " and the concat of both the strings is " + s + " " + s2);
        BiConsumer<String, String> biConsumer2 = (s, s2) -> System.out.println("lengths of both the strings are " + s.length() + " and " + s2.length());

        biConsumer1.andThen(biConsumer2).accept("Hello", "World");
    }
}
