package com.srikar.Streams.TerminalOperations;

/**
 * Created by Srikar on Feb, 2019
 */

import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String [] args){


        Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
        numbers2.forEach(i -> System.out.print(i+",")); //1,2,3,4,5,


    }
}
