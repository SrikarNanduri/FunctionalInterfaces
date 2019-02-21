package com.srikar.Streams.TerminalOperations;

import java.util.stream.Stream;

/**
 * Created by Srikar on Feb, 2019
 */

public class CountExample {
    public static void main(String [] args){

        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);

        System.out.println("Number of elements in stream = "+numbers1.count()); //5

    }
}
