package com.srikar.Streams.TerminalOperations;

/**
 * Created by Srikar on Feb, 2019
 */

import java.util.function.Supplier;
import java.util.stream.Stream;


/*
* These operations all take a predicate and return a boolean. Short-circuiting is applied and processing is stopped as soon as the answer is determined:
*/

public class MatchExample {

    public static void main(String [] args){
       Supplier<Stream<Integer>> numbers = () -> Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //anyMatch() checks if the predicate is true for any one element in the stream. Here, again short-circuiting is applied and true is returned after the third element.
        System.out.println("Checks if there is 3 in the stream of numbers : " + numbers.get().anyMatch(i -> i == 3)); // true

        //allMatch() checks if the predicate is true for all the elements in the stream.
        System.out.println("Stream contains all elements less than 10? : " + numbers.get().allMatch(i -> i < 10)); // true

        //noneMatch() checks if there are no elements matching the predicate. The list contains only elements that are less than 10 so it returns true.
        System.out.println("Stream doesn't contain 10? : " + numbers.get().noneMatch(i -> i == 10)); // true
    }
}
