package com.srikar.Streams.Java9Additions;

import java.util.stream.Stream;


/*
* In Stream API, ofNullable() returns a sequential Stream containing a single element, if non-null, otherwise returns an empty Stream.
*/
public class OfNullableExample {
    public static void main(String [] args){
        Stream<Integer> s = Stream.ofNullable(1);
        s.forEach(System.out::println);

        Stream<Integer> s2 = Stream.ofNullable(null);
        s2.forEach(System.out::println);
    }

}
