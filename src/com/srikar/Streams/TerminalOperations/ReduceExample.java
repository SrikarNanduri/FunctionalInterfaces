package com.srikar.Streams.TerminalOperations;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by Srikar on Feb, 2019
 */

/*
*  Stream reduce() example: We can use reduce() to perform a reduction on the elements of the stream, using an associative accumulation function, and return an Optional.
*  Let’s see how we can use it multiply the integers in a stream
*
*/
public class ReduceExample {
    public static void main(String[] args){
        Supplier<Stream<Integer>> supplier = () -> Stream.of(1, 2, 3, 4, 5, 6);

       Optional<Integer> product = supplier.get().reduce((integer, integer2) -> integer*integer2);

        System.out.println(product.get());

        Optional<Integer> addition = supplier.get().reduce((int1, int2) -> int1 + int2);

        System.out.println(addition.get());



    }
}
