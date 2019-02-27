package com.srikar.Streams.Java9Additions;

import java.util.function.Supplier;
import java.util.stream.Stream;



/*
* In Stream API, takeWhile() Method returns longest prefix elements which matches the Predicate condition.
* It takes a Predicate as an argument. A Predicate is Boolean expression which returns either true or false.
* It behaves differently for Ordered and Unordered Streams. Let us explore them with some simple examples below.
*
* default Stream<T> takeWhile(Predicate<? super T> predicate)
*
* If Stream is an Ordered, then takeWhile method returns the longest prefix which matches that Predicate.
* The resulted Stream contains only that prefix elements which matches that Predicate condition.
*
*/

public class TakeWhileExample {
    public static void main(String [] args){

        Supplier<Stream<Integer>> orderedStream = () -> Stream.of(1,2,3,4,5,6,7,8,9,10);
        orderedStream.get().takeWhile(x -> x < 4).forEach(System.out::println);
        // As this Stream is an Ordered, takeWhile() method returns first three elements which matches our Predicate. Here our Predicate is that “Element must be less than 4”.

        Supplier<Stream<Integer>> unorderedStream = () -> Stream.of(1,2,4,5,3,6,7,8,9,10);
        unorderedStream.get().takeWhile(x -> x < 4).forEach(System.out::println);
        // As this Stream is an Unordered, takeWhile() method returns first two elements which matches our Predicate

      /*That means takeWhile() returns all prefixed elements until they match Predicate condition.
        When that Predicate returns false for first element, then it stops evaluation and returns that subset elements.
        That Predicate is evaluated until that returns false for first time.*/
    }
}
