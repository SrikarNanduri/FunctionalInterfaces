package com.srikar.Streams.IntermediateOperations;


/**
 * Created by Srikar on Feb, 2019
 */

/*

We saw forEach() earlier in this section, which is a terminal operation.
However, sometimes we need to perform multiple operations on each element of the stream before any terminal operation is applied.
peek() can be useful in situations like this. Simply put, it performs the specified operation on each element of the stream and returns a new stream which can be used further.
peek() is an intermediate operation:

*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekExample {

    public static void main(String [] args){
        Stream<String> stringStream = Stream.of("Hey", "Hello", "World", "peek" );

        List<String> stringList =  stringStream.peek(System.out::println).collect(Collectors.toList());
    }
}
