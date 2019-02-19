package com.srikar.BiFunctionalInterfaces.BiConsumerExamples;

import java.util.function.BiConsumer;

/**
 * Created by Srikar on Feb, 2019
 */
public class Concate2Strings {

    public static void main(String [] args){

        BiConsumer<String, String > biConsumer = (s, s2) -> System.out.println(s + " " + s2);

        biConsumer.accept("Hello", "World");

    }
}
