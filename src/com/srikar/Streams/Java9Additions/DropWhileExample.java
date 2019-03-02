package com.srikar.Streams.Java9Additions;


import java.util.stream.Stream;

/*In Stream API, dropWhile() Method drops the longest prefix elements which matches the Predicate and returns the rest of elements.

It takes a Predicate as an argument. A Predicate is Boolean expression which returns either true or false.
It behaves differently for Ordered and Unordered Streams. Let us explore them with some simple examples below.


default Stream<T> dropWhile(Predicate<? super T> predicate)


If Stream is an Ordered, then dropWhile method drops the longest prefix elements which matches that Predicate and returns the rest of elements.
The resulted Stream contains all elements except those prefixed elements which matches the Predicate condition.
*/
public class DropWhileExample {
    public static void main(String [] args){

        Stream<Integer> orderedStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        orderedStream.dropWhile(x -> x < 4).forEach(System.out::println); // 4 5 6 7 8 9 10

        //As this Stream is an Ordered, dropWhile() method drops first three elements which matches our Predicate and returns rest of the elements into resulted Stream.
        // Here our Predicate is that “Element must be less than 4”.

        Stream<Integer> unorderedStream = Stream.of(1,2,4,5,3,6,7,8,9,10);
        unorderedStream.dropWhile(x -> x < 4).forEach(System.out::println); // 4 5 3 6 7 8 9 10

        //As this Stream is an Unordered, dropWhile() method drop first two elements only which matches our Predicate and returns rest of the elements into resulted Stream.
        //
        //That means dropWhile() first drops all prefixed elements until they match Predicate condition.
        // When that Predicate returns false for first element, then it stops evaluation and returns the rest of subset elements into resulted Stream.
    }
}
