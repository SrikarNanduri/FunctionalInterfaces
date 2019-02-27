package com.srikar.Streams.Java9Additions;


import java.util.stream.IntStream;

/*
* In Stream API, iterate() returns a Stream of elements which start with initialValue (first parameter), matches the Predicate (2nd parameter) and generate next element using 3rd parameter.
*
* static <T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
*
* It is similar to for-loop: First parameter is init value, next parameter is condition and final parameter is to generate next element (for instance, increment or decrement operation).
* */
public class IterateExample {
    public static void main(String [] args){
        IntStream.iterate(2, x -> x < 20, x -> x * x).forEach(System.out::println);

        /*
        * Here Stream starts with element “2”, then perform condition “2 < 20" is true, prints value. In next iteration, increment value "2 * 2 = 4", check condition "4 < 20" is true, prints value. And so on until condition return false value.
        * Java SE 9's iterate() = Java SE 8's iterate() + Java SE 8's filter()
        * */

        /*Java SE 8: IntStream iterate and fileter Example:-*/
       // IntStream.iterate(2, x -> x * x).filter(x -> x < 20).forEach(System.out::println);
    }
}
