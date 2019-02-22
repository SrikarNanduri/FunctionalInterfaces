package com.srikar.Streams.TerminalOperations;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FindFirstExample {
    public static void main(String[] args){
        Supplier<Stream<String>> streamOfString = () -> Stream.of("Hello", "Kate", "John", "samantha", "Snow");
        System.out.println(streamOfString.get().filter(s -> s.toLowerCase().startsWith("s")).findFirst().get());
    }
}
