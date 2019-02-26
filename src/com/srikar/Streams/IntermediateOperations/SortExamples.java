package com.srikar.Streams.IntermediateOperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Srikar on Feb, 2019
 */

/* In Java 8, each Stream class represents a single-use sequence of data and supports several I/O operations.
*  Whenever a terminal operation is called on a Stream object, the instance gets consumed and closed.
   Therefore, we’re only allowed to perform a single operation that consumes a Stream, otherwise,
   we’ll get an exception that states that the Stream has already been operated upon or closed.
*  Simply put, the solution consists of creating a new Stream each time we need one.
   We can, of course, do that manually, but that’s where the Supplier functional interface becomes really handy.
*/


/*
* sorted:
    Let’s start with the sorted() operation – this sorts the stream elements based on the comparator passed we pass into it.

    Note that short-circuiting will not be applied for sorted().

    This means, in the example above, even if we had used findFirst() after the sorted(), the sorting of all the elements is done before applying the findFirst().
    This happens because the operation cannot know what the first element is until the entire stream is sorted.
 */
public class SortExamples {

    public static void main(String [] args){
        Supplier<Stream<String>> streamSupplier
                = () -> Stream.of("kartik", "kriti", "Jane Doe", "weller", "Steve", "Jason");
        List<String> names1 = streamSupplier.get().map(String::toLowerCase).sorted().collect(Collectors.toList());
        System.out.println(names1);
        List<String> names2 = streamSupplier.get().map(String::toLowerCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(names2);
    }
}
