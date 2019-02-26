package com.srikar.Streams.IntermediateOperations;

/**
 * Created by Srikar on Feb, 2019
 */

import java.util.NoSuchElementException;
import java.util.stream.Stream;

/*
* As the name suggests, min() and max() return the minimum and maximum element in the stream respectively, based on a comparator.
* They return an Optional since a result may or may not exist (due to, say, filtering):
*/

public class MaxExample {
    public static void main(String [] args){
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);

        System.out.println(numbers.max(Integer::compareTo).orElseThrow(NoSuchElementException::new));
    }
}
