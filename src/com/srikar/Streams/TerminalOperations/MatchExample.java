package com.srikar.Streams.TerminalOperations;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class MatchExample {

    public static void main(String [] args){
       Supplier<Stream<Integer>> numbers = () -> Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Checks if there is 3 in the stream of numbers : " + numbers.get().anyMatch(i -> i == 3));
        System.out.println("Stream contains all elements less than 10? : " + numbers.get().allMatch(i -> i < 10));
        System.out.println("Stream doesn't contain 10? : " + numbers.get().noneMatch(i -> i == 10));
    }
}
